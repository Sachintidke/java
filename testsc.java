import java.util.Scanner;

public class testsc {
  
   public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    testsc d = new testsc();

    System.out.println("Enter a number 1");
    int num1 = sc.nextInt();
    System.out.println("Enter a number 2");
    int num2 = sc.nextInt();
    
    int sum = d.add(num1,num2);
           
           d.display(sum);
           sc.close();
    
   }
   public int add (int a, int b){
    return a+b;
   }
   public void display (int sum){
    System.out.print("sum="+sum);
   }
    
}
