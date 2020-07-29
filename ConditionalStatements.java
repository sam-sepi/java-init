public class ConditionalStatements
{
    /**     if (condition) 
     *      {
     *          // block of code to be executed if the condition is true
     *      }
    */

    /**
     *      if (condition) {
     *          // block of code to be executed if the condition is true
     *      } else {
     *          // block of code to be executed if the condition is false
     *      }
     * 
     */ 

    /**
     *      if (condition1) {
     *          // block of code to be executed if condition1 is true
     *      } else if (condition2) {
     *           // block of code to be executed if the condition1 is false and condition2 is true
     *      } else {
     *          // block of code to be executed if the condition1 is false and condition2 is false
     *      }
     */
    
     /**
      *     Ternary Operator
      *     variable = (condition) ? expressionTrue :  expressionFalse;
      */

    
    public static void main(String[] args) 
    {
        String name = "Sam";

        if(name == "Sam")
        {
            System.out.println("Hey");
        }
        else
        {
            System.out.println("Hay");
        }

        String greet = (name == "Sam") ? "Hey" : "Hay";

        System.out.println(greet);
    }
}