<%@ page contentType="text/html; charset=euc-kr" %>
<html>
	<head>
		<title>�� ����</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
		<script type="text/javascript">
			$(function () {
				$("#move").click(function () {
						
					$("#form1").submit();
						
				});
			});
			
			function move_submit()
			{
				$("#form1").submit();
			}
			
		</script>
	</head>
	<body>
		���� �����͸� �Է��� �� "����" ��ư�� Ŭ���ϼ���.
		<hr>
		<form id="form1" action="./13viewParameter.jsp" method="post">
			�̸� : <input type="text" name="name" size="10"><br/>
			�ּ� : <input type="text" name="address" size="10"><br/>
			�����ϴ� ���� : 
				<input type="checkbox" name="pet" value="���ڹ�">��
				<input type="checkbox" name="pet" value="���ڹ�">��
				<input type="checkbox" name="pet" value="���ڹ�">��
			<br/>
			<input type="submit" value="����">
			<input id="move" type="button" value="��ư�� �̵��մϴ�." >
			<input type="button" value="��ư�� �̵��մϴ�2." onclick="javascript:move_submit();">

		</form>
	</body>
</html>