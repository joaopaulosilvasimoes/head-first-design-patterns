package _07_1_adapter.java_implementation;

import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class TestDrive {

    public static void main(String[] args){

        //
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Element ArrayList 1");
        arrayList.add("Element ArrayList 2");
        arrayList.add("Element ArrayList 3");

        testIterator(arrayList.iterator());

        //
        Vector<String> vector = new Vector<String>();

        vector.add("Element Vector 1");
        vector.add("Element Vector 2");
        vector.add("Element Vector 3");    

        EnumerationIteratorAdapter enumerationIteratorAdapter = new EnumerationIteratorAdapter(vector.elements());

        testIterator(enumerationIteratorAdapter);

    }

    static void testIterator(Iterator iterator){

        System.out.println("OPERATION - hasNext()");
        System.out.println(iterator.hasNext());

        System.out.println("OPERATION - next()");
        System.out.println(iterator.next());

        System.out.println("OPERATION - remove()");
        iterator.remove();

    }
    
}
