/*
* Property of David Kimball, Computer Science program National Universisty 
* CSC262 homework two question three part one
*/

class bestScore
{
    
    public static void main(String[] args)
    {
        int size = 10;
        int[] counts = new int[size];

        for(int i =0; i < size; i++)
        {
            counts[i] = 0;
            System.out.println(counts[i] + "\n");
        }

        int[] bonus = new int[15];
        for(int i = 0; i < 15; i++)
        {
            bonus[i] += 1;
        }

        int[] bestScores = {95, 87, 92, 100, 85};
        for(int i = 0; i < 5; i++)
        {
            System.out.println(bestScores[i] + "\n");
        }
    }
}