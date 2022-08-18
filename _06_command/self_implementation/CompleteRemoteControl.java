package _06_command.self_implementation;

import java.text.MessageFormat;

import _06_command.self_implementation.command.NoCommand;

public class CompleteRemoteControl {
    
    private String[] labels;
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public CompleteRemoteControl(){

        int commandCount = 7;

        labels = new String[commandCount];
        onCommands = new Command[commandCount];
        offCommands = new Command[commandCount];

        Command noCommand = new NoCommand();

        for (int i = 0; i < commandCount; i++) {
            
            labels[i] = "";
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;

        }

        undoCommand = noCommand;

    }

    public void setCommand(int slot, String label, Command onCommand, Command offCommand){

        labels[slot - 1] = label;
        onCommands[slot - 1] = onCommand;
        offCommands[slot - 1] = offCommand;

    }

    public void onButtonWasPushed(int slot){

        onCommands[slot - 1].execute();

        undoCommand = onCommands[slot - 1];

    }

    public void offButtonWasPushed(int slot){

        offCommands[slot - 1].execute();

        undoCommand = offCommands[slot - 1];

    }

    public void undoButtonWasPushed(){

        undoCommand.undo();
    
    }    

    @Override
    public String toString(){

        StringBuffer output = new StringBuffer();

        output.append("\n --- REMOTE CONTROL --- \n");

        for (int i = 0; i < labels.length; i++) {
            
            output.append(MessageFormat.format("\nButton: {0} - Command: {1}", (i + 1 ), labels[i]));

        }

        return  output.toString();
    }

}
