<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script
    src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.4/jquery.min.js"
type="text/javascript"></script>


<script type="text/javascript">

    $(document).ready(function() {

        $('.show_hide').showHide({
            speed: 1000, // speed you want the toggle to happen
            easing: '', // the animation effect you want. Remove this line if you dont want an effect and if you haven't included jQuery UI
            changeText: 1, // if you dont want the button text to change, set this to 0
            showText: 'More Cities >>', // the button text to show when a div is closed
            hideText: 'Hide Cities >>' // the button text to show when a div is open

        });


    });

</script>

<script>
        function toggle(thisname) {

           tr=document.getElementsByTagName('li')

           for (i=0;i<li.length;i++){
              if (li[i].getAttribute(thisname)){
                 if ( li[i].style.display=='none' ){
                    li[i].style.display = '';
                 }
              else {
                 li[i].style.display = 'none';
                 }
              }
           }
        }
   </script>

<!-- upper black background -->
<div id="bg2">
    <div id="bg3">
        <c:choose>
            <c:when test="${!empty loggedUser}">
                <c:out value="${loggedUser.firstname}" />&nbsp;&nbsp;&nbsp;<a href="logout">Logout</a>
            </c:when>
            <c:otherwise>
                <a href="login"><font color="#FFFFFF"><span class="uline">  Login </span></font></a>
                </c:otherwise>
            </c:choose>
    </div>
</div>

<!-- white line in the header -->
<div id="bg1"></div>


<!-- blue color image with logo is header -->
<div id="header">

    <!-- logo image -->
    <div id="alignlogo">

    </div>
    <div id="logo">
        <h1>
            <heading><a href="#">TiMe<fontLogo>4</fontLogo>HoBbY</a></heading>
        </h1>
    </div>
</div>