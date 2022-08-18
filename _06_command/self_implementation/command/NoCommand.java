package _06_command.self_implementation.command;

import _06_command.self_implementation.Command;

// NULL Object as Design Patter
public class NoCommand implements Command {

    @Override
    public void execute() {
        
    }

    @Override
    public void undo() {

    }       
    
}
