package accountPayableSystemModification;

public class BasePlusCommissionEmployee extends CommissionEmployee implements Payable{
    private double baseSalary; // Base Salary Per Week

    // Constructor
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSale, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSale, commissionRate);

        if (baseSalary < 0.0) { // Validate baseSalary
            throw new IllegalArgumentException("Base salary must be greater than zero");
        }
    }

    // Set Base Salary
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) { // Validate Base Salary
            throw new IllegalArgumentException("Base salary must be greater than zero");
        }
        this.baseSalary = baseSalary;

    }
        // Return Base Salary
        public double getBaseSalary () {
            return baseSalary;
        }

        // Calculate Earnings; Override Method Earnings In CommissionEmployee
        @Override
        public double getPaymentAmount() {
            return getBaseSalary() + super.getPaymentAmount();
        }

        // Return String Representation Of BasePlus Commission Employee Object
        @Override
        public String toString() {
            return String.format("%s %s; %s: $%,.2f", "Base-Salaried", super.toString(), "Base Salary", getBaseSalary());
        }

    }



