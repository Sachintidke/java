public class test1 {
    public static void main(String[] args){
        test1 t = new test1();
        int sum = t.add();
        t.Display(sum);
    }
    public int add(){
        int a=10;
        int b=20;
        return a+b;
    }
    public void Display(int sum){
        System.out.println("sum="+sum);
    }
    
}
