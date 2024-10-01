package web.mvc.listener;


import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import web.mvc.controller.Controller;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

@WebListener
public class HandleMappingListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Map<String,Controller> map=new HashMap<String,Controller>();


        // 외부의 ~.properties 파일 로딩, properties 자동으로 가지고 옴
        ResourceBundle rb=ResourceBundle.getBundle("actionMappingListener");

        try
        {
            for (String key : rb.keySet())
            {
                String value = rb.getString(key);
//                System.out.println("key = " + value);

                Class.forName(value);
                Class<?> className = Class.forName(value);

                Controller con=(Controller)className.getDeclaredConstructor().newInstance();
                System.out.println("key = " + value + " / " + con);

                map.put(key,con);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        // map 을 application 영역에 저장한다, was 를 내리기 전까지 계속 유지-> 전체 어디서든 사용 가능
        ServletContext application = sce.getServletContext();
        application.setAttribute("map",map);
        application.setAttribute("path",application.getContextPath());

        System.out.println("HandleMappingListener.contextInitialized");
    }
}