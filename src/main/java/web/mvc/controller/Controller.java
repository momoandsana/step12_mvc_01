package web.mvc.controller;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * 각 요청을 위임받아 요청을 처리해줄 공통의 메서드 제공
 */
public interface Controller {
    ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
