package web.mvc.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;

/**
 * 상품 관리를 위한 Controller
 */
public class GoodsController implements Controller {
    /**
     * 굿즈 list
     */
    public ModelAndView list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("BoardController.list");

        // 서비스 호출하고 결과를 받는다

        request.setAttribute("goodsList", Arrays.asList("새우깡","감자깡","콘칩"));

        return new ModelAndView("goods/list",false); // request 저장했으니까 forward 방식

    }


    /**
     * 추가
     *
     */

    public ModelAndView insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("GoodsController.insert");
        //서비스 호출한 후

        return new ModelAndView("goods/registerOk.jsp",true); // 가지고 가는 데이터가 없으니까 리다이렉트

    }
}
