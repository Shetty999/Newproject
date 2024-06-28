package Apache_poi;

import java.util.Scanner;
import java.util.TreeSet;

import static javax.swing.UIManager.get;

public class rough {
    public static void main(String args[])
    {
      int a[]={10,30,30,70,70,50,90};
        TreeSet s=new TreeSet();
        for(Integer i:a)
        {
            s.add(i);        //10,30,50,70,90
        }

          Object b[]=s.toArray();
        int i=b.length;
        System.out.println("first largest" +b[i-1]);
        System.out.println("sencond largest" +b[i-2]);







    }

}

