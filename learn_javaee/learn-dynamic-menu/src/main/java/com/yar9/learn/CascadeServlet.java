package com.yar9.learn;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yar9.learn.fake.StreetService;
import com.yar9.learn.model.District;
import com.yar9.learn.model.Street;

@WebServlet("/cascade")
public class CascadeServlet extends HttpServlet{

    /**
	 * 
	 */
	private static final long serialVersionUID = -7740288544754774302L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        int id =Integer.parseInt(req.getParameter("id"));
        District district=new District();
        district.setId(id);
        
        /*
         * StreetService  ssΪ�������ݿ�Ķ���.
         * ���øö����getAllStreet()���������Դ����ݿ���ȡ�����е�������Ϣ����װΪList<Street>���󣬲����ء�
         * ����Street�����ݿ�Street���ʵ���� 
         * Ϊ�˰��ص����Ajax�ͼ����˵���ʵ���ϣ�����ʡ���˲������ݿ�Ĵ��룡����
         */
        StreetService ss=new StreetService();
        List<Street> streets=ss.getAllStreet(district);
        //�ѵõ��Ľֵ����󼯺�ƴ�ӳ��ַ����ı�
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<streets.size();i++){
            sb.append(streets.get(i).getId()).append("=").append(streets.get(i).getName());
            if(i!=streets.size()-1){
                sb.append(",");
            }
        }
        //servlet��ת����ض����κ�ҳ�棬ʹ��resp.getWriter().print()�������԰��ı���Ӧ��XMLHttpRequest����
         PrintWriter out = resp.getWriter();
         out.print(sb.toString());
         out.flush();
         out.close();
    }
    
}