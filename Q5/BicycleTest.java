/*
* Property of David Kimball, Computer Science program National Universisty 
* CSC262 homework two question five part three
*/

class BicycleTest
{
    public static void commpareWheel(Wheel W1, Wheel W2)
    {
        if(W1 != W2)
            System.out.print("Not equal \n");
        else
        {
            System.out.print("Equal \n");
        }
    }
    public static void main(String[] args)
    {
        Bicycle first = new Bicycle(1.0, 1.5, 27.0, 28.0, "Blue", 18);
        first.printBicycle();

        first.setGears(21);

        first.printBicycle();

        commpareWheel(first.wheelOne, first.wheelTwo);
    }
}