<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="user.user_DButil" %>
<%@ page import="java.io.PrintWriter" %>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>싸다구 PC방</title>
</head>
<body>
	<%
		//세션 
    	String userID = null;
		if(session.getAttribute("userID")!= null){
			userID = (String) session.getAttribute("userID");
		}
		
		if (userID != null){ //이미 로그인해서 세션 존재할경우
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('이미 로그인이 되어있습니다.')");
			script.println("location.href = '../seat/userSeat.jsp'");
			script.println("</script>"); 
		}
		
		//아이디 패스워드 받아오기
		ServletContext sc = getServletContext();
		user_DButil user = new user_DButil();
		String name = request.getParameter("userID");
		String password = request.getParameter("userPassword");
		
		int result = user.login(sc, name, password);
		
		//성공 -> 좌석현황으로 이동
		if (result == 1){
			session.setAttribute("userID", name);
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("location.href = '../seat/userSeat.jsp'");
			script.println("</script>");
		}
		//실패 -> 메시지 출력
		else if (result == 0){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('비밀번호가 틀립니다.')");
			script.println("history.back()");
			script.println("</script>");
		}
		else if (result == -1){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('존재하지 않는 아이디입니다.')");
			script.println("history.back()");
			script.println("</script>");
		}
		else if (result == -2){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('데이터베이스 오류가 발생했습니다.')");
			script.println("history.back()");
			script.println("</script>");
		}
	%>
</body>
</html>