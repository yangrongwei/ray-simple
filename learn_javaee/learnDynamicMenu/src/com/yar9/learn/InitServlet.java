package com.yar9.learn;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yar9.learn.fake.DistrictService;
import com.yar9.learn.model.District;

/**
 * Servlet implementation class InitServlet
 */
//@WebServlet("/InitServlet")
public class InitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException ,IOException {
    	doPost(req, resp);
    };
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException ,IOException {
    	req.setCharacterEncoding("UTF-8");
	        resp.setCharacterEncoding("UTF-8");
	        /*
	         * DistrictService  dsΪ�������ݿ�Ķ���.
	         * ���øö����getAllDistrict()���������Դ����ݿ���ȡ�����е�������Ϣ����װΪList<District>���󣬲����ء�
	         * ����District�����ݿ�District���ʵ���� 
	         * Ϊ�˰��ص����Ajax�ͼ����˵���ʵ���ϣ�����ʡ���˲������ݿ�Ĵ��룡����
	         */
	        DistrictService ds = new DistrictService();
	        List<District> districts = ds.getAllDistrict();
	        //List<District>�������request��Χ�У���ת����ҳ
	        req.setAttribute("districts", districts);
	        req.getRequestDispatcher("index.jsp").forward(req, resp);	}

}
