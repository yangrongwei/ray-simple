
��������ı����������ӣ����Ľ���Ĳ������Ա㲻ʹ�����ݿ�չ�ֺ��ĸ������̬�˵���
�д����������������ݽ����е㶫����

http://www.cnblogs.com/likailan/p/3328761.html
  Ajaxʵ�ֶ�̬�Ķ��������˵� (JavaScript + JSP)

http://www.cnblogs.com/zgqys1980/archive/2007/11/13/957653.html
  JavaScript ������������ο�

------------------  
ԭ�Ĵ����г����ˣ���û�б��õ��� @WebServlet("/InitServlet")
����ԭ�Ĵ�����Ҫ  Servlet 3.0 ���ڼ��д����Ͻ����� Servlet 2.5 ���Ա������� Tomcat 6.0 �ϣ����������޸�

o �� web.xml <web-app>
o �� http://stackoverflow.com/questions/75786/eclipse-how-can-i-change-a-project-facet-from-tomcat-6-to-tomcat-5-5
o ��ԭ�����������ע�͵�  �������Ǵ������У��������� ������ Eclipse �������Ե� Project Facets ��ֱ�Ӹģ���

�ɹ�. ����  @WebServlet �Ƿ����õģ����Լ��� web.xml �зѾ������ã�

Raymond 2014/6/15


<!-- 
Raymond: About version of web.xml
 http://stackoverflow.com/questions/15334776/where-i-can-find-valid-values-for-the-version-attribute-of-the-web-app-element-i
 http://en.wikipedia.org/wiki/Java_Servlet#History
  3.0, 2.5, 2.4, 2.3, 2.2, 2.1, 2.0, 1.0

For version 2.5
 http://docs.oracle.com/cd/E13222_01/wls/docs100/webapp/web_xml.html
  The correct text for the namespace declaration and schema location for the web.xml file is as follows.
  ....
 -->

ʹ�� Servlet 3.0 ����Ϊ���������ҵ�����Ϊ Jave EE��b��׼��
 	  <dependency>
		<groupId>javax.servlet</groupId>
		<artifactId>javax.servlet-api</artifactId>
		<version>3.0.1</version>
	</dependency>