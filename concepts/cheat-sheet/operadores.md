## Operadores

### Operador ternário: alternativa ao `if` e `else`

Formato: `resultado = condicaoTeste ? valorSeTrue : valorSeFalse;`
#### No exemplo abaixo, `x` receberá o valor de `4`:
```java
int y = 3;
int x = y > 2 ? 4 : 8;
```

### Operador `.equals()`

Objetos primitivos podem ser comparados usando o operador `==`
#### Exemplo:
```java
boolean bol1 = True;
boolean bol2 = False;
boolean bol3 = (bol1 == bol2); // false
```

Objetos não primitivos devem ser comparados utilizando `.equals()`

Formato: `objeto1.equals (objeto2)`

#### Exemplo:
```java
String str1 = "Olá";
String str2 = "Mundo";
boolean compara = str1.equals(str2); // false
```

O operador `==` pode ser usado para comparar a referência de objetos

#### Exemplo:
```java
Object o1 = new String ("Olá");
Object o2 = new String ("Mundo");
boolean objetosIguais = (o1 == o2); // false
```

### Operador `&&` (AND)

#### Usado para testar multiplas relações
```java
if (relação1 && relação2){
   //ação
}
```

### Operadores `++` e `--`

Java suporta duas formas de incremento/decremento curto

#### Como prefixo: `++i` e `--i`
```java
int i = 2;
int j = ++i;
System.out.println (i); // 3
System.out.println (j); // 3
```
#### Como sufixo: `i++` e `i--`
```java
int i = 3;
int j = i--;
System.out.println (i); // 2
System.out.println (j): // 3
```

### Usando varargs: operador `…`

Varargs são argumentos que podem aceitar uma quantidade variável de valores

#### Na função abaixo, o parâmetro `preco` pode aceitar qualquer número de `int`s:
```java
public int calcular (int...preco){
   Int soma = 0;
   for (int item: preco){
      soma += item;
   }
   return soma;
}
```

#### O método `calcular` pode ser chamado com qualquer quantidade de argumentos:
```java
int soma1 = calcular (24, 50, 3);
int soma2 = calcular (2, 6, 9, 44);
```

### Operador diamante: `<>`

A partir do Java 7, não é necessário declarar o tipo de parâmetro duas vezes
quando instanciando objetos como mapas, sets e listas

#### O operador `<>` pode ser usado nesse contexto. Exemplo:
```java
// método convencional
Map <String, List<Integer>> listaNumeros = new HashMap <String, List<Integer>>();

// usando <>
Map <String, List<Integer>> listaNumeros = new HashMap<>();
```
