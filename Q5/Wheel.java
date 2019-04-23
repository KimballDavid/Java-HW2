/*
* Property of David Kimball, Computer Science program National Universisty 
* CSC262 homework two question five part two
*/

/************************ Wheel class ********************************/
class Wheel
{
    public double width;
    public double radius;

/************************* default ctor ******************************/
    public Wheel()
    {
        width = 0;
        radius = 0;
        
    }
/*************************** ctor parameter ************************/
    public Wheel(double wheelD, double radiusD)
    {
        width = wheelD;
        radius = radiusD;
    }
/*
    public void Wheel(double wheelD, double radiusD)
    {
        setWidth(wheelD);
        setRadius(radiusD);
        
    }
*/

/******************* setters/getters **************************/
    public void setWidth(double wheelWidth)
    {
        width = wheelWidth;
    }

    public double getWidth()
    {
        return this.width;
    }

    public void setRadius(double wheelRadius)
    {
        width = wheelRadius;
    }

    public double getRadius()
    {
        return this.radius;
    }

/***************** Wheel Main()  ***************************************/
    public static void main(String[] args)
    {
        Wheel first = new Wheel();
        System.out.print(first.radius + "\t" + first.width);

        Wheel second = new Wheel(5.5, 5.6);
        System.out.print(second.radius + "\t" + second.width);


    }
}