<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main</title>
</head>
<body>
	<h1>Options de contacts</h1>

	<form action="CreateContact.jsp">
   		<input class="button" type="submit" value="Créer" />
	</form>
	<form action="ReadContact.jsp">
   		<input class="button" type="submit" value="Visualiser" />
	</form>
	<form action="UpdateContact.jsp">
   		<input class="button" type="submit" value="Mettre à jour" />
	</form>
	<form action="DeleteContact.jsp">
   		<input class="button" type="submit" value="Supprimer" />
	</form>
		
</body>
</html>