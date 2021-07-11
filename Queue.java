public class Queue
{
  int arr[]=null;
  int rear=-1;
  int front=0;
  int capacity=5;

     public Queue()
	{
	this.arr=new int[5];
	}

     public Queue(int capacity)
	{
	this.capacity=capacity;
	this.arr=new int[capacity];
	}
	
	public boolean isFull()
	{
	return size()==capacity;
	}
	public boolean isEmpty()
	{
	return size()==front;
	}

     public void enqueue(int data)
	{
		if(isFull())
		{
		System.out.println("Queue is full");
		return;
		}
	rear=rear+1;
	arr[rear]=data;
	System.out.println(data+" is enqueued in queue");
	}
     public int size()
	{
	return rear+1;
	}
     
      public void dequeue()
	{
	if(isEmpty())
	{
	System.out.println("Queue is empty");
	return;
	}
	int data=arr[front];
	for(int i=front;i<rear;i++)
	{
	arr[i]=arr[i+1];
	}
	System.out.println(data+" is dequeuq from queuq");
	rear--;
	}

	public int rear()
	{
	if(isEmpty())
	{
	System.out.println("Queue is empty");
	return Integer.MIN_VALUE;
	}
	int data=arr[rear];
	return data;
	}

	public int front()
	{
	if(isEmpty())
	{
	System.out.println("Queue is empty");
	return Integer.MIN_VALUE;
	}
	int data=arr[front];
	return data;
	}


	public static void main(String[] args)
	   {
	      Queue q=new Queue();
	        q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		q.enqueue(70);
		System.out.println("Rear Value is "+q.rear());
		System.out.println("Front Value is "+q.front());
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
	   }
}