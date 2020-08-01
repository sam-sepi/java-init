/**
 * Array in Java
 * 
 * Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
 */
public class ArrayInJava 
{
    int a[];

    int b, c[], d;

    boolean[] booleanArray = new boolean[]{true, false, true, false}; //declare the array first and then initialize it. The cast is necessary here.

    String usernames[] = {"sam", "john", "bob"}; //type ident.[] or

    char[] name = {'s', 'a', 'm'}; //type[] ident.

    //Bid. Array
    //A multidimensional array is an array containing one or more arrays.
    //To create a two-dimensional array, add each array within its own set of curly braces

    int bid[][] = { {1, 2, 3}, {4, 5, 6} };

    //multidim. array string
    String[][] namesAndNick = { 
        {"Sam", "John"}, {"Dilettante", "Doe"} 
    };

    public static void main(String[] args) 
    {
        ArrayInJava aij = new ArrayInJava();

        aij.a = new int[5];

        System.out.println(aij.a.length);

        aij.b = 3;
        aij.d = 5;

        aij.c = new int[]{1, 2, 3};

        System.out.println(aij.c.length);
        System.out.println(aij.b);
        System.out.println(aij.d);

        System.out.println(aij.booleanArray[0]);

        System.out.println(aij.usernames[2]);

        System.out.println(aij.name[2]);

        //bidimens. array
        System.out.println(aij.bid[0][1]);
        System.out.println(aij.namesAndNick[0][1]);
    }
}