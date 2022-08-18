package _06_command.self_implementation;

import _06_command.self_implementation.command.LightOnCommand;
import _06_command.self_implementation.vendor_classes.Light;

public class SimpleRemoteControlTestDrive {

    public static void main(String[] args){

        SimpleRemoteControl remoteControl = new SimpleRemoteControl();

        Light lightRoom = new Light("Room");

        remoteControl.setSlotCommand(new LightOnCommand(lightRoom));

        remoteControl.buttonWasPressed();

    }
    
}
