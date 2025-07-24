public class test4 {
    int number;
    String name;
    test4(){
        number = 0;
        name = null;
    }
    void Display(){
        System.out.println("number="+number+"name="+name);

    }
    class demo3{
        public static void main(String[] args){
            test4 te = new test4();
            te.Display();

        }
    }
    
}
