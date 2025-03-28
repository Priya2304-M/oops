import java.util.Scanner;
public class factorialno {
public static void main(String[] args){
Scanner Scanner=new Scanner (System.in);
System.out.println ("enter n");
int n=Scanner.nextInt();
long factorial = 1;
for(int i=1;i<=n;i++)
{
factorial*=i;
}
System.out.println("factoralnum="+factorial);
}
}

