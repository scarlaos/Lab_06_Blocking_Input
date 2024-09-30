import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        double length = 0.00;
        double height = 0.00;
        double area = 0.00;
        double perimeter = 0.00;
        double diagonal = 0.00;

        Scanner in = new Scanner(System.in);

        while(true) // length
        {
            System.out.println("Enter the length of the rectangle: ");
            if(in.hasNextDouble())
            {
                length = in.nextDouble();
                if(length > 0)
                {
                    break;
                } else
                {
                    System.out.println("Enter a positive number: ");
                }
            } else {
                in.next();
                System.out.println("Bad input, try again. ");
            }
        }

        while(true) // height
        {
            System.out.println("Enter the height of the rectangle: ");
            if(in.hasNextDouble())
            {
                height = in.nextDouble();
                if(height > 0)
                {
                    break;
                } else
                {
                    System.out.println("Enter a positive number: ");
                }
            } else {
                in.next();
                System.out.println("Bad input, try again. ");
            }
        }
        area = length * height;
        perimeter = 2 * (length + height);
        diagonal = Math.sqrt(Math.pow(length,2) + Math.pow(height,2));


        System.out.printf("The area of the rectangle is %.2f", area);
        System.out.printf("\nThe perimeter is %.2f", perimeter);
        System.out.printf("\nThe diagonal is %.2f", diagonal);


    }
}
