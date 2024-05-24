package Advanced.Multithreading.ProducerConsumerProblem;


class Queue {
    int x;
    boolean valueIndex = false;
    synchronized public void put(int j){
        try {
            if(valueIndex == true){
                wait();
            }else{

                x =j;
            System.out.println("I have produced the value in x "+ x);
            valueIndex = true;
            notify();
            }
        } catch (Exception e) {
            System.out.println("Exception occured " + e);
        }
    }
    synchronized public void get(){
        try {
            if(valueIndex == false){
                wait();
            }
            else{

                System.out.println("I have consumed value " + x);
                valueIndex = false;
                notify();
            }
        } catch (Exception e) {
            System.out.println("Exception occured "+ e);
        }
    }
}

class Producer extends Thread{
Queue q;
Producer(Queue q){
    this.q = q;
}
    public void run(){
        int i = 1;
        while (true) {
            q.put( i++);
        }
    }
}

class Consumer extends Thread{
    Queue q;
    Consumer(Queue q){
        this.q = q;
    }
      public void run(){
        while (true) {
            q.get();
        }
    }
}



public class ProducerConsumerProblem {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        producer.start();
        consumer.start();
    }
}
