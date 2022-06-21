package org;

public class App {
    public static void main(String args[]){
        App app = new App();
        app.cal(10,0);

    }
    void cal(int x, int y){
        try{
            System.out.println(x/y);
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Arithmatic Exception");
        }finally {
            System.out.println("this code will be run");
        }
    }
}
