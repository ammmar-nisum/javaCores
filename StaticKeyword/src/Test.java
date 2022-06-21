public class Test {
        private static int var = 2;
        public void accessInner(){
            System.out.println("value of age is :" + Inner.age);
            Inner.func();
        }
   public static class Inner{
        public static int age = 0;
       public static void func(){
            System.out.println("function :" + var);
        }
    }

}
