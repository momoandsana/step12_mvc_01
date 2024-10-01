package web.mvc.controller;



import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Map;

/**
 * 모든 요청을 중앙 집중적으로 관리해줄 진입점 controller = FrontControlller 이다
 */

@WebServlet(loadOnStartup=1,urlPatterns="/front")
public class DispatcherServlet extends HttpServlet {

    private Map<String,Controller> map;

    @Override
    public void init(ServletConfig config) throws ServletException {
        // application 영역에 저장된 정보를 조회 -> map 을 통해
        ServletContext application = config.getServletContext();

        map=(Map<String,Controller>) application.getAttribute("map"); // object 로 리턴하니까 다운캐스팅


    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 전송된 key 받기
        String key=request.getParameter("key");
        System.out.println("key = " + key);

//        Controller con=null;
//
//        if(key.equals("insert"))
//        {
//            con=new InsertController();
//        }
//        else if(key.equals("select"))
//        {
//            con=new SelectController();
//        }
//        else if(key.equals("update"))
//        {
//            con=new UpdateController();
//        }
//        else if(key.equals("delete"))
//        {
//            con=new DeleteController();
//        }
//
        Controller con=map.get(key);
        ModelAndView mv=con.handleRequest(request,response);

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
