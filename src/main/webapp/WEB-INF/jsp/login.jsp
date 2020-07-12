<%@ include file="commons/header.jspf"%>
<%@ include file="commons/navigation.jspf"%>
<div class="container">
	<font color="red"> ${errorMessage}</font>
	<form method="post">
		Name: <input type="text" name="name" /> Password: <input
			type="password" name="password" /> <input type="submit" />
	</form>
</div>
<%@ include file="commons/footer.jspf"%>