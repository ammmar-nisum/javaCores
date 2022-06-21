import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

class intWrapper{
    public int intValue;

    public intWrapper(int intValue) {
        this.intValue = intValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }
}
public class Main {
    public static void main(String args[]){

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.remove(2);
        integers.clear();

        for(Integer integer: integers){
            System.out.println(integer);
        }

        Stack<Integer> myStack = new Stack<>();
//        myStack.push(5);
//        myStack.push(4);
//        myStack.push(6);
//        //System.out.println(myStack.pop());
        //System.out.println(myStack.pop());
        System.out.println(myStack.empty());


    }
}

