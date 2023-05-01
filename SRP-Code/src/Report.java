public class Report {
    private String reportType;
    private Customer customer;

    public Report(String reportType, Customer customer) {
        this.reportType = reportType;
        this.customer = customer;
    }

    public void generateReport(String reportType) {
        System.out.println(
                reportType + " Report: " + customer.getName() + "'s bill is " + customer.getBill().getBillAmount());
    }
}
