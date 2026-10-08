public class RunnableThreads {
    public static void main(String[] args) {
        Runnable obj1 = () -> {
            for (int i = 1 ; i <= 1000;  i++){
                System.out.println("Hi");
                try {
                    Thread.sleep(10);
                } catch (Exception e){
                    System.out.println("Error");
                }
                }
        };

        Runnable obj2 = () -> {
            for (int i = 1; i <= 1000; i++){
                System.out.println("hello");
                try {
                    Thread.sleep(10);
                } catch (Exception e){
                    System.out.println("Err");
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}
