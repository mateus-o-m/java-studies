## Modificadores

Palavras-chave que mudam o comportamento de variáveis,
classes ou métodos

Modificadores de acesso: indica a visibilidade
 * Nenhum modificador: visível para o pacote
 * `private`: visível somente à classe modificada
 * `public`: visível para todas as classes
 * `protected`: visível para o pacote e para as subclasses

Modificadores de não-acesso: indicam outras funcionalidades
 * `static`: torna uma declaração mais geral, e menos específica 
 * `final`: impede que a referência (da classe, método, variável) seja alterada
 * `abstract`: faz o JVM aguardar as subclasses implementarem
os métodos/classes

Nenhum modificador e modificador `public`:
 * Sem modificador: a variável é implicitamente visível à todas
as classes de um pacote
 * `public`: a variável é visível a qualquer classe, inclusive
as que estão fora do pacote, via `import` da classe/pacote

#### Uso de `public`:
```java
public class Car {
   public String model;

   public void start() {
      ...
   }
}

public class TestClass {
   public static void main (String[] args) {
      Car car = new Car(...);
      car.model;    
      car.start();
   }
}
```

Modificador `private` e `protected`:
 * `private`: faz com que variáveis e métodos fiquem disponíveis
apenas dentro de suas classes
   * É usado para ajudar no encapsulamento doa dados
   * Variáveis privadas necessitam de funções do tipo "getter"
e "setter" para serem acessadas
 * `protected`: faz com que variáveis, métodos e construtores
fiquem disponíveis dentro de subclasses em outros pacotes, e
classes dentro de seu próprio pacote

#### Uso de `private`:
```java
public class Car {
   private String model;
   private int noDoors;

   public String getModel() {
      return model;
   }

   public void setModel (String newModel) {
      model = newModel;
   }
}
```

#### Uso de `protected`:
```java
public class Car{
   protected void start() {
      //código de implementação
   }
}

public class FamilyCar {
   public void start() {
      //código de implementação 
   }
}
```

Modificador `static` e `final`:
 * `static`: variáveis `static` são acessíveis em instâncias fora
da classe, con todas as instâncias compartilhando a mesma variável 
   * Métodos `static` não são permitidos 
 * `final`: diferentes significados dependendo de onde é usado
   * Em classes: a classe não poderá ser extendida
   * Em métodos: o método não poderá ser sobrescrito
   * Em variáveis locais, campos ou parâmetros: valores não poderão ser mudadas após terem sido definidos

#### Uso de `static`:
```java
public class Car {
   private static int piecesSold = 0;

   public Car() {
      piecesSold = piecesSold + 1;
   }

   public static void printSold() {
      System.out.print (piecesSold + " ");
   }
}

public class FamilyCar extends Car {
   public FamilyCar() {
      super();
   }
}
```

#### Uso de `private`:
```java
public Car {
   private final int value = 10;
   private static final int PRICE = 30;

   public void changeValue (int x) {
      value = x; //gera um erro
   }
}
```

### Encapsulamento

Manter as variáveis em uma classe privada, onde o uso de métodos
dentro da classe é necessário para acessá-las

Um objeto encapsulado determina qual tipo de dado será aceito e como
processar esse dado, sem influencias externas
 * O papel de um objeto encapsulado se torna claro para outros objetos
 * Reduz a interdependência entre classes

Métodos que utilizam compos privados:
 * "getter": retornam o valor de um campo privado
 * "setter": atualizam o valor de um campo privado

#### Exemplo:
```java
public class Car {
   private String model;
   private int noDoors;

   public Car (...) {
      ...
   }

   public String getModel() {
      return model;
   }

   public int getNoDoors() {
      return noDoors;
   }

   public void setModel (String newModel) {
      model = newModel;
   }

   public void setNoDoors (int newNoDoors) {
      noDoors = newNoDoors;
   }
}
```
}
```

####bAcessando variáveis:
```java
public class Test {
   public static void main (String[] args) {
      Car car = new Car ("NormalCar", 4);
      car.setNoDoors(3);
      car.setModel ("EncapCar");
      System.out.println (car.getModel() + " " + car.getNoDoors());
   }
}
```