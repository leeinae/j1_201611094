package headfirst.command.undo;
import java.util.*;

public class RemoteControlWithUndo {
  Command[] onCommands;
  Command[] offCommands;
  Command undoCommand; 
  public RemoteControlWithUndo() {
    onCommands = new Command[7];
    offCommands = new Command[7];
    //Null Object Patten
    Command noCommand = new NoCommand();
    for(int i=0;i<7;i++) {
      onCommands[i]=noCommand;
      offCommands[i]=noCommand;
    }
    undoCommand = noCommand;
  }
  public void setCommand(Command onC, Command offC, int slot) {
//    slot = c;
    onCommands[slot]=onC;
    offCommands[slot]=offC;
  }
  public void onButtonWasPressed(int slot) {
//    slot.execute();
    onCommands[slot].execute();
    undoCommand =onCommands[slot];
  }
  
  public void offButtonWasPressed(int slot) {
    offCommands[slot].execute();
    undoCommand = offCommands[slot];
  }
  public void undoButtonWasPushed() {
    undoCommand.undo();
  }
}