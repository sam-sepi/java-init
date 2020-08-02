import cats.*;

public class Catthulhu
{
    public static void main(final String[] args) 
    {
        for (String arg : args) 
        {
            switch (arg) 
            {
                case "Catacrobat":
                    Cat acrobat = new Catacrobat();
                    acrobat.getActions();
                    break;
                
                case "Pussyfoot":
                    Cat pussy = new Pussyfoot();
                    pussy.getActions();
                    break;
                
                case "Scrapper":
                    Cat scrapper = new Scrapper();
                    scrapper.getActions();
                    break;
                
                case "Tiger":
                    Cat tiger = new TigerDreamer();
                    tiger.getActions();
                    break;
                
                case "Twofoot":
                    Cat twofoot = new Twofoot();
                    twofoot.getActions();
                    break;

                default:
                    System.out.println("You are a dog?");
            }
        }
    }
}