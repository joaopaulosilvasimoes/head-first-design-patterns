package _06_command.self_implementation.command;

import _06_command.self_implementation.Command;
import _06_command.self_implementation.vendor_classes.Television;

public class TelevisionOnCommand implements Command {
    
    Television television;

    public TelevisionOnCommand(Television television){

        this.television = television;

    }

    @Override
    public void execute(){

        television.turnOn();

    }

    @Override
    public void undo() {

        television.turnOff();       

    }       

}
