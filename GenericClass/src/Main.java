import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Data<T>{
    private T data;
    public Data(){}
    public Data(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Data{" +
                "data=" + data +
                '}';
    }

    public void printList(List list){
        ListIterator<Data> listIterator = list.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next().getData());
        }
    }
}
public class Main {
    public static void main(String[] args){
        List<Data<Object>> elements = new ArrayList();
        elements.add(new Data(12));
        elements.add(new Data("ammar"));
        elements.add(new Data(33.23));
        elements.add(new Data("shaiq"));
        Data d = new Data();
        d.printList(elements);




    }
}


