//PriorityQueue

import java.util.PriorityQueue;

class PriorityQueueDemo{
    public static void main(String[]args){
        PriorityQueue pq=new PriorityQueue();
        pq.offer(20);
        pq.offer(10);
        pq.offer(50);
        pq.offer(30);
        pq.offer(40);

        System.out.println(pq);     //[10, 20, 50, 30, 40]
    }
}