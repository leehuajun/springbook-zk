package com.sunjet.springbookzk.vm.sample;

import org.zkoss.bind.annotation.AfterCompose;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.ContextParam;
import org.zkoss.bind.annotation.ContextType;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.select.Selectors;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zkplus.spring.DelegatingVariableResolver;
import org.zkoss.zul.Div;
import org.zkoss.zul.Textbox;

@VariableResolver(DelegatingVariableResolver.class)
public class MacroVM {
    @Wire("#ddd")
    private Div ddd;
    private Component component;

    @AfterCompose
    public void afterCompose(@ContextParam(ContextType.VIEW) Component view) {
        Selectors.wireComponents(view, this, false);
    }

    //    @NotifyChange("")
    @Command
    public void openMacro() {
        if(component!=null){
            return;
        }
        component = Executions.createComponents("~./zul/macro/comp.zul", ddd, null);
    }
}
