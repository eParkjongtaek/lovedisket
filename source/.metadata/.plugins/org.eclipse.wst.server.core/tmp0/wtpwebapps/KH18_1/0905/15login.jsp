<%@ page contentType="text/html; charset=euc-kr" %>
<%
	String id = request.getParameter("memberId");
	if(id.equals("KH08"))
	{
		response.sendRedirect("./11requestInfo.jsp");
	}
	else
	{
%>
	<html>
		<head><title>로그인에 실패</title></head>
		<body>
			아이디가 KH08이 아닙니다.
		</body>
	</html>
<%
	}
%>