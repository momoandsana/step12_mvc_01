package web.mvc.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SelectController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 검색기능 -> service 호출
        System.out.println("SelectController.handleRequest");

        request.setAttribute("message", "검색된 결과정보입니다");



        return new ModelAndView("selectResult.jsp"); // ${message}
    }
}
