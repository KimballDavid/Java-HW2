/*
* Property of David Kimball, Computer Science program National Universisty 
* CSC262 homework two question four part one
*/

class Rectangle
{
    double length = 0.0;
    double width = 0.0;

/******************* ctor w/paramter **********************/

    /*Rectagnle Rectangle()
    {
        length = 0.0;
        width = 0.0;
    }*/



/************** setters and getters *********************/

    void setLength(double value)
    {
        if(value > 20.0)
        {
            System.out.println("Please enter a length between 20.0 and 0.0.");
        }
        else
            length = value;
    }

    double getLength()
    {
        return length;
    }

    void setWidth(double value2)
    {
        if( value2 > 20.0)
            {
                System.out.println("Please enter a width between 20.0 and 0.0.");
            }
        else
            width = value2;
    }

    double getWidth()
    {
        return width;
    }

/******************* perimeter and area method ******************/

    double perimeter()
    {
        double perimeter = 2 *(this.length + this.width);
        return perimeter;
    }

    double area()
    {
        double area = this.length * this.width;
        return area;
    }

/******************* main() ******************/

    
}