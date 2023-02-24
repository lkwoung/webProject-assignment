<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
  <script src="https://use.fontawesome.com/releases/v5.2.0/js/all.js"></script>
  <title>cheap PC Join</title>
  <link rel="stylesheet" href="../css/join.css">
  <link href="https://fonts.googleapis.com/earlyaccess/hanna.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="container">
  <form name=joinform style="font-family:'Hanna', sans-serif;" action="user_join">
    <div class="row">
      <h4>Account</h4>
      <div class="input-group input-group-icon">
        <input type="text" name="name" placeholder="Name" style="font-family:'Hanna', sans-serif;"/>
        <div class="input-icon"><i class="fa fa-user"></i></div>
      </div>
      <div class="input-group input-group-icon">
        <input type="text" name="id" placeholder="ID" style="font-family:'Hanna', sans-serif;"/>
        <div class="input-icon"><i class="fa fa-star"></i></div>
      </div>
      <div class="input-group input-group-icon">
        <input type="password" name="password" placeholder="Password" style="font-family:'Hanna', sans-serif;"/>
        <div class="input-icon"><i class="fa fa-key"></i></div>
      </div>
    </div>
    <div class="row">
      <div class="col-half">
        <h4>Date of Birth</h4>
        <div class="input-group">
          <div class="col-third">
            <input type="text" name="dd" placeholder="DD"/>
          </div>
          <div class="col-third">
            <input type="text" name="mm" placeholder="MM"/>
          </div>
          <div class="col-third">
            <input type="text" name="yyyy" placeholder="YYYY"/>
          </div>
        </div>
      </div>
      <div class="col-half">
        <h4>Gender</h4>
        <div class="input-group">
          <input type="radio" name="gender" value="male" id="gender-male"/>
          <label for="gender-male">Male</label>
          <input type="radio" name="gender" value="female" id="gender-female"/>
          <label for="gender-female">Female</label>
        </div>
      </div>
    </div>
    <div class="row">
      <h4>싸다구 평생 회원</h4>
      <div class="input-group">
        <input type="checkbox" name="contract" value="yes" id="terms" />
        <label for="terms" style="font-family:'Hanna', sans-serif;">싸다구 평생 회원에 동의합니다. 회원 혜택 만빵!!</label>
      </div>
    </div>
      <button type="submit" style="font-family:'Hanna', sans-serif; backroung-color:#F93738; position:absolute; bottom:2%; width:90px; padding:10px; height:50px; left:46%;">가입하기</button>
  </form>
  </div>

<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
</body>