package com.sunjet.springbookzk.vm;

import lombok.Getter;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.google.charts.PieChart;
import org.zkoss.google.charts.data.DataTable;
import org.zkoss.google.charts.data.FormattedValue;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zkplus.spring.DelegatingVariableResolver;

@VariableResolver(DelegatingVariableResolver.class)
public class ChartVM {

    @Getter
    private DataTable data;

    @Init
    public void initChart() {
        //只刷新变量 NotifyChange currentTime
        data = new DataTable();
        data.addStringColumn("Task", "task");
        data.addNumberColumn("Hours per Day", "hours");
        data.addRow("Work", 11);
        data.addRow("Eat", 2);
        data.addRow("Commute", 2);
        data.addRow("Watch TV", 2);
        data.addRow("Sleep", new FormattedValue(7, "7.000"));
//
//        PieChart chart = new PieChart();
//        chart.setData(data);
    }
}
