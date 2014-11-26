//hideMaxListItem-min
// Hide Max List Items - v1.1 
(function($) {
    $.fn
            .extend({
        hideMaxListItems: function(options) {
            var defaults = {
                max: 3,
                speed: 1000,
                moreHTML: '<p class="maxlist-more"><a href="#">More Cities</a></p>'
            };
            var options = "";
            options = $.extend(defaults, options);
            var goingUp = 0;
            return this
                    .each(function() {
                var op = options;
                var totalListItems = $(this).children("li").length;
                var speedPerLI;
                if (totalListItems > 0) {
                    speedPerLI = Math.round(op.speed
                            / totalListItems);
                    if (speedPerLI < 1) {
                        speedPerLI = 1;
                    }
                } else {
                    speedPerLI = 0;
                }
                if ((totalListItems > 0)
                        && (totalListItems > op.max)) {
                    $(this).children("li").each(
                            function(index) {
                                if ((index + 1) > op.max) {
                                    $(this).hide(0);
                                    $(this).addClass(
                                            "maxlist-hidden");
                                }
                            });
                    $(this).after(op.moreHTML);
                    $(this)
                            .next(".maxlist-more")
                            .children("a")
                            .click(
                            function(e) {
                                var listElements = $(
                                        this).parent()
                                        .prev("ul, ol")
                                        .children("li");
                                listElements = listElements
                                        .slice(op.max);
                                if (goingUp == 0) {
                                    var i = 0;
                                    (function() {
                                        $(
                                                listElements[i++]
                                                || [])
                                                .slideToggle(
                                                speedPerLI,
                                                arguments.callee);
                                    })();
                                } else {
                                    var i = listElements.length - 1;
                                    (function() {
                                        $(
                                                listElements[i--]
                                                || [])
                                                .slideToggle(
                                                speedPerLI,
                                                arguments.callee);
                                    })();
                                }
                                if (goingUp == 0) {
                                    goingUp = 1;
                                } else {
                                    goingUp = 0;
                                }
                                e.preventDefault();
                            });
                }
            });
        }
    });
})(jQuery);