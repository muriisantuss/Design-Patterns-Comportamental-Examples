abstract class Handler {
  protected Handler nextHandler;

  public void setNextHandler(Handler nextHandler) {
      this.nextHandler = nextHandler;
  }

  public void handleRequest(String request) {
      if (nextHandler != null) {
          nextHandler.handleRequest(request);
      }
  }
}