package compensationModel;

public class BasePlusCommissionCompensationModel implements CompensationModel{
    private double grossSales;
    private double commissionRate;
    private double baseSalary;

    public BasePlusCommissionCompensationModel(double grossSales, double commissionRate, double baseSalary) {
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
        this.baseSalary = baseSalary;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earnings(){
        return baseSalary + grossSales * commissionRate;
    }
}
