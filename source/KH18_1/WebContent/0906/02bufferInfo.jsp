<%@ page contentType="text/html; charset=euc-kr" %>
<%@ page buffer="10kb" autoFlush="false" %>
<html>
	<head><title>���� ����</title></head>
	<body>
		���� ũ�� : <%=out.getBufferSize() %>
		���� ũ�� : <%=out.getRemaining() %>		
		auto flush : <%=out.isAutoFlush() %>
	</body>
</html>