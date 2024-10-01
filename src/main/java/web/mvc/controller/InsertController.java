package web.mvc.controller;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class InsertController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 등록기능 -- 전송된 데이터 받기, dto 만들고 service 호출
        // --> 결과 받는다

        System.out.println("InsertController.handleRequest");

        ModelAndView mv = new ModelAndView("index.jsp",true);

        return mv;
    }
}
