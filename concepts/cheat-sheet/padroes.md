## Padrões

Padrões de design úteis:
 - [Singleton](#padrão-singleton)
 - [Métodos factory](#métodos-factory)
 - [Padrão fachada](#padrão-fachada)
 - [Hashing](#hashing)

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

### Métodos factory

São métodos `static` que retornam a instância de uma classe

Vantagems do uso:
 - Podem retornar um subtipo do tipo retornado
 - Podem retornar um objeto com uma classe de implementação desconhecida para a classe que o chamou
 - Não precisam criar um novo objeto toda vez que são chamadas. Os objetos podem ser salvos em cache e reciclados

#### Exemplo:
```java
public class Animal {
   //método factory
   public static Animal getInstance(){
      return new Animal();
   }

   //método construtor privado
   private Animal() {}
}
```

### Padrão fachada

Consiste em "esconder" cálculos complexos ou múltiplos chamados de métodos no sistema

Objetivo é deixar o usuário final com uma interface limpa e que implementa todas as funcionalidades necessárias

#### Exemplo:
```java
//programa que possobilita desenhar objetos 2D na tela

public class Circulo extends Shape {
   //implementa a forma circular
}
public class Triangulo extends Shape {
   //implementa a forma triangular
}
public class Poligono extends Shape {
   //implementa a forma poligonal
}
public class DrawShape {
   public static void drawShape (Shape shp) {
      if (shp instanceof Circulo) {
         //implementa desenho do círculo
      } else if (shp instanceof Triangulo) {
         //implementa desenho do triângulo 
      } else if (shp instanceof Poligono) {
         //implementa desenho do poligono
      } else {
         //nenhuma ação 
      }
   }
}
```

### Hashing

É um mapeamento de dados de tamanho variável para dados de tamanho fixo

Cada objeto tem um valor de hash definido por: `public int hashCode()`

Propriedades de `hashCode()`:
 - Se dois objetos são iguais pelo método `equals()`, então eles têm o mesmo valor hash
 - `hashCode()` sempre retorna o mesmo valor se chamada no mesmo objeto
 - Se dois objetos são diferentes pelo método `equals()`, eles podem ter valores hash diferentes

#### Exemplo:
```java
String s = "Java";
System.out.println (s); //Java
System.out.println (s.hashCode()); //hashcode da String s
```

