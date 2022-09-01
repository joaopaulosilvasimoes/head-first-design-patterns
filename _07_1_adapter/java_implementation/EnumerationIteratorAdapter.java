package _07_1_adapter.java_implementation;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIteratorAdapter implements Iterator {
    
    Enumeration enumeration;

    public EnumerationIteratorAdapter(Enumeration enumeration){

        this.enumeration = enumeration;

    }

    @Override
    public boolean hasNext() {

        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {

        return enumeration.nextElement();
    }

    
    @Override
    public void remove() {

        throw new UnsupportedOperationException();

    }

}
