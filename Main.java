//Selection & Insertion Sorts
import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

class U7_SortsPP
{
  public static void main (String str[]) throws IOException 
  {
    
    int[] elements = {21, 17, 60, 20, 56, 12};
    System.out.println("Printing unsorted array:");      //1) printint the elements before the loop starts to show the starting positions.
    for (int print: elements)
    {
       System.out.print(print + ", ");
    }
    //Selection Sort
    for (int j = 0; j < elements.length -1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < elements.length; k++)
      {
        if (elements[k] < elements[minIndex])
        {
          minIndex = k;
        }
      }
      int temp = elements[j];
      elements[j] = elements[minIndex];
      elements[minIndex] = temp;

      
      System.out.println("Printing each pass in the selection sort algorithm.");
      for (int print: elements)
      {
         System.out.println(print + ", ");
      }
    }
    
    for (int num : elements)
    {
      System.out.println(num);
    }



    
    

    //Insertion Sort
    int[] elements2 = {21, 17, 60, 20, 56, 12};
    for (int stuff: elements2)
      {
        System.out.println(stuff + ", ");
      }
    
    for (int j = 1; j < elements2.length; j++)
    {
      int temp = elements2[j];
      int possibleIndex = j;
      while (possibleIndex > 0 && temp < elements2[possibleIndex - 1])
      {
        elements2[possibleIndex] = elements2[possibleIndex - 1];
        possibleIndex--;
      }
      elements2[possibleIndex] = temp;


      System.out.println("Printing each pass of the insertion sort algorithm");
      for (int print: elements2)      //Printing.
      {
        System.out.print(print + ", ");
      }  
    }

    for (int num : elements2)
    {
      System.out.println(num);
    }




    

    //2 with strings.

    String[] words1 = {"hey", "how", "are", "you", "doing"};
    for (String stuff: words1)
    {
      System.out.println(stuff + ", ");
    }

    for (int j = 0; j<words1.length-1; j++)    //Selection sort.
    {
      int minIndex = j;
      for (int k = j + 1; k < words1.length; k++)
      {
        if (words1[k].compareTo(words1[minIndex]) < 0)
        {
          minIndex = k;
        }
      }
      String tempVar = words1[j];
      words1[j] = words1[minIndex];
      words1[minIndex] = tempVar;

      System.out.println("Printing each pass through the algorithm");
      for (String elementss: words1)    //printing.
      {
        System.out.println(elementss + ", ");
      }
    }



    
    
    String[] words2 = {"hey", "how", "are", "you", "doing"};
    for (String stuff: words2)
    {
      System.out.println(stuff + ", ");
    }

    for (int i = 1; i < words2.length; i++) 
    {
      String possibleIndex = words2[i];
      int j = i - 1;
      while (j >= 0 && possibleIndex.compareTo(words2[j]) < 0) 
      {
        String y = words2[j + 1];
        possibleIndex = words2[j + 1, words2[j]];
        possibleIndex = words2[j, y];
        j--;
      }
      String y = possibleIndex.get[j + 1];
      y = possibleIndex;
  }

    for (int num : elements2)
    {
      System.out.println(num);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////
    


    //int[] elements = {21, 17, 60, 20, 56, 12};
    ArrayList<Integer> elementsAgain = new ArrayList<Integer>();
    elementsAgain.add(21);
    elementsAgain.add(17);
    elementsAgain.add(60);
    elementsAgain.add(20);
    elementsAgain.add(56);
    elementsAgain.add(12);
    
    System.out.println("Printing unsorted array:");      //1) printint the elements before the loop starts to show the starting positions.
    System.out.println(elementsAgain);
    //Selection Sort
    for (int j = 0; j < elementsAgain.size()-1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < elementsAgain.size(); k++)
      {
        if (elementsAgain.get(k) < elementsAgain.get(minIndex))
        {
          minIndex = k;
        }
      }
      int temp = elementsAgain.get(j);
      elementsAgain.get(j) = elementsAgain.get(minIndex);
      elementsAgain.get(minIndex) = temp;

      
      System.out.println("Printing each pass in the selection sort algorithm.");
      System.out.println(elementsAgain)
    }
    System.out.println(elements2Again);




    ArrayList<Integer> elements2Again = new ArrayList<Integer>();
    elements2Again.add(21);
    elements2Again.add(17);
    elements2Again.add(60);
    elements2Again.add(20);
    elements2Again.add(56);
    elements2Again.add(12);
    
    System.out.println("Printing unsorted array" + elements2Again);          //1) printing the elements before the loops to show their starting positions.
    for (int j = 1; j < elements2Again.size(); j++)
    {
      int temp = elements2Again.get(j);
      int possibleIndex = j;
      while (possibleIndex > 0 && temp < elements2Aghain.get(possibleIndex - 1))
      {
        elements2Again.get(possibleIndex) = elements2Again.get(possibleIndex - 1);
        possibleIndex--;
      }
      elements2.get(possibleIndex) = temp;


      System.out.println("Printing each pass of the insertion sort algorithm");
      System.out.println(elements2Again); 
    }

    System.out.println(elements2Again);

    

    

    ArrayList<String> words1Again = new Arraylist<String>();
    words1Again.add("hey");
    words1Again.add("how");
    words1Again.add("are");
    words1Again.add("you");
    words1Again.add("doing");

    System.out.println("Starting elements in the array:" + words1);

    for (int j = 0; j<words1Again.size()-1; j++)    //Selection sort.
    {
      int minIndex = j;
      for (int k = j + 1; k < words1Again.size(); k++)
      {
        if (words1Again.get(k).compareTo(words1Again.get(minIndex)) < 0)
        {
          minIndex = k;
        }
      }
      String tempVar = words1Again.get(j);
      words1Again.get(j) = words1Again.get(minIndex);
      words1Again.get(minIndex) = tempVar;

      System.out.println("Printing each pass through the algorithm");
      System.out.println(words1Again);
    }


    ArrayList<String> words2Again = new Arraylist<String>();
    words1Again.add("hey");
    words1Again.add("how");
    words1Again.add("are");
    words1Again.add("you");
    words1Again.add("doing");

    System.out.println(words2Again);

    for (int i = 1; i < words2Again.size(); i++) 
    {
      String possibleIndex = words2Again.get(i);
      int j = i - 1;
      while (j >= 0 && possibleIndex.compareTo(a.get(j)) < 0) 
      {
        String y = words2Again.get(j + 1);
        possibleIndex.set(j + 1, words2Again.get(j));
        possibleIndex.set(j, y);
        j--;
      }
      String y = words2Again.get(j + 1);
      y = possibleIndex;
  }

    System.out.println(words2Again);

    


  }
}
  