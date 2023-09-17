package Threads;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {



                Thread mainThread = Thread.currentThread();
                System.out.println("Thread name : " + mainThread.getName());
                System.out.println("Thread state : " + mainThread.getState());

                MyThread thread = new MyThread();
                thread.run();

                System.out.println("Thread name : " + thread.getName());
                System.out.println("Thread state : " + thread.getState());
            }
        }

