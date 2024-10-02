package web.mvc.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;

/**
 * 상품 관리를 위한 Controller
 */
public class OrderController implements Controller {
    /**
     * 굿즈 list
     */
    public ModelAndView selectAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("OrderController.selectAll");
        // 서비스 호출하고 결과를 받는다

        request.setAttribute("orderList", Arrays.asList("order1","order2","order3"));

        return new ModelAndView("order/list.jsp",false); // request 저장했으니까 forward 방식

    }


    /**
     * 추가
     *
     */

    public ModelAndView insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("OrderController.insert");
        //서비스 호출한 후

        return new ModelAndView("order/registerOk.jsp",true); // 가지고 가는 데이터가 없으니까 리다이렉트

    }
}
