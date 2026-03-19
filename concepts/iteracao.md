## Iteração

### Usando `Iterator`

O `Iterator` pode ser usado para iterar sobre uma coleção
de valores usando o loop `for` ou o loop `while`
Exemplo de uso:
```java
List<String> frutas = Arrays.asList ("banana", "laranja", "uva");

//iterando sobre uma lista usando loop while
 Iterator<String> frutasItera = frutas.iterator();
 while (frutasItera.hasNext()) {
    System.out.println (frutasItera.next());
 }

 //iterando sobre uma lista usando loop while
 for (Iterator<String> frutasItera = frutas.iterator();
 frutasItera.hasNext()){
    System.out.println (frutasItera.next());
 }</code></p>

### Iterar sem índices 

O uso do loop `for` tradicional, com índices explicitos,
pode levar a erros quando iterando
O uso de loops `for-each` resolve esse problema,
por não utilizarem índices explicitos
Exemplo: 
```java
List<String> frutas = Arrays.asList ("banana", "laranja",  "uva");

// loop for-each
for (String cadaFruta : frutas){
   System.out.println (cadaFruta);
}

// loop for tradicional
for (int i = 0; i < frutas.size(); i++){
   System.out.println (frutas.get (i));
}
```