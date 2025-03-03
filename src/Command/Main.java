package Command;

public class Main {
  public static void main(String[] args) {
    Editor editor = new Editor();

    System.out.println("");

    editor.setCommand(new CopyCommand());
    editor.executeCommand();

    editor.setCommand(new PasteCommand());
    editor.executeCommand();
  }
}