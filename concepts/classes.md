## Classes

Podem conter qualquer número de variáveis ou métodos, de qualquer tipo
Por convenção, o nome de uma classe deve começar com letra maiuscula
Exemplo de classe:
```java
public class Carro {
   // campos
   String modelo;
   String nPlaca;
   String cor;
   int nPortas;

   // métodos
   void ligar() {
      System.out.println ("Carro ligado");
   }
   void dirigir() {}
   void freioDeMao() {}
}
```
Métdos construtores: inicializam um objeto da classe
Exmplo:
```java
public class Carro {
   // campos

   // método construtor
   public Carro (String newModelo, String newNPlaca, String newCor, int newNPortas) {
      modelo = newModelo;
      nPlaca = newNPlaca;
      cor = newCor;
      nPortas = newNPortas;
   }
}
```

### Herança

É o princípio mais representativo da programação orientada á objetos (OOP)
Classes filhas herdam campos e métodos das classes pais
Formalmente, uma classe pai é chamada de superclasse
e uma classe filha é chamada de subclasse
 * `extends`: herdar as propriedades de uma classe
 * * É possível usar `extends` para extender somente uma superclasse
 * `super (campos_herdados)`: inicializa compos herdados
 * * O comando `super()` deve ser a primeira instrução do método construtor
Utilizando a classe `Carro` do exemplo anterior:
```java
public class Carro {}
public CarroFamiliar extends Carro {
   /* campos obtidos pela extensão de Carro
   String modelo;
   String nPlaca;
   String cor;
   int nPortas; */
   int nAssentos; // campo exclusivo da classe CarroFamiliar

   // método construtor
   public CarroFamiliar (String modelo, String nPlaca, String cor, int nPortas, int newNAssentos){
      super (modelo, nPlaca, cor, nPortas);
      nAssentos = newNAssentos;
   }

   /* métodos herdados pela extesão de Carro
   void ligar() {}
   void dirigir() {}
   void freioDeMao() {} */
}
```

### Polimorfismo

Refere-se á possibilidade de uma classe filha definir seu próprio comprtamento,
mas continuar herdando funcionalidades da classe pai
Exemplo utilizando a classe pai `Carro`:
```java
public class Carro {}
public CarroFamiliar extends Carro {
   /* campos obtidos pela extensão de Carro
   String modelo;
   String nPlaca;
   String cor;
   int nPortas; */
   int nAssentos; // campo exclusivo da classe CarroFamiliar

   // método construtor
   public CarroFamiliar (String modelo, String nPlaca, String cor, int nPortas, int newNAssentos){
      super (modelo, nPlaca, cor, nPortas);
      nAssentos = newNAssentos;
   }

   /* métodos herdados pela extesão de Carro 
   void dirigir() {}
   void freioDeMao() {} */
   // método ligar() modificado especialmente para CarroFamiliar
   void ligar() {
      System.out.println ("Ligando um carro espaçoso");
   }
}
```

### Classes internas

É possível aninhar classes:
```java
class classeExterna {
   ...
   class classeInterna {
   ...
   }
}
```
Uma instância de uma `class` interna só pode existir
dentro de uma instância da `class` externa
Uma `class` interna tem acesso a compos e métodos de sua `class` externa
Vantagems do uso de classes internas:
 * Maior encapsulamento
 * Agrupar logicamente as classes
 * Maior legibilidade