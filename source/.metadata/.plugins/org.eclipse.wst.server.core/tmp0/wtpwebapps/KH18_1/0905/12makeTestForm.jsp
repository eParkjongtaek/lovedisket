<%@ page contentType="text/html; charset=euc-kr" %>
<html>
	<head>
		<title>폼 생성</title>
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
		폼에 데이터를 입력한 후 "전송" 버튼을 클릭하세요.
		<hr>
		<form id="form1" action="./13viewParameter.jsp" method="post">
			이름 : <input type="text" name="name" size="10"><br/>
			주소 : <input type="text" name="address" size="10"><br/>
			좋아하는 동물 : 
				<input type="checkbox" name="pet" value="엄자바">엄
				<input type="checkbox" name="pet" value="민자바">민
				<input type="checkbox" name="pet" value="식자바">식
			<br/>
			<input type="submit" value="전송">
			<input id="move" type="button" value="버튼은 이동합니다." >
			<input type="button" value="버튼은 이동합니다2." onclick="javascript:move_submit();">

		</form>
	</body>
</html>