abstract class Sample2{
    abstract void remane();

    public void test() {
    }
}
public class Sample {
    Sample2 sample2 = new Sample2() {
        @Override
        void remane() {
            System.out.println("This is sample 2 function");
        }
        public void test(){
            System.out.println("test funct");
        }
    };
}
