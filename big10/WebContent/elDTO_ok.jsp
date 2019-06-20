<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="dto" class="member.MemberDTO"/>
<jsp:setProperty property="*" name="dto"/>

<!-- MemberDTO의 get메소드 호출 -->
이름 : ${dto.name} <br>
나이 : ${dto.age } <br>
전화번호 : ${dto.tel} <br>
회사명 : ${dto.company }
</body>
</html>