<%@page import="food.*"%>
<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.ArrayList" %>


<html>

<head>
   <title>PC방 음식메뉴 목록</title>

   <style type="text/css">
     table {
      margin: 70px auto;
       width: 100%;
      }
      th, td {
      padding:20px;
        text-align: center;
      }
      h6{
      font-size:4rem;
      color:yellow;
      }
      h7{
      font-size:3rem;
      color:rgb(159,201,60);}
      h8{
      font-size:2rem;
      color:rgb(255,255,255);}
      dis{
      font-size:2rem;
      color:rgb(255,255,255);
      }
   </style>

    <link rel="stylesheet" href="../css/manageView.css">
     <link href="https://fonts.googleapis.com/earlyaccess/hanna.css" rel="stylesheet" type="text/css" />
     

</head>

<body>   
<div class="nav-header">
    <div class="nav-brand">
    <i class="fa fa-bars fa-3x"></i>
    <div class="header-links">
      <ul>
        <li data-menuanchor="thirdPage"><a href="../login/logoutAction.jsp">LOGOUT</a></li>
        <li data-menuanchor="secondPage"><a href="../seat/userSeat_Admin.jsp">좌석</a></li>
        <li data-menuanchor="secondPage"><a href="food_insert.jsp">메뉴추가</a></li>
      </ul>
    </div>
  </div>
  </div>
   
	<% 
		ServletContext sc = getServletContext();
		ArrayList<foodBean> foodList = food_DButil.getFoodList(sc);
    %>   
   
   <table>
   <caption>
      <h6> 
      싸다구 메뉴
      </h7>
      <p> 
      맛있는 먹거리를 제공하는 싸다구는 언제나 가족이 먹을 수 있다는 마음으로 음식을 만들고 있습니다.<br>
      해당 페이지는 메뉴를 보여주는 페이지이며 실제 음식 주문은 PC방에서 가능합니다. 감사합니다.
      </h10>
      </caption>
      <tbody>
      
      <% 
		int idx = 0;
		int size = foodList.size();//arraylist의 크기
         
		for (int i =0; i<(size/3)+1; i++) {
      %>
      
        <tr>
      <% 
      	for (int j =0; j<3; j++) {
			if (idx >= size){
				break;
			}
			foodBean food = foodList.get(idx);
      %>

          <td>
          <img src = <%=food.getImage() %>
         style = " width: 300px;
           height: 300px;
           object-fit: cover;
                    "/>
         <p>
         <h7><b><%=food.getFood_Name()%></b></h7>
         <p>
         <p><%=food.getDescription()%>
         <p>   <% int a = food.getCode(); %>
         <h8><%=food.getPrice() %>원
         </td>
         <%
         idx++;   
      }
      %>
        </tr>
        <%
         }
      %>
      </tbody>
    </table>  

<footer class="container">
<p>&copy; 싸다구PC</p>
</footer>   
</body>

</html>