## Métodos

Métodos, devem estar dentro de uma `class`
#### Corpo de um método:
```java
modificador tipoDeDadoRetornado nomeMetodo (parâmetros){
   //corpo de método
}
```
Exemplo:
```java
public static void olaMundo(){
   System.out.println("Olá mundo");
}
```
Funções void: métodos que não retornam nenhum valor

Funções não-void: retornam um valor específico, que pode ser de qualquer
tipo, primitivo ou não

### Passagem de argumentos como referência

Não é possível passar um argumento como referência para um método. Um exemplo de referência seria o ponteiro

Tipos primitivos (`int`, `boolean`, `char`, etc.): o valor contido neles,
ou uma cópia desse valor, é passado como argumento em métodos

Objetos (`String`, `Object`, etc.): um valor de referência, que aponta para o objeto,
é passado como argumento em métodos

### Método `toString ()`

É um método inerente a qualquer `Object`, pode ser definido pelo usuário ou fornecido pelo JDK

Por padrão, `toString ()` retorna:
 * (nome da `class`) + `@` + (valor hexadecimal do `hashcode` da `class`)

Usar `@Override`, substitui o retorno padrão de `toString ()`,
podendo fornecer informações importantes para depuração ou impressão na tela
#### Exemplo:
```java
@Override
public String toString () {
   return "Alguma info útil" ;
}
```

### Métodos de interfaces

Todo método definido dentro de uma `interface` é implicitamente `public`

Uma `interface` define a interface pública de uma classe,
ou seja, todos os seus métodos são `public`

### Métodos `default`

#### Considere a interface:
```java
public interface interfaceCozinha {
   public void frigideira();
   public void fogao();
   public void geladeira();
}
```
Adicionar um novo método à `interfaceCozinha` pode causar problemas, qualquer
classe que tiver implementado `interfaceCozinha` terá que ser atualizada também

Para adicionar nova funcionalidade e evitar erros, usar implementação `default`
#### Exemplo:
```java
public interface interfaceCozinha {
   public void frigideira();
   public void fogao();
   public void geladeira();
   default void microondas(){
      // implementação de microondas
   }
 }
```

#### Método `default` vs método de instância

Quando há conflito ente um método `default` e um método comum,
o compilador Java irá usar a implementação do método comum
