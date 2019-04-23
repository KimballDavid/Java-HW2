/*
* Property of David Kimball, Computer Science program National Universisty 
* CSC262 homework two question four part one
*/

class RectangleTest
{
    // test class for Rectangle objects
    public static void main(String[] args)
    {
        Rectangle first = new Rectangle();
        first.setLength(12.5);
        first.setWidth(11.7);

        System.out.print(first.getLength() + "\n");
        System.out.print(first.getWidth() + "\n");
        System.out.print(first.perimeter() + "\n");
        System.out.print(first.area() + "\n");
        System.out.print(first.length + "\n");
        System.out.print(first.width + "\n");
        
    }
}