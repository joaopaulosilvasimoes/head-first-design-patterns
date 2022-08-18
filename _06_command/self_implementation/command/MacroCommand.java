package _06_command.self_implementation.command;

import _06_command.self_implementation.Command;

public class MacroCommand implements Command {
    
    Command[] commands;

    public MacroCommand(Command[] commands){

        this.commands = commands;

    }

    @Override
    public void execute(){

        System.out.println("\n Macro EXECUTE \n");

        for (int i = 0; i < commands.length; i++) {
            
            commands[i].execute();

        }

    }

    @Override
    public void undo() {

        System.out.println("\n Macro UNDO \n");        

        // Inverse order of EXECUTE.
        for (int i = commands.length - 1; i >= 0; i--) {
            
            commands[i].undo();

        }
        
    }

}
