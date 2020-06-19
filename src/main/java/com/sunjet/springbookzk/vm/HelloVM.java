package com.sunjet.springbookzk.vm;

import com.sunjet.springbookzk.service.TestService;
import lombok.Getter;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zkplus.spring.DelegatingVariableResolver;

import java.time.LocalDateTime;

@VariableResolver(DelegatingVariableResolver.class)
public class HelloVM {

    @WireVariable
    private TestService testService;

    @Getter
    private LocalDateTime currentTime = LocalDateTime.now();

    @Command
    @NotifyChange("currentTime")
    public void updateTime() {
        //只刷新变量 NotifyChange currentTime

        currentTime = testService.getTime();
    }
}
