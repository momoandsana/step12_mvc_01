package web.mvc.listener;


import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

import java.util.ResourceBundle;

public class HandleMappingListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {

        // 외부의 ~.properties 파일 로딩, properties 자동으로 가지고 옴
        ResourceBundle rb=ResourceBundle.getBundle("actionMapping");

        for (String key : rb.keySet()) {
            String value = rb.getString(key);
        }
        System.out.println("HandleMappingListener.contextInitialized");
    }
}