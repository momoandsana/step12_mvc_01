package web.mvc.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteController implements Controller {

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
