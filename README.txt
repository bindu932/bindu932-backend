<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Bindu's Webpage</title>
	<link rel="stylesheet" href="style.css">
</head>
<body>
	<header>
		<h1>Welcome to my Webpage</h1>
	</header>
	<nav>
		<ul>
			<li><a href="#">Home</a></li>
			<li><a href="#">About</a></li>
			<li><a href="#">Contact</a></li>
		</ul>
	</nav>
	<main>
		<section>
			<h2>About Me</h2>
			<p>I am Bindu, a learner and web development enthusiast.</p>
		</section>
	</main>
	<footer>
		<p>Bindu | 9885360431</p>
	</footer>
</body>
</html>

CSS (in style.css file):

body {
	font-family: Arial, sans-serif;
	margin: 0;
	padding: 0;
	background-color: #fff;
}

header {
	background-color: #333;
	color: #fff;
	padding: 20px;
	text-align: center;
}

nav ul {
	list-style: none;
	margin: 0;
	padding: 0;
	background-color: #555;
	color: #fff;
}

nav li {
	display: inline-block;
	margin-right: 20px;
}

nav a {
	color: #fff;
	text-decoration: none;
}

main {
	display: flex;
	flex-direction: column;
	align-items: center;
	padding: 20px;
}

section {
	background-color: #fff;
	padding: 20px;
	margin: 20px;
	border: 1px solid #ddd;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

footer {
	background-color: #333;
	color: #fff;
	padding: 10px;
	text-align: center;
	clear: both;
}

