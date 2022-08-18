package _06_command.self_implementation.command;

import _06_command.self_implementation.Command;
import _06_command.self_implementation.vendor_classes.Light;

public class LightOnCommand implements Command {
    
    Light light;

    public LightOnCommand(Light light){

        this.light = light;

    }

    @Override
    public void execute(){

        light.on();

    }

    @Override
    public void undo() {

        light.off();        

    }    

}
