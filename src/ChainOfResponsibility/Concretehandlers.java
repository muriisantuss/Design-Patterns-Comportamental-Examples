class Atendente extends Handler {
  public void handleRequest(String request) {
    if (request.equals("simples")) {
      System.out.println("Atendente resolveu o problema");
    } else {
      super.handleRequest(request);
    }
  }
}

class Tecnico extends Handler {
  public void handleRequest(String request) {
    if (request.equals("intermediario")) {
      System.out.println("Técnico resolveu o problema");
    } else {
      super.handleRequest(request);
    }
  }
}

class Gerente extends Handler {
  public void handleRequest(String request) {
    System.out.println("Gerente resolveu o problema");
  }
}