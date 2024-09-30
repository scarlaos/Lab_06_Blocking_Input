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
        boolean rationalInput;

        Scanner in = new Scanner(System.in);
        do
        {
            rationalInput = true;
            System.out.println("Enter the amount of gallons in your gas tank:  ");
            tankGal = in.nextDouble();
            if(tankGal <= 0)
            {
                System.out.println("Enter a positive number for validity. ");
                rationalInput = false;
            }
            if(rationalInput)
            {
                System.out.println("Enter your miles per gallon: ");
                milesPerGal = in.nextDouble();
                    if(milesPerGal <= 0)
                    {
                        System.out.println("Enter a positive number for validity. ");
                        rationalInput = false;
                    }
            }
            if(rationalInput)
            {
                System.out.println("Enter the gas price: ");
                gasPrice = in.nextDouble();
                if(gasPrice <= 0)
                {
                    System.out.println("Enter a positive number for validity. ");
                    rationalInput = false;
                }
            }

        }while(!rationalInput);

        distanceFullTank = tankGal * milesPerGal;
        price100miles = (gasPrice / milesPerGal) * 100;

        System.out.printf("The distance in miles you can drive with a full tank of gas is %.2f", distanceFullTank);
        System.out.printf("\nThe cost to drive 100 miles is $%.2f", price100miles);
    }
}
