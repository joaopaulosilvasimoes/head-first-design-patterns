package _10_state.self_implementation_version_1;

public class GumballMachineTestDrive {
    
    public static void main(String[] args){

        //
        GumballMachine gumballMachine = new GumballMachine(5);
        
        // Test 1
        System.out.println("TEST 1");
        System.out.println(gumballMachine);

        // Test 2
        System.out.println("TEST 2");        
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        // Test 3
        System.out.println("TEST 3");
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        // Test 4
        System.out.println("TEST 4");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();

        System.out.println(gumballMachine);

        // Test 5
        System.out.println("TEST 5");
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();        
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);        

    }

}
