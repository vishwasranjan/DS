import java.util.*;
public class QueueStack
{
   private Stack enqueue_stack=null;
   private Stack dequeue_stack=null;
   //int capacity=5;
   public QueueStack()
   {
      this.enqueue_stack=new Stack<>();
      this.dequeue_stack=new Stack<>();
   }
   // public QueueStack(int capacity)
   // {
   //    this.capacity=capacity;
   //    this.enqueue_stack=new Stack<>(capacity);
   //    this.dequeue_stack=new Stack<>(capacity);
   // }
   public void enqueue(int data)
   {
      
      enqueue_stack.push(data);
      System.out.println(data + " inserted");
   }
   public void dequeue()
   {
      if(enqueue_stack.isEmpty())
      {
         System.out.println("Queue is Empty");
         return ;
      }
      while(!enqueue_stack.isEmpty())
      {
         dequeue_stack.push(enqueue_stack.pop());

      }
      System.out.println( dequeue_stack.pop()+" is dequeued");
      while(!dequeue_stack.isEmpty())
      {
         enqueue_stack.push(dequeue_stack.pop());

      }

   }
   public void rear()
   {
      if (enqueue_stack.isEmpty())
       {
         System.out.println("Queue is empty");
         return ;
      }
      System.out.println("Rear value is "+enqueue_stack.peek());
   }
  

   public void size()
   {
      System.out.println(" Size of stack is "+enqueue_stack.size());
      System.out.println(" Capacity of stack is "+enqueue_stack.capacity());
   }
   public static void main(String args[]) {
      QueueStack qs = new QueueStack();
      qs.enqueue(100);
      qs.enqueue(200);
      qs.enqueue(300);
      qs.enqueue(400);
      qs.enqueue(500);
      qs.enqueue(600);
      qs.enqueue(700);
      qs.enqueue(800);
      qs.enqueue(900);
      qs.enqueue(1000);
      qs.size();
      qs.rear();
      qs.dequeue();
      qs.dequeue();
      qs.dequeue();
      qs.dequeue();
      qs.dequeue();
      qs.dequeue();
      qs.dequeue();
      qs.dequeue();
      qs.dequeue();
      qs.dequeue();
      qs.dequeue();
      qs.size();

   }
   
}