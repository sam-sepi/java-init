/**
 * String methods in JAVA
 */

public class StringMeth
{
    String hello;

    public static void main(String[] args) 
    {
        StringMeth sm = new StringMeth();

        sm.hello = "Hello World";

        System.out.println(sm.hello);

        //The charAt() method returns the character at the specified index in a string.
        //The codePointAt() method returns the Unicode value of the character at the specified index in a string.
        //The concat() method appends (concatenate) a string to the end of another string.
        //The contains() method checks whether a string contains a sequence of characters. Bool.
        //The hashCode() method returns the hash code of a string.
        //The indexOf() method returns the position of the first occurrence of specified character(s) in a string.
        //The length() method returns the length of a specified string. The length of an empty string is 0.
        //The replace() method searches a string for a specified character, and returns a new string where the specified character(s) are replaced.
        //split() Splits a string into an array of substrings
        //substring() Extracts the characters from a string, beginning at a specified start position, and through the specified number of character
        //The toLowerCase() method converts a string to lower case letters.
        //The toUpperCase() method converts a string to upper case letters.
        //The trim() method removes whitespace from both ends of a string.

        System.out.println(sm.hello.contains("H"));
        System.out.println(sm.hello.length());

        String[] sp = sm.hello.split(" ");

        System.out.println(sp[0]);
    }
}