## Interface

Define um comportamento para as classes que a implementam

Uma única classe pode impementar várias interfaces ao mesmo tempo

Mutliplas implemntações: `public class NomeClasse implements interface1, interface2 {}`

#### Criando uma interface `Carro`:
```java
public interface Carro {
   public void ligar();
   public void desligar (int velocidade);
}
```
#### Implementando a interface `Carro`:
```java
public class CarroFamiliar implements Carro {
   privete String modelo;

   public CarroFamiliar (String newModelo){
      modelo = newModelo;
   }
   public void ligar(){
      System.out.println (modelo + " ligando");
   }
   public void desligar (int velocidade){
      if (velocidade < 20){
         System.out.println (modelo + " parando aos poucos");
      }
   }
}
```

### Interface `Comparable`

A interface `Comparable` impõe ordenação natural
nos objetos de cada classe que o implementa

Contém um método `compareTo`, que é um método de
comparação natural e também usado para ordenar

O método `compareTo` retorna:
 * Número negativo: quando o atual é menor que o  objeto de comparação
 * Número positivo: quando o stual é maior que o  objeto de comparação
 * Zero: quando ambos os objetos são iguais en termos de sua ordem natural

É  recomendado, mas não obrigatório que: `(x.compareTo(y) == 0) == (x.equals(y))`

#### Exemplo de uma interface `Comparable`:
```java
public class minhaClasse implements Comparable <minhaClasse> {
   protected int order;
   public minhaClasse (int order {
      this.order = ordem;
   }
   public int compareTo (minhaClasse object) {
      return ordem - object.order;
   }
}
```

### Interface como parâmetro de métodos

Métodos aceitarão como parâmetro qualquer objeto que possa implementar a interface

Esta é uma das maneiras mais comuns e úteis de usar uma interface

#### Exemplo:
```jaba
interface Test {
   //definições da interface Test
   public void test();
}
class Tester {
   //método com a interface Test como paramet
   public void runTest (Test t) {
      t.test();
   }
}
//a classe MyTest implementa a interface Test
class MyTest implements Test {
   public void test() { // running code }}
```

