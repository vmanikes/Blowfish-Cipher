<!doctype html>
<html>
<head>
<script language="javascript">
function check(){
	flag=0;
	day=document.form1.day.value;
	month=document.form1.month.value;
	year=document.form1.year.value;

	var d= new Date(); 
	myd=  d.getDate();
	mym= d.getMonth();
	myy= d.getYear();

	mym = mym+1;
	myy= myy+1900;
 
	if(document.form1.rno.value == ""){
		alert("Type Registration number ");
		document.form1.rno.focus();
		return; 
	}

	if(document.form1.day.value == ""){
		alert("Type Day  number ");
		document.form1.day.focus();
return; 
}

if(document.form1.month.value == "")
{
alert("Type Month number ");
document.form1.month.focus();
return; 
}

if(document.form1.year.value == "")
{
alert("Type Year  number ");
document.form1.year.focus();
return; 
}


if(month<1 ||  month>12) flag=1;

if(day>31 || year>myy) flag=1;

if(year==myy &&   month>mym) flag=1;

if(year==myy && month==mym && day>myd) flag=1;

if((year%4==0 && year%100!=0) || year%400 == 0) 
{
if(day>29) flag=1;
} else  {     if(day>28) flag=1;    }

if(flag==1)
{
alert("Date Not correct");
return;
}


document.form1.submit();
}
</script>

<meta charset="utf-8">
<!-- TemplateBeginEditable name="doctitle" -->
<title>Stolen</title>
<!-- TemplateEndEditable -->
<!-- TemplateBeginEditable name="head" -->
<!-- TemplateEndEditable -->
<style type="text/css">
<!--
body {
	font: 100%/1.4 Verdana, Arial, Helvetica, sans-serif;
	background-color: #42413C;
	margin: 0;
	padding: 0;
	color: #000;
}
/* ~~ Element/tag selectors ~~ */
ul, ol, dl { /* Due to variations between browsers, it's best practices to zero padding and margin on lists. For consistency, you can either specify the amounts you want here, or on the list items (LI, DT, DD) they contain. Remember that what you do here will cascade to the .nav list unless you write a more specific selector. */
	padding: 0;
	margin: 0;
}
h1, h2, h3, h4, h5, h6, p {
	margin-top: 0;	 /* removing the top margin gets around an issue where margins can escape from their containing block. The remaining bottom margin will hold it away from any elements that follow. */
	padding-right: 15px;
	padding-left: 15px; /* adding the padding to the sides of the elements within the blocks, instead of the block elements themselves, gets rid of any box model math. A nested block with side padding can also be used as an alternate method. */
}
a img { /* this selector removes the default blue border displayed in some browsers around an image when it is surrounded by a link */
	border: none;
}
/* ~~ Styling for your site's links must remain in this order - including the group of selectors that create the hover effect. ~~ */
a:link {
	color: #42413C;
	text-decoration: underline; /* unless you style your links to look extremely unique, it's best to provide underlines for quick visual identification */
}
a:visited {
	color: #6E6C64;
	text-decoration: underline;
}
a:hover, a:active, a:focus { /* this group of selectors will give a keyboard navigator the same hover experience as the person using a mouse. */
	text-decoration: none;
}
/* ~~ This fixed width container surrounds all other blocks ~~ */
.container {
	width: 960px;
	background-color: #FFFFFF;
	margin: 0 auto; /* the auto value on the sides, coupled with the width, centers the layout */
}
/* ~~ The header is not given a width. It will extend the full width of your layout. ~~ */
header {
	background-color: #ADB96E;
}
/* ~~ These are the columns for the layout. ~~ 

1) Padding is only placed on the top and/or bottom of the block elements. The elements within these blocks have padding on their sides. This saves you from any "box model math". Keep in mind, if you add any side padding or border to the block itself, it will be added to the width you define to create the *total* width. You may also choose to remove the padding on the element in the block element and place a second block element within it with no width and the padding necessary for your design.

2) No margin has been given to the columns since they are all floated. If you must add margin, avoid placing it on the side you're floating toward (for example: a right margin on a block set to float right). Many times, padding can be used instead. For blocks where this rule must be broken, you should add a "display:inline" declaration to the block element's rule to tame a bug where some versions of Internet Explorer double the margin.

3) Since classes can be used multiple times in a document (and an element can also have multiple classes applied), the columns have been assigned class names instead of IDs. For example, two sidebar blocks could be stacked if necessary. These can very easily be changed to IDs if that's your preference, as long as you'll only be using them once per document.

4) If you prefer your nav on the left instead of the right, simply float these columns the opposite direction (all left instead of all right) and they'll render in reverse order. There's no need to move the blocks around in the HTML source.

*/
.sidebar1 {
	float: right;
	width: 180px;
	
	padding-bottom: 10px;
}
.content {
	padding: 10px 0;
	width: 780px;
	float: right;
}

