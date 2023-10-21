<!DOCTYPE html>
<html>
<head>
<title></title>
</head>
<body>
	<%! String makeItLower(String data){
		return data.toLowerCase();
	}
	%>
	<%
		out.println(makeItLower("Hello Mark"));
	%>
</body>
</html>