# O que é

O Command é um padrão de projeto comportamental que encapsula uma solicitação como um objeto, permitindo parametrizar clientes com diferentes requisições, enfileirar ou fazer registros de solicitações e suportar operações de desfazer.

## Problema

Imagine um sistema de um editor de textos que precisa suportar comandos como "copiar", "colar" e "desfazer". Uma abordagem direta seria ter uma estrutura condicional grande para verificar qual comando executar. No entanto, isso torna o sistema difícil de manter e pouco flexível para adicionar novos comandos.

## Solução

O padrão Command propõe criar uma classe para cada comando, encapsulando sua execução. Dessa forma, os comandos podem ser armazenados, desfeitos e reexecutados sem depender diretamente dos objetos que os utilizam.

# Exemplo de Código

#### Interface Command
```java
interface Command {
    void execute();
}
```

#### Comandos concretos
```java
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
```

#### Invocador que aciona os comandos
```java
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
```

#### Uso
```java
public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.setCommand(new CopyCommand());
        editor.executeCommand();

        editor.setCommand(new PasteCommand());
        editor.executeCommand();
    }
}
```

---
