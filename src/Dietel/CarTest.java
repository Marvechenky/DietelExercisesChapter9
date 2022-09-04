package Dietel;

public class CarTest {
    public static void main(String[] args) {
        Car ferrari = new Car("Ashton", "2022", 750_000.00);
        Car porsche = new Car("Vogue", "2021", 950_000.00);

        System.out.printf("Ferrari %nModel: %s%nYear: %s%nPrice: $%,.2f", ferrari.getModel(), ferrari.getYear(), ferrari.getPrice());
        grid();

        System.out.printf("Porsche %nModel: %s%nYear: %s%nPrice: $%,.2f", porsche.getModel(), porsche.getYear(), porsche.getPrice());
        grid();

        System.out.printf("Discounted Price On The Ferrari Ashton 2022 %nInitial Price: $%,.2f %nFive-Percent Discounted Price: $%,.2f ", ferrari.getPrice(), ferrari.discountedPrice(5.0));
        grid();

        System.out.printf("Discounted Price On The Porsche Vogue 2021 %nInitial Price: $%,.2f %nSeven-Percent Discounted Price: $%,.2f ", porsche.getPrice(), porsche.discountedPrice(7.0));
        grid();
    }



    public static void grid(){
        System.out.print("\n================================================\n");
    }
}
