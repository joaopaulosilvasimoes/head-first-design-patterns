package _10_state.self_implementation_version_2;

import java.util.Random;

public class HasQuarterState implements State {

    GumballMachine gumballMachine;
    Random randomWinner = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine gumballMachine) {

        this.gumballMachine = gumballMachine;

    }

    @Override
    public void insertQuarter() {

        System.out.println("You can't insert another quarter");
        
    }

    @Override
    public void ejectQuarter() {

        gumballMachine.setState(gumballMachine.getNoQuarterState());
        System.out.println("Quarter returned");
        
    }

    @Override
    public void turnCrank() {

        int winner = randomWinner.nextInt(10);

        // Test Winner State
        if ((winner == 0) && (gumballMachine.getCount() > 1)) {

            gumballMachine.setState(gumballMachine.getWinnerState());            

        }
        else {

            gumballMachine.setState(gumballMachine.getSoldState());
            
        }

        System.out.println("You turned...");

    }

    @Override
    public void dispense() {

        System.out.println("No gumball dispensed");
        
    }

    @Override
    public String toString() {

        return "HAS_QUARTER";

    }
    
}
