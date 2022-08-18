package _06_command.self_implementation;

import _06_command.self_implementation.command.LightOffCommand;
import _06_command.self_implementation.command.LightOnCommand;
import _06_command.self_implementation.command.MacroCommand;
import _06_command.self_implementation.command.TelevisionOffCommand;
import _06_command.self_implementation.command.TelevisionOnCommand;
import _06_command.self_implementation.vendor_classes.Light;
import _06_command.self_implementation.vendor_classes.Television;

public class CompleteRemoteControlTestDrive {

    public static void main(String[] args){
        
        //
        CompleteRemoteControl remoteControl = new CompleteRemoteControl();

        // Objects to control.
        Light roomLight = new Light("Room");

        Television roomTelevision = new Television("Room");

        Light livingRoomLight = new Light("Living Room");

        Television livingRoomTelevision = new Television("Living Room");

        // Commands
        LightOnCommand roomLightOnCommand = new LightOnCommand(roomLight);
        LightOffCommand roomLightOffCommand = new LightOffCommand(roomLight);

        TelevisionOnCommand roomTelevisionOnCommand = new TelevisionOnCommand(roomTelevision);
        TelevisionOffCommand roomTelevisionOffCommand = new TelevisionOffCommand(roomTelevision);

        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);

        TelevisionOnCommand livingRoomTelevisionOnCommand = new TelevisionOnCommand(livingRoomTelevision);
        TelevisionOffCommand livingRoomTelevisionOffCommand = new TelevisionOffCommand(livingRoomTelevision);

        MacroCommand onAll = new MacroCommand(new Command[]{roomLightOnCommand, roomTelevisionOnCommand, livingRoomLightOnCommand, livingRoomTelevisionOnCommand});
        MacroCommand offAll = new MacroCommand(new Command[]{roomLightOffCommand, roomTelevisionOffCommand, livingRoomLightOffCommand, livingRoomTelevisionOffCommand});

        // Setting Commands.
        remoteControl.setCommand(1, "My Room Light", roomLightOnCommand, roomLightOffCommand);
        remoteControl.setCommand(2, "My Room Television", roomTelevisionOnCommand, roomTelevisionOffCommand);
        remoteControl.setCommand(3, "My Living Room Light", livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteControl.setCommand(4, "My Living Room Television", livingRoomTelevisionOnCommand, livingRoomTelevisionOffCommand);

        remoteControl.setCommand(7, "ALL", onAll, offAll);

        // GUI.
        System.out.println(remoteControl);

        // Testing.
        remoteControl.onButtonWasPushed(1); // Room Light
        remoteControl.offButtonWasPushed(1); // Room Light

        remoteControl.onButtonWasPushed(3); // Living Room
        remoteControl.offButtonWasPushed(3); // Living Room

        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(7); // No Command or NULL Object as Design Patter
        remoteControl.offButtonWasPushed(7); // No Command or NULL Object as Design Patter

        remoteControl.onButtonWasPushed(7); // Execute Macro

        remoteControl.undoButtonWasPushed();
        
    }
    
}