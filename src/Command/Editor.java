package Command;

class Editor {
  private Command command;

  public void setCommand(Command command) {
      this.command = command;
  }

  public void executeCommand() {
      if (command != null) {
          command.execute();
      }
  }
}