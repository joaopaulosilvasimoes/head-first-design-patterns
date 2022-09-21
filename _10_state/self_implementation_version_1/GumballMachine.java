package _10_state.self_implementation_version_1;

import java.text.MessageFormat;

public class GumballMachine {
    
    // Initial State.
    GumballMachineStateEnum state = GumballMachineStateEnum.SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {

        this.count = count;

        if (count > 0) {

            state = GumballMachineStateEnum.NO_QUARTER;

        }

    }

    // States Transitions.
    public void insertQuarter() {

        if (state == GumballMachineStateEnum.HAS_QUARTER) {

            System.out.println("You can't insert another quarter");

        }
        else
        if (state == GumballMachineStateEnum.SOLD_OUT) {

            System.out.println("You can't insert a quarter, the machine is sold out");

        }
        else
        if (state == GumballMachineStateEnum.SOLD) {

            System.out.println("Please wait, we're already giving you a gumball");

        }
        else
        if (state == GumballMachineStateEnum.NO_QUARTER) {

            state = GumballMachineStateEnum.HAS_QUARTER;
            System.out.println("You inserted a quarter");

        }        

    } 

    public void ejectQuarter() {

        if (state == GumballMachineStateEnum.HAS_QUARTER) {

            state = GumballMachineStateEnum.NO_QUARTER;
            System.out.println("Quarter returned");

        }
        else
        if (state == GumballMachineStateEnum.NO_QUARTER) {

            System.out.println("You haven't inserted a quarter");

        }
        else
        if (state == GumballMachineStateEnum.SOLD) {

            System.out.println("Sorry, you already turned the crank");

        }
        else
        if (state == GumballMachineStateEnum.SOLD_OUT) {

            System.out.println("You can't eject, you haven't inserted a quarter yet");

        }        

    } 

    public void turnCrank() {

        if (state == GumballMachineStateEnum.SOLD) {

            System.out.println("Turning twice doesn't get you another gumball");

        }
        else
        if (state == GumballMachineStateEnum.NO_QUARTER) {

            System.out.println("You turned but there's no quarter");

        }
        else
        if (state == GumballMachineStateEnum.SOLD_OUT) {

            System.out.println("You turned, but there are no gumballs");

        }
        else
        if (state == GumballMachineStateEnum.HAS_QUARTER) {

            state = GumballMachineStateEnum.SOLD;
            dispense();
            System.out.println("You turned...");

        }        

    }

    public void dispense() {

        if (state == GumballMachineStateEnum.SOLD) {

            count = count - 1;

            if (count == 0) {

                state = GumballMachineStateEnum.SOLD_OUT;
                System.out.println("Oops, out of gumballs!");

            }
            else {

                state = GumballMachineStateEnum.NO_QUARTER;

            }

            System.out.println("A gumball comes rolling out the slot");

        }
        else
        if (state == GumballMachineStateEnum.NO_QUARTER) {

            System.out.println("You need to pay first");

        }
        else
        if (state == GumballMachineStateEnum.SOLD_OUT) {

            System.out.println("No gumball dispensed");

        }
        else
        if (state == GumballMachineStateEnum.HAS_QUARTER) {

            System.out.println("No gumball dispensed");

        }        

    }

    // Aux methods
    @Override
    public String toString() {

        return MessageFormat.format("""
        \n 
        Mighty Gumball, Inc \n
        Java-enabled Standing Gumbal Model #2004 \n
        Inventory: {0} \n
        State: {1} \n
        """, count, state);
    }

}
