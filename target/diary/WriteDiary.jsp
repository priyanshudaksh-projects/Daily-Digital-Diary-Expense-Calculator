<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://fonts.googleapis.com/css?family=Kalam&display=swap"
	rel="stylesheet">
	<style>
body  {
  background-image: url("hi.jpg");
  background-color: #cccccc;
  background-size: cover;
}
</style>
<style type="text/css">
.form-style-5{
	max-width: 500px;
	padding: 10px 20px;
	background: #f4f7f8;
	margin: 10px auto;
	padding: 20px;
	background: #f4f7f8;
	border-radius: 8px;
	font-family: 'Kalam', cursive;
	font-style: italic;
}
.form-style-5 fieldset{
	border: none;
}
.form-style-5 legend {
	font-size: 1.4em;
	font-family: 'Kalam', cursive;
	margin-bottom: 10px;
}
.form-style-5 label {
	display: block;
	margin-bottom: 8px;
}
.form-style-5 input[type="text"],
.form-style-5 input[type="date"],
.form-style-5 input[type="datetime"],
.form-style-5 input[type="email"],
.form-style-5 input[type="number"],
.form-style-5 input[type="search"],
.form-style-5 input[type="time"],
.form-style-5 input[type="url"],
.form-style-5 textarea,

.form-style-5 select {
	font-family: 'Kalam', cursive;
	background: rgba(255,255,255,.1);
	border: none;
	border-radius: 4px;
	font-size: 15px;
	margin: 0;
	outline: 0;
	padding: 10px;
	width: 100%;
	box-sizing: border-box; 
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box; 
	background-color: #e8eeef;
	color:#8a97a0;
	-webkit-box-shadow: 0 1px 0 rgba(0,0,0,0.03) inset;
	box-shadow: 0 1px 0 rgba(0,0,0,0.03) inset;
	margin-bottom: 30px;
}
.form-style-5 input[type="text"]:focus,
.form-style-5 input[type="date"]:focus,
.form-style-5 input[type="datetime"]:focus,
.form-style-5 input[type="email"]:focus,
.form-style-5 input[type="number"]:focus,
.form-style-5 input[type="search"]:focus,
.form-style-5 input[type="time"]:focus,
.form-style-5 input[type="url"]:focus,
.form-style-5 textarea:focus,
.form-style-5 select:focus{
	background: #d2d9dd;
}
.form-style-5 select{
	-webkit-appearance: menulist-button;
	height:45px;
}
.form-style-5 .number {
	background: #80aaff;
	color: #fff;
	height: 30px;
	width: 30px;
	display: inline-block;
	font-size: 0.8em;
	margin-right: 4px;
	line-height: 30px;
	text-align: center;
	text-shadow: 0 1px 0 rgba(255,255,255,0.2);
	border-radius: 15px 15px 15px 0px;
}

.form-style-5 input[type="submit"],
.form-style-5 input[type="button"]
{
	position: relative;
	display: block;
	padding: 19px 39px 18px 39px;
	color: #FFF;
	margin: 0 auto;
	background: #80aaff;
	font-size: 18px;
	text-align: center;
	font-style: normal;
	width: 100%;
	border: 1px solid #16a085;
	border-width: 1px 1px 3px;
	margin-bottom: 10px;
}
.form-style-5 input[type="submit"]:hover,
.form-style-5 input[type="button"]:hover
{
	background: #9966ff;
}

</style>
<script type="text/javascript">
//auto expand textarea
function adjust_textarea(h) {
    h.style.height = "20px";
    h.style.height = (h.scrollHeight)+"px";
}
</script>
<title>Your diary</title>
</head>
<body >

<label><h3 align="center" style="font-family: 'Kalam', cursive">Your digital Diary is here</h3></label>
<div class="form-style-5">
<form action="SaveDiaryServlet" method="post">
<fieldset>
<legend><span class="number">1</span>About Day</legend>
<input type="date" name="date" placeholder="Date">
<select id="job" name="mood" >
<optgroup label="How was the day" >
  <option value="Happy">Happy</option>
  <option value="Very Happy">Very Happy</option>
  <option value="Excellent">Excellent</option>
  <option value="Sad">Sad</option>
  <option value="Crying">Crying</option>
  <option value="Laughing">Laughing</option>
  <option value="Other">Other</option>
</optgroup>
</select> 
<textarea name="day" style="color:black;" placeholder="About the day... How was the day..."></textarea>
     
</fieldset>
<fieldset>
<legend><span class="number">2</span> Motivation/Speciality</legend>
<textarea name="extra" style="color:#a64dff;" placeholder="Say Something"></textarea>
</fieldset>
<input type="submit" value="Save" />
</form>
</div>
<audio src="music.mp3" controls autoplay="autoplay" ></audio>
</body>
</html>