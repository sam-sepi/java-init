/**
 * Loops in JAVA
 */

public class LoopsInJava 
{
    public static void main(String[] args) 
    {
        //FOR loop
        for (int i = 0; i < 5; i++) 
        {
            System.out.println(i); //from 0 to 5
        }

        char MyName[] = {'s', 'a', 'm'};

        for(int i = 0; i < MyName.length; i++)
        {
            System.out.println(MyName[i]); //print s a m
        }

        //There is also a "for-each" loop, which is used exclusively to loop through elements in an array
        String[] sports = {"Football", "Basketball", "Rugby", "Soccer"};
        
        for (String i : sports) 
        {
            System.out.println(i); //print Football  Basketball  Rugby  Soccer
        }

        //The while loop loops through a block of code as long as a specified condition is true
        int i = 0;

        while (i < 5) 
        {
            System.out.println(i); //print from 0 to 4
            i++;
        }
    }
}