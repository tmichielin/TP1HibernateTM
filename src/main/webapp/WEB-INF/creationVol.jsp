<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Creation vol</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>
</head>
<body>

	<form method="post">
		<h1>Formulaire ajout vol</h1>
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Nom
				compagnie Aérienne</label> <input type="text" name="Nom" required="required"
				class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp">
		</div>

		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">nombre de
				vols à ajouter</label> <input type="number" name="nombreVols"
				required="required" class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp">
		</div>
		<button onclick="ajouterVols()">Ajouter les vols</button>

		<script>
			function ajouterVols() {
				var nombreVols = parseInt(document
						.getElementsByName("nombreVols")[0].value);
				for (var i = 1; i <= nombreVols; i++) {
					// Ajouter le code ici pour ajouter un vol
					var volDiv = document.createElement("div");
					volDiv.innerHTML = "Vol " + i ;
					document.body.appendChild(volDiv);
				}
			}
		</script>

		<button type="submit" class="btn btn-primary">Submit</button>
		<button type="reset" class="btn btn-danger">Annuler</button>
	</form>

</body>
</html>