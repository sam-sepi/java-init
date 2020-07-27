public class TypesInJava
{
    /**
     * PRIMITIVE
     */

    // A primitive data type specifies the size and type of variable values, and it has no additional methods.

	int myInt = 5;                  // Integer (whole number) 32 bit
    float myFloat= 5.99f;           //Floating point number 32 bit
    double myDouble = 19.99d;       //The double data type can store fractional numbers from 1.7e−308 to 1.7e+308. 
                                    //Note that you should end the value with a "d".     
	char myChar = 'D';              //16 bit from \u0000 to u\FFFF (0 - 65535)
	boolean myBool = true;          // Boolean 8 bit
    long myLong = 15000000000L;     //64 bit The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807. 
                                    //This is used when int is not large enough to store the value. Note that you should end the value with an "L":
    short myShort = 5000;           //16 bit The short data type can store whole numbers from -32768 to 32767:
    
    //The byte data type can store whole numbers from -128 to 127. 
    //This can be used instead of int or other integer types to save memory when you are certain that the value will be within -128 and 127:
    byte myByte = 100;              //8 bit

    /**
     * STRING
     */

    //The String data type is used to store a sequence of characters (text). String values must be surrounded by double quotes:
    String myText = "Hello World";  // String 

    /**
     * CONSTANT
     */
    //A constant is a variable whose value cannot change once it has been assigned. Java doesn't have built-in support for constants.
    final float pi = 3.14f;

    /**
     * main
     */
	public static void main(String[] args) 
	{
        TypesInJava t = new TypesInJava();

        System.out.println(t.myText);
        System.out.println(t.myByte);
        System.out.println(t.pi);

        //t.pi = 2; -> types.java:47: error: cannot assign a value to final variable pi
	}
}