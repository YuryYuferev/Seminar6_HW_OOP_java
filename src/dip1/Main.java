package src.dip1;

import src.dip1.model.Report;

public class Main {
    public static void main(String[] args) {
        Report report = new Report();
        report.calculate();
        report.output();
    }
}