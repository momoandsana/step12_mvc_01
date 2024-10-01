package web.mvc.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * 회원관리 controller
 */
public class UserController implements Controller {
    /**
     * 로그인하기
     */
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("UserController.login");

        //로그인 기능 완료 후 ... 세션에 정보를 저장
        HttpSession session = request.getSession();
        session.setAttribute("sessionMessage","로그인 성공");

        return new ModelAndView("user/login.jsp", true); // 리다이렉션
    }

    /**
     * 회원정보수정
     */

    public ModelAndView update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("UserController.update");

        //회원정보수정을 완료한 후 이동
        request.setAttribute("message", "정보수정완료");

        return new ModelAndView("user/update.jsp", false); // 포워드
    }




}
