package web;

import java.sql.*;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener {
	Connection conn;
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// ServletContextListener�� ���� �ڿ��̳� ������ �̸� ���ε��ؼ� ���������� �����Ͽ� ���
		ServletContext sc = sce.getServletContext();
		
		String temp = sc.getInitParameter("dbURL");
		String url = temp + "?&useSSL=false&serverTimezone=UTC"; // DB���� ������ �߰�
		String id = sc.getInitParameter("dbID");
		String pw = sc.getInitParameter("dbPW");
		try{
			// ����̹��� �ε��ϰ� �����ͺ��̽��� �������ش�. 
			Class.forName(sc.getInitParameter("dbDriver"));
			// Ư�� �����ͺ��̽����� ������ ���
			conn = DriverManager.getConnection(url, id, pw);
			
			// �̸��� name�� �Ӽ��� ���� value�� ����
			if (conn != null)
				sc.setAttribute("DBconnection", conn);
					
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void contextDestroyed(ServletContextEvent sce) {
		try {
			conn.close();
		}catch(SQLException e) {
			
		}
	}
}