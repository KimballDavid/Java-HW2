/*
* Property of David Kimball, Computer Science program National Universisty 
* CSC262 homework two question three
*/

import java.util.Random;

class ArrayList
{
    static int[] pop(int[] arr)
    {
        int[] temp = new int[9];

        int j = 1;
        
        for (int i = 0; i < temp.length; i++)
        {
            temp[i] = arr[j++];
        }

        System.out.print("\n");

        return temp;
    }

    public static void main(String[] args)
    {

/****************** part 1 & 2 create and fill array **********************************/
   
        int[] al = new int[10];

        Random ranInt = new Random();
        // int value = ranInt.nextInt((1000));

        for(int i = 0; i < al.length; i++)
        {
            int value = ranInt.nextInt((1000));
            al[i] = value;
        }

/****************** part 3 print original contents **********************************/        


        for(int j = 0; j < al.length; j++)
        {

            System.out.printf( al[j] + " ");

            if(j == 3 || j == 7)
            {
                System.out.println("\n");
            }
            
        }
        System.out.println("\n");

/****************** part 4 print length of array*************************************/        

        System.out.print(al.length + "\n");

/****************** part 5 remove first element *************************************/        

        al = pop(al);

/****************** part 6 print length of array after removal************************/

        System.out.print("\n" + al.length + "\n");

/************************ part 7 print content after removal *************************/

        for(int j = 0; j < al.length; j++)
        {

            System.out.printf( al[j] + " ");

            if(j == 3 || j == 7)
            {
                System.out.println("\n");
            }
            
        }
        
        
    }

}