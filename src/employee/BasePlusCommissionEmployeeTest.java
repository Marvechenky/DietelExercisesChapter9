package employee;

public class BasePlusCommissionEmployeeTest {
    public static void star() {
        for (int k = 0; k <= 150; k++) {
            System.out.print("*");
        }
    }
        public static void main(String[] args){

            star();
            System.out.println();
            BasePlusCommissionEmployee basePlusComissionEmployee1 = new BasePlusCommissionEmployee("John", "Franklin", "SSN3456", 25_000.00, 0.3, 65_000.00);
            System.out.println("Base Plus Commission Employee1 information obtained by get method:");
            System.out.printf("%s %s%n", "First Name:", basePlusComissionEmployee1.getFirstName());
            System.out.printf("%s %s%n", "Last Name:", basePlusComissionEmployee1.getLastName());
            System.out.printf("%s %s%n", "Social Security Number: ", basePlusComissionEmployee1.getSocialSecurityNumber());
            System.out.printf("%s %.2f%n", "Gross Sales: ", basePlusComissionEmployee1.getGrossSales());
            System.out.printf("%s %.2f%n", "Commission Rate: ", basePlusComissionEmployee1.getCommissionRate());

            basePlusComissionEmployee1.setGrossSales(25_000.00);
            basePlusComissionEmployee1.setCommissionRate(0.3);
            star();


            System.out.printf("%n%s%n%s%n ", "Updated base plus commission employee1 information obtained by toString", basePlusComissionEmployee1);

            star();


        }
    }

