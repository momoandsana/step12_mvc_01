<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h2>MVC Refactoring & Reflection TEST </h2>
 
 <h3>
    회원관리 - UserController <p>
    <a href="${path}/front?key=user&methodName=login">로그인하기</a><p>
    <a href="${path}/front?key=user&methodName=update">회원정보수정</a><p>
 </h3>
 
 <hr>
  <h3>
    상품관리 - GoodsController <p>
    <a href="${path}/front?key=goods&methodName=list">상품 LIST</a><p>
    <a href="${path}/front?key=goods&methodName=insert">상품등록</a><p>
 </h3>
 
 <hr>
 
 <h3>
    게시판관리 - BoardController <p>
    <a href="${path}/front?key=board&methodName=list">게시판 LIST</a><p>
    <a href="${path}/front?key=board&methodName=read">상세보기</a><p>
 </h3>

<h3>
    장바구니관리 - CartController <p>
    <a href="${path}/front?key=cart&methodName=insert">장바구니등록</a><p>
    <a href="${path}/front?key=cart&methodName=select">장바구니조회</a><p>
    <br>

    주문관리 - OrderController <p>
    <a href="${path}/front?key=order&methodName=selectAll">주문조회</a><p>
    <a href="${path}/front?key=order&methodName=insert">주문등록</a>

</h3>


</body>
</html>