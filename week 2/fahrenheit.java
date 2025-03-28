import java.util.Scanner;
public class fahrenheit {
  public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
   System.out.println("enter temperature: ");
   int fahrenheit = input.nextInt ();
   int celsius = (fahrenheit-32)*5/9;
   System.out.println("Faherenheit: " +fahrenheit +"celsius: " + celsius);
   input.close();
 }
}