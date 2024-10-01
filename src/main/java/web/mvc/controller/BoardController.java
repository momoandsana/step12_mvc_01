package web.mvc.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * 게시판 관리를 위한 Controller
 */
public class BoardController implements Controller {
    /**
     * 게시판 list, key 가 다르니까 다른 곳에 list 함수 있어도 돼
     */
    public ModelAndView list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("BoardController.list");

        // 서비스 호출하고 결과를 받는다
        request.setAttribute("message","게시판 조회완료");

        return new ModelAndView("board/list",false); // request 저장했으니까 forward 방식

    }


    /**
     * 상세보기
     *
     */

    public ModelAndView read(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("BoardController.read");

        //서비스 호출한 후

        return new ModelAndView("board/read.jsp",true); // 가지고 가는 데이터가 없으니까 리다이렉트

    }
}
