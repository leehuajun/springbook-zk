package com.sunjet.springbookzk;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zkplus.spring.DelegatingVariableResolver;

import java.time.LocalDateTime;

@VariableResolver(DelegatingVariableResolver.class)
public class TestViewModel {

    @WireVariable
    private TestService testService;

    @Command
    @NotifyChange("currentTime")
    public void updateTime() {
        //只刷新变量 NotifyChange currentTime
    }

    public LocalDateTime getCurrentTime() {
        return testService.getTime();
    }
}
