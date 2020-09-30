import java.util.Scanner;

public class Gas {

	public static void main(String[] args) {

		int miles;
		int gallons;
		char cont = 'y';
		
		Scanner sc = new Scanner(System.in);
		GasMileage mileage = new GasMileage();
		
		while (cont != 'n'){
			
			System.out.print("Enter gas mileage for this trip: ");
			miles = sc.nextInt();
			System.out.print("Enter gallons used for this trip: ");
			gallons = sc.nextInt();
			
			System.out.printf("Your miles per gallon for this trip is: %.2f\n", mileage.getTripMPG(miles, gallons));
			
			System.out.print("Add another trip? (y/n);: ");
			cont = sc.next().charAt(0);
		}
			System.out.println("COMBINED TOTAL MILES PER GALLON");
			System.out.printf("Combined mileage: %.2f\nCombined gallon usage: %.2f\n",
            mileage.getTotalMiles(), mileage.getTotalGallons());
			System.out.printf("Your combined miles per gallon for all trips is: %.2f\n", mileage.getTotalMPG());
		
	}

}


