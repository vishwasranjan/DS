public class Stack {
    int arr[];
    int capacity=5;
    int top=-1;
    public Stack()
    {
		this.capacity=capacity;
        this.arr=new int[capacity];
    }
    public Stack(int c)
    {
	this.capacity=c;
        this.arr=new int[c];
    }
    public void push(int data)
    {
	if(isfull())
	{
		System.out.println("Stack is full can't be push further");
		return;
	}
	else{
        	top++;
        	arr[top]=data;
        	System.out.println(data+" is Inserted");
	}
    }

    public void pop()
	{
	   if(isempty())
	{
		System.out.println("Stack is empty");
		return;
	}
	   int data=arr[top--];
	   System.out.println(data+" is Popped");
	}
     public boolean isfull()
	{
	return (top+1==capacity);
	}
     public boolean isempty()
	{
	return (top==-1);
	}	

    public static void main(String[] args)
    {
        Stack s=new Stack();
        s.push(5);
	s.push(10);
	s.push(25);
	s.push(20);
	s.push(100);
	s.push(200);
	s.pop();
	s.pop();
	s.pop();
	s.pop();
	s.pop();
	s.pop();
    }
    
}