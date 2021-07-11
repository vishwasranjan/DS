public class CircularQueue
{
	int arr[]=null;
	int front=0;
	int rear=-1;
	int capacity=3;
	int size=0;
	
	public CircularQueue()
	{
		this.arr=new int[capacity];
	}
	
	public CircularQueue(int capacity)
	{
		this.capacity=capacity;
		this.arr=new int[capacity];
	}
	
	public void enqueue(int data)
	{
		if(size==capacity)
		{
			System.out.println("Queue is full cant insert");
			return;
		}
		rear=(rear+1)%capacity;
		arr[rear]=data;
		size++;
		System.out.println(data+" is enqueued");
		System.out.println("After enqueue rear is "+rear);
	}
	public void dequeue()
	{
		if(size==0)
		{
			System.out.println("Queue is empty");
			return;
		}
		int data=arr[front];
		front=(front+1)%capacity;
		size--;
		System.out.println(data+" is dequeued from Queue");
		System.out.println("Front value of Queue is "+front);
	}
	
	public int size()
	{
		return size;
	}
	
	public static void main(String args[])
	{
	CircularQueue q=new CircularQueue();
	q.enqueue(10);
	q.enqueue(20);
	q.enqueue(30);
	q.enqueue(40);
	q.dequeue();
	q.dequeue();
	
	System.out.println("Size of Queue is "+q.size());
	q.enqueue(40);
	}
	
}