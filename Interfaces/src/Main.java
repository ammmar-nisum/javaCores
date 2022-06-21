public class Main {
    public static void main(String args[]){
        Phone phone = new Samsung();
        System.out.println(phone.processor());
        Phone phone1 = new IPhone();
        System.out.println("Memory of Iphone is : " + phone1.spaceInGB());
    }
}
