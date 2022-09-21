package _10_state.self_implementation_version_2;

public class NoQuarterState implements State {

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {

        this.gumballMachine = gumballMachine;

    }

    @Override
    public void insertQuarter() {

        gumballMachine.setState(gumballMachine.getHasQuarterState());
        System.out.println("You inserted a quarter");        
        
    }

    @Override
    public void ejectQuarter() {

        System.out.println("You haven't inserted a quarter");
        
    }

    @Override
    public void turnCrank() {

        System.out.println("You turned but there's no quarter");
        
    }

    @Override
    public void dispense() {

        System.out.println("You need to pay first");
        
    }

    @Override
    public String toString() {

        return "NO_QUARTER";

    }
    
}
