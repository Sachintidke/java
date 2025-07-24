public class test6 {
    int number;
    String name;
    
    test6(){
        number = 0;
        name = null;
    }
    void display(){
        System.out.println("number="+number+"name="+name);

    }
    class demo7{
        public static void main(String[] args){
            demo7 te = new demo7();
            te.display();
        }
    }
    
}
