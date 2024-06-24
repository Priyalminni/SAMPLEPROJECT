public class MainTest{

    MainTest(){
        System.out.println("meoww");
    }
    
    public void print(){
        System.out.println("hi");
    } 
}

class SubClass extends MainTest{
    public SubClass(){
        System.out.println("hello!");
    }
    public static void main(String[] args) {
        SubClass s = new SubClass();

    }
}