package com.sunjet.springbookzk.vm.sample;

import org.zkoss.bind.annotation.*;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.Selectors;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zkplus.spring.DelegatingVariableResolver;
import org.zkoss.zul.Textbox;

@VariableResolver(DelegatingVariableResolver.class)
public class ElExpressionVM {

    @Wire("#tb")
    private Textbox textbox;

    @AfterCompose
    public void afterCompose(@ContextParam(ContextType.VIEW) Component view) {
        Selectors.wireComponents(view, this, false);
    }

    //    @NotifyChange("")
    @Command
    public void changeTextBoxValue() {
        textbox.setValue("change from button");
    }

}
