/*
* Property of David Kimball, Computer Science program National Universisty 
* CSC262 homework two question five part one
*/

class Bicycle
{
    Wheel wheelOne;
    Wheel wheelTwo ;
    String bodyColor = "";
    int numberOfGears;

    public Bicycle(double w1, double w2, double r1, double r2, String color, int gears)
    {
        wheelOne = new Wheel(w1, r1); 
        wheelTwo = new Wheel(w2, r2);
        
        bodyColor = color; 
        numberOfGears = gears;
    }

/************************* setters  **********************************/
    public void setBodyColor(String m_color)
    {
        bodyColor = m_color;
    }

    public void setGears(int m_gears)
    {
        numberOfGears = m_gears;
    }

    public void setWheel1(Wheel wheel1)
    {
        wheelOne.width = wheel1.width;
        wheelOne.radius = wheel1.radius;
    }

    public void setWheel2(Wheel wheel2)
    {
        wheelTwo.width = wheel2.width;
        wheelTwo.radius = wheel2.radius;
    }

/********************** Getters **************************/

    public String getColor()
    {
        return this.bodyColor;
    }

    public int getGears()
    {
        return numberOfGears;
    }

    public Wheel getWheel1()
    {
        return wheelOne;
    }

    public Wheel getWheel2()
    {
        return wheelTwo;
    }

/******************* print method **********************************/

    public void printBicycle()
    {
        System.out.print("The Bicycles color is: " + this.bodyColor + "\n" );
        System.out.print("It has: " + this.numberOfGears + " gears \n" );
        System.out.print("The radius of the first wheel is: " + this.wheelOne.radius + "\n");
        System.out.print("The width of the first wheel is: " + this.wheelOne.width + "\n");
        System.out.print("The radius of the second wheel is: " + this.wheelTwo.radius + "\n");
        System.out.print("The width of the second wheel is: " + this.wheelTwo.width + "\n");

    }

/************************** Main() *********************************/

    public static void main(String[] args)
    {
        
    }
}
