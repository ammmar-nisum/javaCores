public class Person implements isAlive,LiveLife {


    public void dummy(){
        System.out.println("hello from parent class");
    }
    @Override
    public void living() {
        System.out.println("person is living");
    }

    @Override
    public void breath() {
        System.out.println("person is breathing");
    }
}
