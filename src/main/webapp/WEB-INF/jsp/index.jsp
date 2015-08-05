<%@ page pageEncoding="utf-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<link rel="shortcut icon" href="resources/images/favicon.ico">
<link rel="stylesheet" href="resources/bootstrap-datetimepicker.css">
<link rel="stylesheet" href="resources/bootstrap-dialog.css">
<link rel="stylesheet" href="resources/bootstrap-glyphicons.css">
<link rel="stylesheet" href="resources/pixeloid-univers.css">
<link rel="stylesheet" href="resources/pixeloid-main.min.css">
<link rel="stylesheet" href="resources/pixeloid-icheck.css">
<link rel="stylesheet" href="resources/net54.css">
<title>NET'54 Common CSS</title>
<!--[if lt IE 9]>
    <script src="resources/lib/html5shiv/html5shiv.min.js"></script>
    <script src="resources/lib/html5shiv/respond.min.js"></script>
  <![endif]-->
<script src="//net54.pixeloid.hu/assets/lib/modernizr/modernizr.js"></script>
</head>
<body>
	<div id="wrap">
		<div class="navbar navbar-default navbar-fixed-top">
			<%@include file="snippets/navbar.jspf"%>
		</div>
		<div class="container-fluid">
			<%@include file="snippets/buttons.jspf"%>
			<%@include file="snippets/typography.jspf"%>
			<%@include file="snippets/containers.jspf"%>
			<%@include file="snippets/tables.jspf"%>
			<%@include file="snippets/forms.jspf"%>
			<%@include file="snippets/navs.jspf"%>
			<%@include file="snippets/indicators.jspf"%>
			<%@include file="snippets/progress.jspf"%>
			<%@include file="snippets/dialogs.jspf"%>
		</div>
	</div>
	<%@include file="snippets/footer.jspf"%>

	<script src="//net54.pixeloid.hu/assets/lib/jquery/jquery.min.js"></script>
	<script
		src="//net54.pixeloid.hu/assets/lib/bootstrap/js/bootstrap.min.js"></script>
	<script src="//net54.pixeloid.hu/assets/lib/icheck/icheck.min.js"></script>
	<script>
		$(function() {
			formGeneral();
		});
	</script>
	<script src="//net54.pixeloid.hu/assets/js/main.min.js"></script>
</body>
</html>