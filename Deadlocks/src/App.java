public class App {
    public static void main(String[] args){
        String lock1 = "lock1";
        String lock2 = "lock2";

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1){
                    System.out.println("Inside thread 1 on lock 1");
                    synchronized (lock2){}
                    System.out.println("Inside Thread 1 on lock 2");
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock2){
                    System.out.println("Inside thread 2 on lock 2");
                    synchronized (lock1){}
                    System.out.println("Inside Thread 2 on lock 1");
                }
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("I am inside main method");
    }
}
