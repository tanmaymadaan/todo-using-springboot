<%@ include file="commons/header.jspf"%>
<%@ include file="commons/navigation.jspf"%>
<div class="container">
	<form method="post">
		Welcome ${name}! <a href="/list-todos">Click here</a> to manage your
		Todos!
	</form>
</div>
<%@ include file="commons/footer.jspf"%>