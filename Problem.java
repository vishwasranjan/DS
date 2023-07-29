import java.util.Scanner;
public class Problem{
    public static void Puzzle()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Welcome to my Game \n You need to follow the instructions till the last");
        System.out.println("Press Enter to proceed");
        obj.nextLine();
        System.out.println("Think about a no in between 1-10");
        obj.nextLine();
        System.out.println("Multiply by 2");
        obj.nextLine();
        System.out.println("Add 8");
        obj.nextLine();
        System.out.println("Divide by 2");
        obj.nextLine();
        System.out.println("Subtract the original no you think very first");
        obj.nextLine();
        System.out.println("Whatever you get assign like \n 1->A\n 2->B \n 3->C \n 4->D");
        obj.nextLine();
        System.out.println("Think about a state name from that letter");
        obj.nextLine();
        System.out.println("Pick the second letter from beginning from that word");
        obj.nextLine();
        System.out.println("Think about a animal name from that");
        obj.nextLine();
        System.out.println("Let me guess...............Loading");
        obj.nextLine();
        System.out.println("Elephant");
        System.out.println("Thanks for playing");

    }
    public static void main(String args[])
    {
        System.out.println("Hello");
        Puzzle();
    }
}