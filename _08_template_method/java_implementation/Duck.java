package _08_template_method.java_implementation;

import java.text.MessageFormat;

public class Duck implements Comparable{

    private String name;
    private int weight;

    public Duck(String name, int weight){

        this.name = name;
        this.weight = weight;

    }

    @Override
    public int compareTo(Object o) {

        Duck otherDuck = (Duck) o;

        if (this.weight < otherDuck.weight){

            return -1;
        }
        else
        if (this.weight > otherDuck.weight){
        
            return 1;

        }
        else{

            return 0;

        }

    }

    @Override
    public String toString() {

        return MessageFormat.format("Duck: {0} - {1}", name, weight);
    
    }
    
}
