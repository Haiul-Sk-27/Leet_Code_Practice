public class DeadLockExample{
    static Object ObjectLock1 = new Object();
    static Object ObjectLock2 = new Object();
    
    public static class ThreadName1 extends Thread{
        public void run(){
            synchronized(ObjectLock1){
                System.out.println("Thread1: Has ObjectLock1");
                
                try{
                    Thread.sleep(100);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Thread 1: waiting for objectLock");
                
                synchronized(ObjectLock2){
                    System.out.println("Thread 1:No DeadLock");
                }
            }
        }
    }
    
    public static class ThreadName2 extends Thread{
        public void run(){
            synchronized(ObjectLock2){
                System.out.println("Thread 2: has ObjectLock2");
                
                try{
                    Thread.sleep(100);
                }catch(InterruptedException e){
                    e.printStackTrace();
                    synchronized(ObjectLock1){
                        System.out.println("Thread2 : no deadlock");
                    }
                }
            }
        }
    }
    
    public static void main(String args[]){
        ThreadName1 thread1 = new ThreadName1();
        ThreadName2 thread2 = new ThreadName2();
        thread1.start();
        thread2.start();
    }
}