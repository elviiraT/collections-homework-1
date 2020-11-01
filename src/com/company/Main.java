package com.company;
import ibadts.IBCollection;

public class Main
{

    public static void main(String[] args)
    {
        IBCollection <String> names = new IBCollection<>();
        names.addItem("John");
        names.addItem("Marie");
        for (int count = 0; count <= 2; count++)
        {
            names.resetNext();
            while(names.hasNext())
                System.out.println(names.getNext());

        }
    }
}
