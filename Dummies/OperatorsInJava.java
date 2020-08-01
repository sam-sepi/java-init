/**
 * Arithmetic operators are used to perform common mathematical operations.
 * 
 *  Operator	Name	Description	Example	
 *       +	Addition	Adds together two values	x + y	
 *       -	Subtraction	Subtracts one value from another	x - y	
 *       *	Multiplication	Multiplies two values	x * y	
 *       /	Division	Divides one value by another	x / y	
 *       %	Modulus	Returns the division remainder	x % y	
 *       ++	Increment	Increases the value of a variable by 1	++x	
 *       --	Decrement	Decreases the value of a variable by 1	--x
 */

 /**
  * A list of all assignment operators

  * Operator	Example	Same As	
  *     =	    x = 5	x = 5	
  *     +=	    x += 3	x = x + 3	
  *     -=	    x -= 3	x = x - 3	
  *     *=	x   *= 3	x = x * 3	
  *     /=	x   /= 3	x = x / 3	
  *     %=	x   %= 3	x = x % 3	
  *     &=	x   &= 3	x = x & 3	
  *     |=	x   |= 3	x = x | 3	
  *     ^=	x   ^= 3	x = x ^ 3	
  *     >>=	x   >>= 3	x = x >> 3	
  *     <<=	x   <<= 3	x = x << 3
  */

/**
 *  Comparison operators are used to compare two values
 *  Operator	Name	Example	
 *   ==	Equal to	x == y	
 *   !=	Not equal	x != y	
 *   >	Greater than	x > y	
 *   <	Less than	x < y	
 *   >=	Greater than or equal to	x >= y	
 *   <=	Less than or equal to	x <= y
 */

/**
 * Logical operators are used to determine the logic between variables or values
 * Operator	Description	                                                Example	
 *   && 	    Logical and	Returns true if both statements are true	x < 5 &&  x < 10	
 *   || 	    Logical or	Returns true if one of the statements is true	x < 5 || x < 4	
 *   !	    Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)
 */

public class OperatorsInJava
{
    int myInt = 34;
    boolean myBool = true;

    public static void main(String[] args) 
    {
        OperatorsInJava o = new OperatorsInJava();

        if((o.myBool) && (o.myInt == 34))
        {
            System.out.println("It's true");
        }
    }
}