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
		<head><title>�α��ο� ����</title></head>
		<body>
			���̵� KH08�� �ƴմϴ�.
		</body>
	</html>
<%
	}
%>