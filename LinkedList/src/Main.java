import java.util.LinkedList;

public class Main {
    public static void main(String args[]){

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(4);
        linkedList.addLast(3);
        linkedList.add(5);
      //  System.out.println(linkedList.peek());
        linkedList.add(1,10);


        for(int list: linkedList){
            System.out.println(list);
    }
}
}
