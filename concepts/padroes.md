\## Padrões



Padrões de design úteis:

&#x20;- \[Singleton](#padrão-singleton)



\### Padrão Singleton



Um padrão que envolve uma classe que só pode ser estanciada uma única vez



\#### Exemplo:

```java

public class SingletonBasico {

&#x20;  private static SingletonBasico instance = null;



&#x20;  private SingletonBasico () {

&#x20;     /\*método construtor privado, para garantir

&#x20;      \*que ele não será acessado por outras classes

&#x20;     \*/

&#x20;  }

&#x20;  //"synchronized" garante que o método seja executado em uma thread por vez

&#x20;  public static synchronized SingletonBasico getInstance() {

&#x20;     if (instance == null) {

&#x20;        instance = new SingletonBasico();

&#x20;     }

&#x20;     return instance;

&#x20;  }

}

```



