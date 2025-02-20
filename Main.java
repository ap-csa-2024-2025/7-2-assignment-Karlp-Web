import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    




    ArrayList <Integer> naming = new ArrayList <Integer> ();
    naming.add(new Integer(1));
    naming.add(new Integer(2));
    naming.add(new Integer(3));
    naming.add(new Integer(4));
    naming.add(new Integer(5));

    for (int i = 0; i < naming.size(); i++)
    {
      System.out.println(naming.get(i));
    }

    int i = 0
    while (i < naming,size())
    {
      System.out.println(naming.get(i));
      i++
    }

    for (Integer N : naming)
    {
      system.out.println(N); //calls toString
      System.out.println(N.intvalue()); //intValue gets the value of the Integer
    }




     //a regular array making
    int elem = 0;
    int[] name = {1,2,3,4,5} //making a regular array
    for (int i = 0; i < name.length(); i++) //for each
    {
      int elem = name[i]; //could just run        System.out.println(name[i]);
      System.out.println(elem);
    }







    Scanner sc = new Scanner(System.in);
    String input = "";

    while (!input.equals("STOP"))
    {
      System.out.println("infinite loop! replace with your code");
    }
  }

  // Problem 2 - HighestNum
  public static Integer highestNum(ArrayList<Integer> arr)
  {
    Array <Integer> num = new ArrayList <Integer> ();

    int max = 0;
    for (Integer I : ARR)
    {
      int current = I.intValue();
      if (current > max)
      {
        max = current;
      }
    }
    return max;
  }

  // Problem 3 - getEvens
  public static ArrayList<Integer> getEvens(final ArrayList<Integer> arr)
  {
    Array <Integer> Temp = new ArrayList <Integer> ();
    
    for (int = 0; i < arr.size(); i++) //for loop using i
    {
      if (arr.get(i).intValue() % 2 ==0)
      {
        temp.add(arr,get(i));
      }
    }

    for (Integer N : arr) //ehanced for loop 
    {
      if (N.intValue() % 2 == 0) {temp.add(N);}
    }
    return temp;

  }
}
