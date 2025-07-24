public class test5 {
    int number;
    String name;
    test5(){
        number = 0;
        name = null;
        System.out.println("This is Default Constructor");
        System.out.println("number=" +number+ "name=" +name);
    }
    class demo{
        public static void main(){
            test5 te = new test5();
        }
    }
    
}
