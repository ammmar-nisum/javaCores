import java.sql.SQLOutput;

public class Main {
    public static void main(String args[]){
        Door door = new Door();
        args[0] = "qwerty";
        args[1] = "test";
        args[2] = "local";
        if(door.isLocked(args[0])){
            System.out.println("Shop is closed");
        }else {
            System.out.println("welcome");
        }
        System.out.println(args[1]);
        System.out.println(args[2]);
    }

}
