public class Complex {
    int a,b;
    Complex(int real ,int imaginary){
        a=real;
        b=imaginary;
    }
    Complex(int real){
        a=real;
        b=9;
    }
    public static void main(String[] args) {
        Complex obj1=new Complex(2,3);
        Complex obj2=new Complex(6);
        obj1.print();
        obj2.print();
    }
    void print(){
        System.out.println( a+"i+"+b);
    }
}
