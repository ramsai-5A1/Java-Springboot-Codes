package SolidPrinciples;

public class EmployeePerformanceGenerator {

    public String generateReport(String reportType) {
        if (reportType.equals("PDF")) {
            return "Generating PDF report.";
        } else if (reportType.equals("Word")) {
            return "Generating Word report.";
        }
        return "Report type not supported.";
    }

}
