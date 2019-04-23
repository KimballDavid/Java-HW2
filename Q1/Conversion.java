/*
* Property of David Kimball, Computer Science program National Universisty 
* CSC262 homework two question two
*/

import java.util.Scanner;

class Conversion
{
    
    /**************** celsius convertion method ********************/

    static double celsius(double temp)
    {
        double celsius = (5.0 / 9.0) * (temp - 32);
        return celsius;

    }

/**************** fahrenheit convertion method ********************/

    static double fahrenheit(double temp)
    {
        double fahrenheit = (9.0 / 5.0) * celsius + 32;
        return fahrenheit;
    }

/**********************main method **************************************/

    static void main(String[] args)
    {
        Scanner u_input = new Scanner(System.in);
        System.out.println("Enter fahrenheit temperature: \n");
        double fahTemp = u_input.nextDouble();
        System.out.println(fahTemp);



        System.out.println("Enter celsius temperature: \n");
        double celTemp = u_input.nextDouble();
        System.out.println(celTemp);

        u_input.close();
    }
}