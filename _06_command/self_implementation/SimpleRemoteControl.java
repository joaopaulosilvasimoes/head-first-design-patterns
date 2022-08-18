package _06_command.self_implementation;

public class SimpleRemoteControl {

    Command slotCommand;

    public SimpleRemoteControl(){

    }

    public void setSlotCommand(Command slotCommand) {
        
        this.slotCommand = slotCommand;

    }

    public void buttonWasPressed(){

        slotCommand.execute();

    }
    
}
