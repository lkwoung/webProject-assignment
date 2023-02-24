package user;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class User_ControllerServlet
 * ������� ȸ������ ó�� Servlet
 * ����ڰ� �Է��� ������ jsp�κ��� �޾ƿ� DB�۾��� �����ϰ� �������ο� ���� �ٸ� ȭ���� ������ش�.
 */
public class User_ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public User_ControllerServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean isCompleteUpload=false;
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
	
		//JSP�κ��� ���� �޾ƿ���
		String user_name = request.getParameter("name");
		String user_id = request.getParameter("id");
		String user_pw = request.getParameter("password");
		String user_YYYY = request.getParameter("yyyy");
		String user_MM = request.getParameter("mm");
		String user_DD = request.getParameter("dd");
		String user_Gender = request.getParameter("gender");
		String contract = request.getParameter("contract");
		
		String user_Birth = user_YYYY+user_MM+user_DD;
		
		System.out.println(user_id);
		
		// userBean ��ü�� ���� �ְ� Ŭ���� ���� set�ϱ�
		userBean new_User = new userBean();
		new_User.setName(user_name);
		new_User.setUser_id(user_id);
		new_User.setUser_pw(user_pw);
		new_User.setBirth(user_Birth);
		new_User.setGender(user_Gender);
		new_User.setContract(contract);
		
		// DB ServletContext ����
		ServletContext sc = getServletContext();
		
		// ��ĭ ���� ���̵� �ߺ����� ������  DB����
		if((user_name!="")&&(user_id!="")&&(user_pw!="")&&(user_Birth!="")&&(user_Gender!="")&&(contract!="")) {
			if(user_DButil.checkID(sc, new_User)) {
				// DB insert�Լ� ȣ��
				isCompleteUpload = user_DButil.insertDB(sc, new_User);
			}else {
				System.out.println("���� ����");
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('���̵� �ߺ�����ϴ�.');");
				out.println("history.back();");
				out.println("</script>");
			}
		}

		// ���� ���ο� ���� ���ȭ�� ����
		if(isCompleteUpload){
			System.out.println("���� ����");
			response.sendRedirect("welcome.jsp");
		}
		else{
			System.out.println("���� ����");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('�Է¶��� Ȯ�����ּ���');");
			out.println("history.back();");
			out.println("</script>");

		}
	}

}
