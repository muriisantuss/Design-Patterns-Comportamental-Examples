## Chain of Responsibility

# O que é

O Chain of Responsibility é um padrão de projeto comportamental que permite passar uma requisição por uma cadeia de manipuladores até que um deles a processe. Isso evita dependências explícitas entre remetente e receptor.

## Problema

Suponha um sistema de suporte técnico onde as solicitações devem ser tratadas por diferentes níveis de suporte (atendente, técnico e gerente). Sem esse padrão, seria necessário criar várias verificações condicionais para decidir quem deve tratar a requisição, tornando o código engessado e de difícil manutenção.

## Solução

Com Chain of Responsibility, cada manipulador decide se pode processar a requisição ou a repassa para o próximo da cadeia. Isso torna o sistema mais flexível e modular.

# Exemplo de Código

```java
// Classe base para os manipuladores
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

// Manipuladores concretos
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

// Uso
public class Main {
    public static void main(String[] args) {
        Handler atendente = new Atendente();
        Handler tecnico = new Tecnico();
        Handler gerente = new Gerente();

        atendente.setNextHandler(tecnico);
        tecnico.setNextHandler(gerente);

        atendente.handleRequest("simples");
        atendente.handleRequest("intermediario");
        atendente.handleRequest("complexo");
    }
}
```
