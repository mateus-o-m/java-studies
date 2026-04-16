## Dados

### Dados primitivos: tipo mais básico de dados.

 - Numéricos: `byte`, `short`, `int`, `long`, `float`,  `double`
 - Caractere: `char`
 - Booleano: `boolean`

Sufixos: se não especificados, o Java assume `int` para números inteiros e
`double` para nuúmeros decimais

#### Exemplo de sufixos:
```java
float numFloat = 2.6f;
double numDouble = 5.8d;
long numLong = 876976L;
```

### Dados tipo `String`

Uma `String` não é um primitivo, e sim um objeto
 - Inicialização da `String`: `String nome = "Meu nome";`
 - Concatenar string: `String nomeConcat = "Nome" + "Sobrenome";`

### Especificando o tipo de dado

Especificar o tipo de dado permite a ocorrência de menos erros

Exemplo de uso parametrizado: `List<String> compras = Arrays.asList ("carne", "café", "frutas");`

No exemplo acima, a lista de compras é especificada como sendo do tipo `String`

## Variáveis

### Locais

Usadas dentro de blocos (como contadores) ou de métodos (como variáveis temporárias)

São usadas para guardar informação para um único método

### De instância

Definem atributos/estados de um objeto em particular

São usadas para guardar informação de multiplos objetos

### De classe

Global para uma classe e todas as instâncias dentro dela.

Usada para se comunicar com diferentes objetos denteo de uma classe 
e acompanhar os estados globais
