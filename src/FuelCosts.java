import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        double tankGal = 0.00;
        double milesPerGal = 0.00;
        double gasPrice = 0.00;
        double distanceFullTank = 0.00;
        double price100miles = 0.00;

        Scanner in = new Scanner(System.in);

        while(true) // gas tank
        {
            System.out.println("Enter the amount of gallons you get in your tank: ");
            if(in.hasNextDouble()) {
                tankGal = in.nextDouble();

                if (tankGal > 0) {
                    break;
                } else {
                    System.out.println("Enter a positive number: ");
                }
            }
            else
            {
                in.next();
                System.out.println("Bad input, try again. ");
            }
        }

        while(true) // miles per gal
        {
            System.out.println("Enter the amount of miles you get per gallon: ");
            if(in.hasNextDouble()) {
                milesPerGal = in.nextDouble();
                if (milesPerGal > 0) {
                    break;
                } else {
                    System.out.println("Bad input, enter the amount of miles you get per gallon: ");
                }
            } else {
                in.next();
                System.out.println("Bad input, try again.");
            }
        }

        while(true) // gas price
        {
            System.out.println("Enter the price per gallon for your gas: ");
            if(in.hasNextDouble()) {
                gasPrice = in.nextDouble();
                if (gasPrice > 0) {
                    break;
                } else {
                    System.out.println("Bad input, enter the price per gallon for gas: ");
                }
            }
            else {
                in.next();
                System.out.println("Bad input, try again.");
            }
        }

        distanceFullTank = tankGal * milesPerGal;
        price100miles = (gasPrice / milesPerGal) * 100;

        System.out.printf("The distance in miles you can drive with a full tank of gas is %.2f", distanceFullTank);
        System.out.printf("\nThe cost to drive 100 miles is $%.2f", price100miles);
    }
}
