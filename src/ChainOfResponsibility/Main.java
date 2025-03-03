public class Main {
  public static void main(String[] args) {
    Handler atendente = new Atendente();
    Handler tecnico = new Tecnico();
    Handler gerente = new Gerente();

    atendente.setNextHandler(tecnico);
    tecnico.setNextHandler(gerente);

    System.out.println("");

    atendente.handleRequest("simples");
    atendente.handleRequest("intermediario");
    atendente.handleRequest("complexo");
  }
}