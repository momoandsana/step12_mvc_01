package web.mvc.controller;



import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * 모든 요청을 중앙 집중적으로 관리해줄 진입점 controller = FrontControlller 이다
 */

@WebServlet(loadOnStartup=1,urlPatterns="/front")
public class DispatcherServlet extends HttpServlet {

    private Map<String,Controller> map;
    private Map<String,Class<?>> classMap;

    @Override
    public void init(ServletConfig config) throws ServletException {
        // application 영역에 저장된 정보를 조회 -> map 을 통해
        ServletContext application = config.getServletContext();

        map=(Map<String,Controller>) application.getAttribute("map"); // object 로 리턴하니까 다운캐스팅

        classMap=(Map<String,Class<?>>) application.getAttribute("classMap");
        /*
        HandleMappingListener 에서 올린 정보들 쓰는 중
         */


    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 전송된 key 받기
        String key=request.getParameter("key");
        System.out.println("key = " + key);

        String methodName=request.getParameter("methodName");


        ModelAndView mv=null;
        try
        {
            Controller con=map.get(key);
            Class<?> className = classMap.get(key);
            Method method = null;
            method = className.getMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
            // 이러한 함수를 호출할거라고 선언만
            mv = (ModelAndView)method.invoke(method, request, response);

        }
        catch (NoSuchMethodException e)
        {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }


        if(mv.isRedirect())
        {
            response.sendRedirect(mv.getViewName());
        }
        else
        {
            // forward 하는 경우
            request.getRequestDispatcher(mv.getViewName()).forward(request,response);
        }
    }
}
