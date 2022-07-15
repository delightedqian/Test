package io.delightedqian.web;

import io.delightedqian.pojo.Brand;
import io.delightedqian.service.BrandService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectAllServlet")
public class selectAllServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        获取brands对象
        BrandService brandService = new BrandService();
        List<Brand> brands = brandService.selectAll();

//       存入到request域中
        request.setAttribute("brands",brands);

//        转发
        request.getRequestDispatcher("brand.jsp").forward(request,response);

    }
}
