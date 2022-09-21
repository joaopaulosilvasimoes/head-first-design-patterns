package _10_state.self_implementation_version_2;

import java.text.MessageFormat;

public class GumballMachine {
    
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    // Initial State.
    State state = soldOutState;
    int count = 0;

    public GumballMachine(int numberGumballs) {

        //
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        //
        this.count = numberGumballs;

        if (count > 0) {

            state = noQuarterState;

        }

    }

    // States Transitions.
    public void insertQuarter() {

        state.insertQuarter();      

    } 

    public void ejectQuarter() {

        state.ejectQuarter();      

    } 

    public void turnCrank() {

        state.turnCrank();
        state.dispense();     

    }

    // Aux methods
    public State getState() {
     
        return state;
    
    }

    public void setState(State state) {
    
        this.state = state;
    
    }

    public int getCount() {
     
        return count;
    
    }

    public void setCount(int count) {
    
        this.count = count;
    
    }

    public State getSoldOutState() {
     
        return soldOutState;
    
    }

    public State getNoQuarterState() {
     
        return noQuarterState;
    
    }

    public State getHasQuarterState() {
     
        return hasQuarterState;
    
    }

    public State getSoldState() {
    
        return soldState;
    
    }

    public State getWinnerState() {
     
        return winnerState;
    
    }

    public void releaseBall() {

        System.out.println("A gumball comes rolling out the slot...");

        if (count > 0) {

            count--;

        }

    }

    @Override
    public String toString() {

        return MessageFormat.format("""
        \n 
        Mighty Gumball, Inc \n
        Java-enabled Standing Gumbal Model #2004 \n
        Inventory: {0} \n
        State: {1} \n
        """, count, getState());
    }

}
