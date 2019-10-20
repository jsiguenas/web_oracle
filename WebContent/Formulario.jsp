<%@include file="include/header.jsp" %>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container mtb">
	<div class="row">
		<div class="col-lg-6">
			
		</div>
	</div>
</div>

  <h2>Ingrese Datos</h2>
  <form>
  <div class="form-group">
      <label for="email">Nombre:</label>
      <input type="email" class="form-control" id="nombre" placeholder="">
    </div>
    <div class="form-group">
      <label for="email">Apellido:</label>
      <input type="email" class="form-control" id="apellido" placeholder="">
    </div>
    <div class="form-group">
      <label for="email">DNI:</label>
      <input type="number" class="form-control" id="dni" placeholder="">
    </div>
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" placeholder="">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="">
    </div>
    <div class="checkbox">
      <label><input type="checkbox"> Remember me</label>
    </div>
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
</div>

<%@include file="include/footer.jsp" %>

</body>
</html>