/* ~~ This grouped selector gives the lists in the .content area space ~~ */
.content ul, .content ol {
	padding: 0 15px 15px 40px; /* this padding mirrors the right padding in the headings and paragraph rule above. Padding was placed on the bottom for space between other elements on the lists and on the left to create the indention. These may be adjusted as you wish. */
}

/* ~~ The navigation list styles (can be removed if you choose to use a premade flyout menu like Spry) ~~ */
ul.nav {
	list-style: none; /* this removes the list marker */
	border-top: 1px solid #666; /* this creates the top border for the links - all others are placed using a bottom border on the LI */
	margin-bottom: 15px; /* this creates the space between the navigation on the content below */
}
ul.nav li {
	border-bottom: 1px solid #666; /* this creates the button separation */
}
ul.nav a, ul.nav a:visited { /* grouping these selectors makes sure that your links retain their button look even after being visited */
	padding: 5px 5px 5px 15px;
	display: block; /* this gives the link block properties causing it to fill the whole LI containing it. This causes the entire area to react to a mouse click. */
	width: 160px;  /*this width makes the entire button clickable for IE6. If you don't need to support IE6, it can be removed. Calculate the proper width by subtracting the padding on this link from the width of your sidebar container. */
	text-decoration: none;
	background-color: #C6D580;
}
ul.nav a:hover, ul.nav a:active, ul.nav a:focus { /* this changes the background and text color for both mouse and keyboard navigators */
	background-color: #ADB96E;
	color: #FFF;
}

/* ~~ The footer ~~ */
footer {
	padding: 10px 0;
	background-color: #CCC49F;
	position: relative;/* this gives IE6 hasLayout to properly clear */
	clear: both; /* this clear property forces the .container to understand where the columns end and contain them */
}

/*HTML 5 support - Sets new HTML 5 tags to display:block so browsers know how to render the tags properly. */
header, section, footer, aside, article, figure {
	display: block;
}
-->
</style><!--[if lt IE 9]>
<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<![endif]--></head>

<body>

<div class="container">
  <header>
    <a href="#"><img src="prjc.jpg" alt="Insert Logo Here" width="960" height="92" id="Insert_logo" style="background-color: #C6D580; display:block;" /></a>
  </header>
  <div class="sidebar1">
    <ul class="nav">
       <li><a href="mainpage.HTML">Home page</a></li>
      <li><a href="NewRegistration.html">New Registration</a></li>
      <li><a href="DuplicateRegistration.html">Duplicate Registration</a></li>
      <li><a href="ChangeOfRegistration.html">Change Of Address</a></li>
      <li><a href="Stolen.html">Stolen Vehicle</a></li>
      <li><a href="Tracing.html">Tracing Vehicle</a></li>
    </ul>
    <aside>
      <p>&nbsp;</p>
</aside>
  <!-- end .sidebar1 --></div>
  <article class="content">
    <h1>&nbsp;</h1>
<form name=form1 method=post 
action="stolen1.jsp">

<h1 align="center"><u>STOLEN VEHICLE REGISTRATION</u></h1>
<p>Enter your T/R Number:
  <input type=text name=rno>
</p>
Enter date of theft:
Day :<input type=text name=day SIZE = 2 MAXLENGTH=2 > 
 Month 
 <input type=text name=month SIZE = 2 MAXLENGTH=2>
Year 
<input type=text name=year SIZE = 4 MAXLENGTH=4><br>
Enter Place Of Theft:
<input type="text" name="place">
<p><input type=submit  value="Go"
          onClick="check()" align="middle"></p>
<hr>
</form>

    
    
    <section>
      <h2>&nbsp;</h2>
    </section>
    <section> </section>
    <!-- end .content --></article>
  <footer>
    
   
  </footer>
  <!-- end .container --></div>
</body>
</html>
