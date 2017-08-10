<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
</head>

<body>
<input type="button" id = "home_btn" value="홈버튼" 
onclick="javascript:location.href='/recipe/';">

<input type="button" id = "upload_btn" name="upload_btn" 
onclick ="javascript:location.href='/recipe/board/upload';" value="업로드">

<input type="button" id = "bookmark_btn" name="bookmark_btn" value="즐겨찾기">

<input type="button" id = "ref_btn" name="ref_btn" 
onclick ="javascript:location.href='/recipe/board/myRef';" value="냉장고">


<input type="button" id = "loginModal_btn" name="loginModal_btn" 
value="로그인모달">


<br><br><br>
<form method="get" action="/recipe/board/result">
<input type="text" name = "search_txt" placeholder="검색어">
<input type="submit" id = "search_btn" name="search_btn" value="search">
</form>
<br><br><br>

<form method="POST" action="/recipe/board/login">
<input type="text" id = "login_txt" name="login_txt" placeholder="아이디">
<input type="text" id = "pwd_txt" name="pwd_txt" placeholder="패스워드">
<input type="submit" id = "login_btn" name="login_btn" value="로그인">
</form>
<br><br><br>

<form method="POST" action="/recipe/board/signup">
<input type="text" id = "id_signup_txt" name="id_signup_txt" placeholder="아이디">
<input type="text" id = "pwd_signup_txt" name="pwd_signup_txt" placeholder="패스워드">
<input type="submit" id = "signup_btn" name="signup_btn" value="회원가입">
</form>

<input type="button" id = "kakao_btn" name="kakao_btn" value="카카오">
<input type="button" id = "facebook_btn" name="facebook_btn" value="페이스북">
<input type="button" id = "google_btn" name="google_btn" value="구글">
<input type="button" id = "naver_btn" name="naver_btn" value="네이버">
<br><br><br>

<input type="button" id = "categoryA_btn" name="categoryA_btn" value="1">
<input type="button" id = "categoryB_btn" name="categoryB_btn" value="2">
<input type="button" id = "categoryC_btn" name="categoryC_btn" value="3">
<input type="button" id = "categoryD_btn" name="categoryD_btn" value="4">





<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

</body>
</html>