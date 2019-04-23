/*
* Property of David Kimball, Computer Science program National Universisty 
* CSC262 homework two question one
*/
import java.util.Scanner;


class isEven
{
/******************** Static Variables ****************************/

    static int _CAPACITY_ = 256; 
    static private int[] isEven = new int[_CAPACITY_];
    static int evenCounter = 0;
    static private int[] isOdd = new int[_CAPACITY_];
    static int oddCounter = 0;
    static int counter = 0;

/******************** even method ***********************************/
   
    static boolean even(int num)
    {
        if(num % 2 == 0)
            {
                return true;
            }
        else
            {
                return false;
            }
    }

/********************************* Primary Method for encapsulation ********************************/

    static void first()
    {
        Scanner u_input = new Scanner(System.in);
        int stop = 0;
        while(stop < 1)
        {

            
            System.out.println("Please enter an integer to test: \n");
            int entry = u_input.nextInt();
            System.out.println("\n");
            boolean result = false;
            result = even(entry);
            if(result == true)
            {
                System.out.println("The integer " + entry + " is even. \n");
                isEven[counter] = entry;
                evenCounter++;
            }
            else{
                System.out.println("The integer " + entry + " is odd. \n");
                isOdd[counter] = entry;
                oddCounter++;
            }

/*********************** check to see if user wants to exit *********************************/
                    
            System.out.println("Enter 1 to exit program.\n");
            stop = u_input.nextInt();
            if(stop == 1)
            {
               System.out.println("Thank you for using this application. Goodbye.");
            }
            counter++;
        }

/********************** display number of attempts and results**************************** */

        System.out.println("You checked " + counter + " nunmbers, " + evenCounter + " were even and " + oddCounter + " were odd.");
        u_input.close(); // prevent memory leak
    }


/************************************ Main() ************************************************/

    public static void main(String[] args)
    {
        first();
        
    }
}