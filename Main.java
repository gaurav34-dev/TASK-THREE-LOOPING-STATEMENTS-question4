import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number to get the sum of n natural numbers");
      int q=s.nextInt();
      int sum=0;
      for(int i=1;i<=q;i++)
        {
          //System.out.println(i);
          sum=sum+i;
        }
      System.out.println(sum);
    }
}
