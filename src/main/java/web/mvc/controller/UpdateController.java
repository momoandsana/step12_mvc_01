package web.mvc.controller;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class UpdateController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 수정기능 -> service 호출
        System.out.println("UpdateController.handleRequest");

        request.setAttribute("message", "수정결과 정보입니다");

        return new ModelAndView("updateResult.jsp"); // ${message}
    }
}
