package io.delightedqian.web;

import io.delightedqian.pojo.Brand;
import io.delightedqian.service.BrandService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/selectByIdServlet")
public class SelectByIdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//       获取brandService对象
        BrandService brandService = new BrandService();
//        获取页面传来的id值
        String id = request.getParameter("id");
//        调用方法
        Brand brand = brandService.selectById(Integer.parseInt(id));
//        封装到request域种
        request.setAttribute("brand",brand);
//        转发
        request.getRequestDispatcher("update.jsp").forward(request,response);
    }
}
