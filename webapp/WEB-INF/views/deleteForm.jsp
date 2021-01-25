<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<!DOCTYPE html>

	<html>
	
	<head>
		<meta charset="UTF-8">
		
		<title>DeleteForm</title>
		
		<script type="text/javascript">
		
			function fail(){
				
				alert("비밀번호가 틀렸습니다 다시 입력해주세요");
				
			}
		
		
		</script>
		
		
		
	</head>
	
	
	<body>
		<h3>방명록 삭제를 위해서 비밀번호를 확인합니다</h3>
		
		<!-- 버전1 -->
		<c:if test="${fail eq 0}">
			비밀번호가 틀렸습니다.<br> 
			다시 입력해주세요
			<br><br>
		</c:if>
		
		<!-- 버전2 -->
		
		<c:if test="${fail eq 0 }">
			
			<script>
			
				fail();
			
			</script>
			
		
		</c:if>
		
		
		
		
		<form action="${pageContext.request.contextPath}/guest/delete" method="get">
	
			비밀번호 : <input type="type" name="pw">  
			<input type="hidden" name="no" value="${param.no}"> <br>
			
			<button type="submit">확인</button>
			
		</form>
	
		<br>
		<br>
		<a href="${pageContext.request.contextPath}/guest/list">리스트로 돌아가기</a>
	</body>
</html>