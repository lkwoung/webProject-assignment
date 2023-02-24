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
 * 사용자의 회원가입 처리 Servlet
 * 사용자가 입력한 정보를 jsp로부터 받아와 DB작업을 수행하고 성공여부에 따라 다른 화면을 출력해준다.
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
	
		//JSP로부터 정보 받아오기
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
		
		// userBean 객체에 정보 넣고 클래스 변수 set하기
		userBean new_User = new userBean();
		new_User.setName(user_name);
		new_User.setUser_id(user_id);
		new_User.setUser_pw(user_pw);
		new_User.setBirth(user_Birth);
		new_User.setGender(user_Gender);
		new_User.setContract(contract);
		
		// DB ServletContext 생성
		ServletContext sc = getServletContext();
		
		// 빈칸 없고 아이디가 중복되지 않으면  DB수행
		if((user_name!="")&&(user_id!="")&&(user_pw!="")&&(user_Birth!="")&&(user_Gender!="")&&(contract!="")) {
			if(user_DButil.checkID(sc, new_User)) {
				// DB insert함수 호출
				isCompleteUpload = user_DButil.insertDB(sc, new_User);
			}else {
				System.out.println("가입 실패");
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('아이디가 중복됬습니다.');");
				out.println("history.back();");
				out.println("</script>");
			}
		}

		// 성공 여부에 따라 출력화면 제어
		if(isCompleteUpload){
			System.out.println("가입 성공");
			response.sendRedirect("welcome.jsp");
		}
		else{
			System.out.println("가입 실패");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('입력란을 확인해주세요');");
			out.println("history.back();");
			out.println("</script>");

		}
	}

}
