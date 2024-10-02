package web.mvc.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;

/**
 * 상품 관리를 위한 Controller
 */
public class CartController implements Controller {
    /**
     * 굿즈 list
     */
    public ModelAndView select(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("CartController.select");
        // 서비스 호출하고 결과를 받는다

        request.setAttribute("cartList", Arrays.asList("cart1","cart2","cart3"));

        return new ModelAndView("cart/list.jsp",false); // request 저장했으니까 forward 방식

    }


    /**
     * 추가
     *
     */

    public ModelAndView insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("CartController.insert");
        //서비스 호출한 후

        return new ModelAndView("cart/registerOk.jsp",true); // 가지고 가는 데이터가 없으니까 리다이렉트

    }
}
