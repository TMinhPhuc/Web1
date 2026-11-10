<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="styles/index.css" type="text/css">
</head>
<body>
	<div class="container">
		<h2>Survey Result</h2>
		<div class="row">
			<label>Email:</label>
			<span>${survey.user.email}</span>
		</div>
		<div class="row">
			<label>First Name:</label>
			<span>${survey.user.firstName}</span>
		</div>
		<div class="row">
			<label>First Name:</label>
			<span>${survey.user.firstName}</span>
		</div>
		<div class="row">
			<label>Last Name:</label>
			<span>${survey.user.lastName}</span>
		</div>
		<div class="row">
			<label>Hear from:</label>
			<span>${survey.hearFrom}</span>
		</div>
		<div class="row">
			<label>YES, I'd like that:</label>
			<span>${survey.likeReceiveAnnoucement}</span>
		</div>
		<div class="row">
			<label>YES, please send me announcements:</label>
			<span>${survey.sendAnnouncement}</span>
		</div>
		<div class="row">
			<label>Contact method:</label>
			<span>${survey.contactMethod}</span>
		</div>
	</div>
	
</body>
</html>