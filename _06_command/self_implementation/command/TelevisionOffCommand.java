package _06_command.self_implementation.command;

import _06_command.self_implementation.Command;
import _06_command.self_implementation.vendor_classes.Television;

public class TelevisionOffCommand implements Command {
    
    Television television;

    public TelevisionOffCommand(Television television){

        this.television = television;

    }

    @Override
    public void execute(){

        television.turnOff();

    }

    @Override
    public void undo() {

        television.turnOn();       

    }       

}
