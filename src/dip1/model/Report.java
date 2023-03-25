package src.dip1.model;

import src.dip1.model.util.ReportPrinter;

import java.util.ArrayList;
import java.util.List;

public class Report{
    private List<ReportItem> items;	// Îò÷åòíûå äàííûå

    // ðàñ÷åò îò÷åòíûõ äàííûõ
    public void calculate(){
        items =  new ArrayList<ReportItem>();
        items.add(new ReportItem("First", (float)5));
        items.add(new ReportItem("Second", (float)6));
    }

    public void output(){
        ReportPrinter reportPrint = new ReportPrinter();
        reportPrint.output(items);
    }
}