/*
* Property of David Kimball, Computer Science program National Universisty 
* CSC262 homework two question three part two
*/

import java.util.Random;

class RandomDice
{
/********************** dice method ******************************/    
    static int randomNum6()
    {
        Random sixSided = new Random();
        int value = sixSided.nextInt((9 - 2)); // low numbers not standard deviation
        return value;
    }

/*************** primary method *********************************/
    static void first()
    {
        int i = 0;
        int[] results = new int[11];
        while(i < 36000000)
        {
            int num1 = randomNum6();
            int num2 = randomNum6();
            int sum = num1 + num2;
            
            switch(sum)
            {
                case 2: 
                    results[0]++;
                    break;
                case 3: 
                    results[1]++;
                    break;
                case 4: 
                    results[2]++;
                    break;
                case 5: 
                    results[3]++;
                    break;
                case 6: 
                    results[4]++;
                    break;
                case 7: 
                    results[5]++;
                    break;
                case 8: 
                    results[6]++;
                    break;
                case 9: 
                    results[7]++;
                    break;
                case 10: 
                    results[8]++;
                    break;
                case 11: 
                    results[9]++;
                    break;
                case 12: 
                    results[10]++;
                    break;
            }
            i++;
        }
/*************************** display in tabular format ***************************/
        for(int j = 0; j < 11; j++)
        {

            System.out.printf( results[j] + " ");

            if(j == 3 || j == 7)
            {
                System.out.println("\n");
            }
            
        }
        
    }

/*********************** main method ********************************/
    public static void main(String[] args)
    {
        first();
        
    }

}

