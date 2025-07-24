public class testP {
    int age;
    String name;
    testP(int a,String b){
        age = a;
        name = b;
    }
    void Display(){
        System.out.println("age="+age);
        System.out.println("name="+name);
    }
    
}
class demo8{
   public static void main(String[] args){
    testP te = new testP(21,"sachin");
    te.Display();
   }
}
