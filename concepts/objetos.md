## Objetos

Podem ser criados a partir de uma classe
Passos para criar um objeto:
 * Declaração: `Objeto novoObjeto`
 * Instanciação: usar `new`
 * Inicialização: chamar o método construtor `Objeto()`

Construtor do objeto `Carro`:
```java
public Carro (String newModelo, String newNPlaca, String newCor, int newNPortas){
   modelo = newModelo;
   nPlaca = newNPlaca;
   cor = newCor;
   nPortas = newNPortas;
}
```
Criando o objeto `Carro`:
 * `Carro meuCarro = new Carro ("Fusca", "IN578H9", "azul", 2);`
