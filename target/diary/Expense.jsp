<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="style.css">
    <title>Expense Management</title>
    <style>
     @import url("https://fonts.googleapis.com/css?family=Open+Sans:400,400i,700");
* {
  font-family: 'Open Sans', sans-serif;
  box-sizing: border-box;
  color: #333;
  font-size: 100%;
  line-height: 1.5;
}
body {
  background-image: url(blacka.jpeg);
  margin: 0;
    background-size: cover;
}
nav {
  --duration: .5s;
  --easing: ease-in-out;
  position: relative;
  width: 220px;
  margin: 20px;
}
nav ol {
  list-style-type: none;
  margin: 0;
  padding: 0;
}
nav li {
  margin: -4px 0 0 0;
}
nav a {
  display: block;
  text-decoration: none;
  background: #fff;
  transform-origin: 0 0;
  transition: transform var(--duration) var(--easing), color var(--duration) var(--easing);
  transition-delay: var(--delay-out);
  border-radius: 4px;
  padding: 1em 1.52em;
}
nav a:hover {
  background: #efefef;
}
nav .sub-menu a {
  font-size: .9em;
  color: #666666;
  border-left: 2em solid white;
  padding: .75em;
  background: linear-gradient(to right, #dddddd 2px, #ffffff 2px);
}
nav .sub-menu a:hover {
  background: linear-gradient(to right, #dddddd 2px, #efefef 2px);
}
nav header {
  font-weight: 600;
  display: block;
  background: rgba(255, 255, 255, 0.5);
  transform-origin: 0 0;
  transition: transform var(--duration) var(--easing), color var(--duration) var(--easing);
  transition-delay: var(--delay-out);
  border-radius: 4px;
  padding: 1em 1.52em;
}
nav header span {
  border: none;
  background: transparent;
  font-size: 1.5em;
  padding: 0;
  cursor: pointer;
  line-height: 1;
  float: right;
}
nav footer button {
  position: absolute;
  top: 0;
  left: 0;
  border: none;
  padding: calc(1em - 2px);
  width: 100%;
  transform-origin: 0 0;
  transition: transform var(--duration) var(--easing);
  transition-delay: calc(var(--duration) + (.1s * (var(--count) / 2)));
  cursor: pointer;
  outline: none;
  background: #cdcdcd;
  opacity: 0;
}
nav.closed a,
nav.closed header {
  transform: translateY(calc(var(--top) * -1)) scaleY(0.1) scaleX(0.2);
  transition-delay: var(--delay-in);
  color: transparent;
}
nav.closed footer button {
  transition-delay: 0s;
  transform: scaleY(0.7) scaleX(0.2);
}

    
    </style>
</head>
<body>
<div align="center" >
<form class="box" action="ExpenseSaveServlet" method="post">
<br><br>
  <h1>Expenses done today</h1>
  <input type="date" onload="getDate()" class="form-control" id="date" name="date">
  <input type="text" name="food" id="food" placeholder="Food Rs.." onblur="findTotal()">
  <input type="text" name="gol" id="gol" placeholder="Snacks" onblur="findTotal()">
  <input type="text" name="fare" id="fare" placeholder="Transportation" onblur="findTotal()">
  <input type="text" name="other" id="other" placeholder="Others" onblur="findTotal()">
  <input type="text" name="reason" placeholder="Reason if Others">
  <input type="text" placeholder="Total" name="total" id="total"/>
  <input type="submit" name="" value="Save" >
</form>
</div>
    <nav class="menu">
    <header>Menu <span>x</span></header>
    <ol>
        <li class="menu-item"><a href="#0">Home</a></li>
        <li class="menu-item"><a href="#0">About</a></li>
        <li class="menu-item">
            <a href="#0">Entertainment</a>
            <ol class="sub-menu">
                <li class="menu-item"><a href="#0">YouTube</a></li>
                <li class="menu-item"><a href="#0">MX Player</a></li>
            </ol>
        </li>
        <li class="menu-item"><a href="#0">Logout</a></li>
    </ol>
    <footer><button aria-label="Toggle Menu">Toggle</button></footer>
</nav> 

<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script>
    
   var $els = $('.menu a, .menu header');
var count = $els.length;
var grouplength = Math.ceil(count/3);
var groupNumber = 0;
var i = 1;
$('.menu').css('--count',count+'');
$els.each(function(j){
    if ( i > grouplength ) {
        groupNumber++;
        i=1;
    }
    $(this).attr('data-group',groupNumber);
    i++;
});

$('.menu footer button').on('click',function(e){
    e.preventDefault();
    $els.each(function(j){
        $(this).css('--top',$(this)[0].getBoundingClientRect().top + ($(this).attr('data-group') * -15) - 20);
        $(this).css('--delay-in',j*.1+'s');
        $(this).css('--delay-out',(count-j)*.1+'s');
    });
    $('.menu').toggleClass('closed');
    e.stopPropagation();
});

// run animation once at beginning for demo
setTimeout(function(){
    $('.menu footer button').click();
    setTimeout(function(){
        $('.menu footer button').click();
    }, (count * 100) + 500 );
}, 1000);
 
    
</script>
<script type="text/javascript">
function findTotal(){
    /* var arr = document.getElementsByTagName('text');
    var tot=0;
     for(var i=0;i<arr.length;i++){
        if(parseInt(arr[i].value))
            tot += parseInt(arr[i].value);
    }  */
    var tot=0;
    var y = document.getElementById("food").value;
    var a = document.getElementById("gol").value;
    var b = document.getElementById("fare").value;
    var c = document.getElementById("other").value;
    tot = +y + +a + +b + +c;
    
    document.getElementById('total').value = tot;
}

    </script>
    <script>
	function getDate(){
	    var today = new Date();
	document.getElementById("date").value = today.getFullYear() + '-' + ('0' + (today.getMonth() + 1)).slice(-2) + '-' + ('0' + today.getDate()).slice(-2);
	}

</script>
</body>
</html>