<%@ page contentType="text/html; charset=euc-kr" %>
<html>
	<head><title>1-100000������ ��</title></head>
	<body>
	<%
		int sum = 0;
		for(int i=1; i<=10000; i++)
		{
			sum = sum + i;
		}
	%>
	1���� 10000������ ���� <%=sum %>�Դϴ�.
	</body>
</html>