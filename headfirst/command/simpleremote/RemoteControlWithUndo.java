package headfirst.command.undo;

public class RemoteControlWithUndo {
  Command[] onCommands;
  Command undoCommand; 
  public RemoteControlWithUndo() {
    onCommands = new Command[7];
    //Null Object Patten
    Command nocommand = new NoCommand();
    for (int i=0;i<7;i++) {
      onCommands[i]=NoCommand;
    }
  }
  public void setCommand(Command c) {
    slot = c;
  }
  public void buttonWasPressed() {
    slot.execute();
  }
}