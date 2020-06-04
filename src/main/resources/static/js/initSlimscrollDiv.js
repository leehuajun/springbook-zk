/* basic ZK - jquery-slimscroll integration */
zk.afterLoad('zul.wgt', function() {
    zul.wgt.Div.prototype.initSlimscroll = function (opts) {
        var scrollDiv = this.$n();
        var jqScrollDiv = jq(scrollDiv);
        jqScrollDiv.slimScroll(opts);
        // register optional client command handler (as an example for MVVM integration)
        if(opts.scrollToEndCmd){
            var binder = zkbind.$(scrollDiv);
            binder.after(opts.scrollToEndCmd, function() {
                jqScrollDiv.slimScroll({ scrollBy: scrollDiv.scrollHeight });
            });
        }
    }
});
