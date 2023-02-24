<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="user.*" %>
<html>

<head>
 <link rel="stylesheet" href="../css/manageView.css">
<link href="https://fonts.googleapis.com/earlyaccess/hanna.css" rel="stylesheet" type="text/css" />
<title>회원 목록 조회</title>
<style>
      table {
      margin: 80px auto;
       width: 60%;
        border-top: 1px solid #444444;
        border-collapse: collapse;
      }
      th, td {
        border-bottom: 1px solid #444444;
        padding: 10px;
        text-align: center;
      }
      th {
      	background-color:#bbdefb;
      }
      td {
    background-color: #e3f2fd;
  }
    </style>

</head>


<body>
<%
	ServletContext sc = getServletContext();
	ArrayList<userBean> memberList = user_DButil.getUserList(sc);
%>

<div class="nav-header">
    <div class="nav-brand">
    <i class="fa fa-bars fa-3x"></i>
    <div class="header-links">
      <ul>
        <li data-menuanchor="fourthPage"><a href="../index.jsp">LOGOUT</a></li>
        <li data-menuanchor="thirdPage"><a href="../seat/userSeat.jsp">좌석</a></li>
        <li data-menuanchor="secondPage"><a href="../food/food_main_Admin.jsp">MENU</a></li>
      </ul>
    </div>
  </div>
  </div>

 <table>
      <thead>
        <tr>
          <th> </th><th>이름</th><th>ID명</th><th>Passward</th><th>생년월일</th><th>성별</th><th>남은시간</th><th>평생회원여부</th>
        </tr>
      </thead>
      <%      	
		for(int i=0; i<memberList.size(); i++){	
      		userBean user = memberList.get(i);
      		String time = user.getTime();
      		int t_time = Integer.parseInt(time);
      		int s_time = t_time%60;
      		int m_time = (t_time/60)%60;
      		int h_time = (t_time/60)/60;
      		if(h_time==0){
      			time = Integer.toString(m_time)+"분"+Integer.toString(s_time)+"초";
      		}else{
      			time = Integer.toString(h_time)+"시간"+Integer.toString(m_time)+"분"+Integer.toString(s_time)+"초";
      		}
      %>
      <tbody>
      <%--반복문으로 하시면 됩니다. --%>
        <tr>
          <td><%=user.getNum()%></td>
          <td><%=user.getName()%></td>
          <td><%=user.getUser_id()%></td>
          <td><%=user.getUser_pw()%></td>
          <td><%=user.getBirth()%></td>
          <td><%=user.getGender()%></td>
          <td><%=time%></td>
          <td><%=user.getContract()%></td>
        </tr>
      </tbody>
      <%
		}
      %>
    </table>



<footer class="container">
<p>&copy; CheapPC</p>
</footer>
</body>

</html>