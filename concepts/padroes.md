## Padrões

Padrões de design úteis:
- [Singleton](#padrão-singleton)

### Padrão Singleton

Um padrão que envolve uma classe que só pode ser estanciada uma única vez

#### Exemplo:
```java
public class SingletonBasico {
  private static SingletonBasico instance = null;

  private SingletonBasico () {
     /*método construtor privado, para garantir
      *que ele não será acessado por outras classes
      */
  }

  //"synchronized" garante que o método seja executado em uma thread por vez
  public static synchronized SingletonBasico getInstance() {
     if (instance == null) {
        instance = new SingletonBasico();
     }
     return instance;
  }
}
```