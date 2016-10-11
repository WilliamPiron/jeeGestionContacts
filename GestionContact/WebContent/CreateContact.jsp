<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="POST" action="CreateContact">
		<h1>Création de contact</h1>
		<table>
			<tr>
				<td><i>Identifiant : <input type="text" name="id" size="25"></i></td>
			</tr>
			<tr>
				<td><i>Nom : <input type="text" name="nom" size="25"></i></td>
			</tr>
			<tr>
				<td><i>Prénom : <input type="text" name="prenom" size="25"></i></td>
			</tr>
			<tr>
				<td><i>Email : <input type="text" name="mail" size="25"></i></td>
			</tr>
			<tr>
				<td><i><input class="button" type="submit" value="Valider" size="25"></i></td>
			</tr>
		</table>
	</form>
</body>
</html>