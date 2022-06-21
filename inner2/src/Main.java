class Outer{
    void display(){
        System.out.println("Hello World");
    }
    void print(){
        System.out.println("Print");
    }

}

public class Main {
    public static  void main(String[] args){

        Outer outer = new Outer(){
            void display(){
                System.out.println("INNER ");
            }
            void print(){
                System.out.println("PRINT2");
            }
        };
        outer.display();
        outer.print();
        Outer a=new Outer();
        a.display();
        a.print();
    }
}
