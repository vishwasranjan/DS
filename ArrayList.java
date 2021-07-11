public class ArrayList
{
    int size=0;
    int capacity=5;
    int arr[]=null;
    public ArrayList()
    {
        this.arr=new int[capacity];
    }
    public ArrayList(int capcity)
    {
        this.capcity=new capacity;
        this.arr=new int[capacity];
    }
    public void add(int data)
    {
        ensurecapacity();
        arr[size++]=data;
        System.out.println(data+" is inserted");
    }
    public void add(int data,int index)
    {
        ensurecapacity();
        if(index>(size-1)||index<0)
        {
            System.out.println("Array is out of bound condition");
            return ;
        }
        for(int i=size;i>index;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[index]=data;
        size++;
        System.out.println(data+" is inserted at index = "+index);
    }
    @Override
    public String toString()
    {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("[");
        for(int i=0;i<size;i++)
        {
            stringBuilder.append(arr[i]).append(",");
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
    public void remove(int index)
    {
        if(index>(size-1)||index<0)
        {
            System.out.println("Index is out of bund condition");
            return;
        }
        int data=arr[index];
        for(int i=index;i<size;i++)
        {
            arr[index]=arr[index+1];
        }
        System.out.println(data+" is removed");
        size--;
    }

    public void indexof(int data)
    {
        int index=-1;
        for(int i=0;i<size;i++)
        {
            if(data==arr[i])
            {
                index=i;
                break;
            }
            
        }
        System.out.println("Index of "+data+" is "+index);
    }
    public void ensurecapacity()
    {
        if(size==capacity)
        {
            System.out.println("Array is overflow");
            capacity=capacity+(capacity>>1);
            int newarr[]=new int[capacity];
            System.out.println("New Capacity = "+capacity);
            for(int i=0;i<size;i++)
            {
                newarr[i]=arr[i];
            }
            this.arr=newarr;
        }
    }
    public static void main(String args[])
    {
        ArrayList al=new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        System.out.println(al);
        al.add(5,1);
        System.out.println(al);
        al.indexof(20);
        al.indexof(22);
    
        
    }
}