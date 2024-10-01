package web.mvc.controller;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class DeleteController implements Controller {

    public DeleteController() {
//        System.out.println("DeleteController.DeleteController");
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 삭제기능 -> service 호출
        System.out.println("DeleteController.handleRequest");

        ModelAndView mv=new ModelAndView();
        mv.setViewName("index.jsp");
        mv.setRedirect(true);

        return mv;
    }
}
