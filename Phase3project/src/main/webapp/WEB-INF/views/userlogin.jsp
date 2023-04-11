<%@ page language="java" contentType="text/html" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<!-- Font Awesome -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
	rel="stylesheet" />
<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"
	rel="stylesheet" />
<!-- MDB -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.2.0/mdb.min.css"
	rel="stylesheet" />

<!-- MDB -->
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.2.0/mdb.min.js"></script>

</head>
<body
	style="background-repeat: no-repeat; width: 99%; background-size: cover;"
	background="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSFCgX_aJBXaP9cj4mCGSdGnP5RO3Uo1JoEgiPpNsjvaQ&usqp=CAU&ec=48600112"">
	<section class="vh-100" style=""
		https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSNrDlnHRAuRFuRuBytQb6gMnMiK2Wbm0Z3TiYxiSVEEg&usqp=CAU&ec=48600112";">
		<div class="container py-5 h-100">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col-12 col-md-8 col-lg-6 col-xl-5">
					<div class="card shadow-2-strong" style="border-radius: 1rem;">
						<div class="card-body p-5 text-center">

							<h3 class="mb-5">User Login</h3>
							<h3 class="mb-5">
								<font style="color: green">${loginmsg}</font>
							</h3>
							<h3 class="mb-5">
								<font style="color: green">${regmsg}</font>
							</h3>
							<form action="usercheck">
								<div class="form-outline mb-4">
									<input name="email" type="email" id="typeEmailX-2"
										class="form-control form-control-lg" /> <label
										class="form-label" for="typeEmailX-2">Email</label>
								</div>

								<div class="form-outline mb-4">
									<input name="password" type="password" id="typePasswordX-2"
										class="form-control form-control-lg" /> <label
										class="form-label" for="typePasswordX-2">Password</label>
								</div>

								<!-- Checkbox -->


								<button class="btn btn-primary btn-lg btn-block" type="submit">Login</button>
								<br>
								<p>
									Don't have an account? <a href="userreg" class="link-info">Register
										here</a>
								</p>

								<hr class="my-4">
								</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>