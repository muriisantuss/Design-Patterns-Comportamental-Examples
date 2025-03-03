package Command;

class CopyCommand implements Command {
  public void execute() {
    System.out.println("Copiar texto");
  }
}

class PasteCommand implements Command {
  public void execute() {
    System.out.println("Colar texto");
  }
}