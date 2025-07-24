import java.util.Scanner;
public class arithmatic {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number 1:-");
        int a=sc.nextInt();
        System.out.print("Enter the number 2:-");
        int b=sc.nextInt();

        arithmatic d = new arithmatic();
        int add=d.add(a,b);
        int sub=d.sub(a,b);
        int mul=d.mul(a,b);
        float div=d.div(a,b);

        d.display(add,sub,mul,div);

    }

    public int add(int a , int b){
        return a+b;
    }
    public int sub(int a , int b){
        return a-b;
    }
    public int mul(int a , int b){
        return a*b;
    }
    public int div(int a , int b){
        return a/b;
    }
    public void display(int add,int sub,int mul,float div){
        System.out.println("addition="+add);
        System.out.println("substraction="+sub);
        System.out.println("multiplication="+mul);
        System.out.println("division="+div);
    }
    
}
