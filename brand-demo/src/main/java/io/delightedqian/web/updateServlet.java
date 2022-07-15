package io.delightedqian.web;

import io.delightedqian.pojo.Brand;
import io.delightedqian.service.BrandService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/updateServlet")
public class updateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");

        BrandService brandService = new BrandService();
//        获取数据
        String id1 = request.getParameter("id");
        String brandName = request.getParameter("brandName");
        String companyName = request.getParameter("companyName");
        String id = request.getParameter("ordered");
        String description = request.getParameter("description");
        String status = request.getParameter("status");
//        封装尾brand对象
        Brand brand = new Brand();
        brand.setId(Integer.parseInt(id1));
        brand.setBrandName(brandName);
        brand.setCompanyName(companyName);
        brand.setOrdered(Integer.parseInt(id));
        brand.setDescription(description);
        brand.setStatus(Integer.parseInt(status));

        brandService.update(brand);

        request.getRequestDispatcher("/brand-demo/selectAllServlet");
    }
}
