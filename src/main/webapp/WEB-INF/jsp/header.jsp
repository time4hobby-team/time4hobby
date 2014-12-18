<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.7.2.js"></script>
<script src="static/js/jquery-ui-1.8.13.custom.min.js"></script>
<!-- thumbnailScroller script -->
<script src="static/js/jquery.thumbnailScroller.js"></script>
<script>
	/* call<ing thumbnailScroller function with options as parameters */
	(function($) {
		window.onload = function() {
			/* selector can be id, class, tag name etc. */
			$("#tS1").thumbnailScroller({
				/* scroller type based on mouse interaction 
				values: "hoverPrecise", "hoverAccelerate", "clickButtons" 
				default: "hoverPrecise" */
				scrollerType : "hoverAccelerate",
				/* scroller orientation 
				values: "horizontal", "vertical" 
				default: "horizontal" */
				scrollerOrientation : "horizontal",
				/* scroll easing type only for "hoverPrecise" scrollers
				available values here: http://jqueryui.com/demos/effect/easing.html 
				default: "easeOutCirc" */
				scrollEasing : "easeOutCirc",
				/* scroll easing amount only for "hoverPrecise" and "clickButtons" scrollers (0 for no easing) 
				values: milliseconds 
				default: 800 */
				scrollEasingAmount : 800,
				/* acceleration value only for "hoverAccelerate" scrollers 
				values: integer 
				default: 2 */
				acceleration : 4,
				/* scrolling speed only for "clickButtons" scrollers 
				values: milliseconds 
				default: 600 */
				scrollSpeed : 800,
				/* scroller null scrolling area only for "hoverAccelerate" scrollers 
				0 being the absolute center of the scroller
				values: pixels 
				default: 0 */
				noScrollCenterSpace : 10,
				/* initial auto-scrolling 
				0 equals no auto-scrolling 
				values: amount of auto-scrolling loops (integer) 
				default: 0 */
				autoScrolling : 0,
				/* initial auto-scrolling speed 
				values: milliseconds 
				default: 8000 */
				autoScrollingSpeed : 2000,
				/* initial auto-scrolling easing type 
				available values here: http://jqueryui.com/demos/effect/easing.html 
				default: "easeInOutQuad" */
				autoScrollingEasing : "easeInOutQuad",
				/* initial auto-scrolling delay for each loop 
				values: milliseconds 
				default: 2500 */
				autoScrollingDelay : 500
			});
		};
	})(jQuery);
</script>


<script>
	$(document).ready(function() {
		$('.nav-toggle').click(function() {
			//get collapse content selector
			var collapse_content_selector = $(this).attr('href');

			//make the collapse content to be shown or hide
			var toggle_switch = $(this);
			$(collapse_content_selector).toggle(function() {
				if ($(this).css('display') == 'none') {
					toggle_switch.html('More Cities >>');//change the button label to be 'Show'
				} else {
					toggle_switch.html('Hide Cities >>');//change the button label to be 'Hide'
				}
			});
		});

	});
</script>

<script src="images/jquery.min.js" type="text/javascript"></script>
<script type="text/javascript">
	/*<![CDATA[*/

	function makeScrollable(wrapper, scrollable) {
		// Get jQuery elements
		var wrapper = $(wrapper), scrollable = $(scrollable);

		// Hide images until they are not loaded
		scrollable.hide();
		var loading = $('<div class="loading">Loading...</div>').appendTo(
				wrapper);

		// Set function that will check if all images are loaded
		var interval = setInterval(function() {
			var images = scrollable.find('img');
			var completed = 0;

			// Counts number of images that are succesfully loaded
			images.each(function() {
				if (this.complete)
					completed++;
			});

			if (completed == images.length) {
				clearInterval(interval);
				// Timeout added to fix problem with Chrome
				setTimeout(function() {

					loading.hide();
					// Remove scrollbars	
					wrapper.css({
						overflow : 'hidden'
					});

					scrollable.slideDown('slow', function() {
						enable();
					});
				}, 1000);
			}
		}, 100);

		function enable() {
			// height of area at the top at bottom, that don't respond to mousemove
			var inactiveMargin = 99;
			// Cache for performance
			var wrapperWidth = wrapper.width();
			var wrapperHeight = wrapper.height();
			// Using outer height to include padding too
			var scrollableHeight = scrollable.outerHeight() + 2
					* inactiveMargin;
			// Do not cache wrapperOffset, because it can change when user resizes window
			// We could use onresize event, but it's just not worth doing that 
			// var wrapperOffset = wrapper.offset();

			var lastTarget;
			//When user move mouse over menu			
			wrapper.mousemove(function(e) {
				// Save target
				lastTarget = e.target;

				var wrapperOffset = wrapper.offset();

				// Scroll menu
				var top = (e.pageY - wrapperOffset.top)
						* (scrollableHeight - wrapperHeight) / wrapperHeight
						- inactiveMargin;
				if (top < 0) {
					top = 0;
				}
				wrapper.scrollTop(top);
			});

			// Setting interval helps solving perfomance problems in IE
			var interval = setInterval(function() {
				if (!lastTarget)
					return;

			}, 200);
		}
	}

	$(function() {
		makeScrollable("div.sc_menu_wrapper", "div.sc_menu");
	});
</script>


<!-- blue color image with logo is header -->
<div id="header">
	<div id="headercontent" class="center">
		<c:choose>
			<c:when test="${!empty loggedUser}">
				<c:out value="${loggedUser.firstname}" />&nbsp;&nbsp;&nbsp;<a
					href="<c:url value="j_spring_security_logout" />"> Logout</a>
			</c:when>
			<c:otherwise>
				<a href="/business/signup"><font color="#FFFFFF"><span
						class="uline"> A Business Owner?</span></font></a>&nbsp;
                <a href="login"><font color="#FFFFFF"><span
						class="uline"> Login </span></font></a> &nbsp;&nbsp;
                <a href="signup"><font color="#FFFFFF"><span
						class="uline"> Sign Up! </span></font></a>
			</c:otherwise>
		</c:choose>
	</div>
	<div id="logo">
		<heading> <a href="/index">TiMe<fontLogo>4</fontLogo>HoBbY
		</a>
		<div id="alignlogo"></div>
		</heading>
	</div>
	<div id="headeroptions">
		<a href="/business/signup"><font color="#FFFFFF"><span
				class="uline"> Home</span></font></a>&nbsp;&nbsp; <a href="/business/signup"><font
			color="#FFFFFF"><span class="uline"> About Me</span></font></a>&nbsp; <a
			href="/business/signup"><font color="#FFFFFF"><span
				class="uline"> Write a Review</span></font></a>&nbsp;&nbsp; <a
			href="/business/signup"><font color="#FFFFFF"><span
				class="uline"> Find Friends</span></font></a>&nbsp;&nbsp; <a href="/business/signup"><font
			color="#FFFFFF"><span class="uline"> Messages</span></font></a>&nbsp; <a
			href="/business/signup"><font color="#FFFFFF"><span
				class="uline"> Talk</span></font></a>&nbsp;&nbsp; <a href="/business/signup"><font
			color="#FFFFFF"><span class="uline"> Events</span></font></a>&nbsp;
	</div>
</div>
