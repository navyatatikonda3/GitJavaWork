<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title align="center">select from students list</title>

</head>
<body>
	<form action="Program3Select" method="post">
		<h1 align="center">USER SELECT</h1>
		<table align="center">
			<tr>
				<td>Aadhar Id</td>
				<td><input type="text" name="aid"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="select"></td>
			</tr>
			<tr>
				<td align="center"><font color="red">${errormessage}</font></td>
			</tr>
		</table>
	</form>
</body>
</html>

