## Dicas

### Comentários

Uma linha: `// comentário`
Multi linha:
```java
/*
comentários
*/
```

### Nomes descritivos

Não utilizar nomes curtos ou longos demais
Nome de variáveis, objetos, métodos, etc. , devem ser auto explicativos
No exemplo abaixo, a última opção seria a indicada:
```java
public String n ();
public String getFirstAndLastName ();
public String getName ();
```

### Convenção dos nomes de pacotes

Importante para evitar possíveis conflitos com nomes de pacotes
Convenção; o domínio da internet da pessoa/empresa responsável
pelo pacote, escrito ao contrário, seguido pelo nome do pacote
Sempre escritos em letras minúsculas, exemplo:
Dono do pacote: www.empresapacote.com<br>
Pacote: pacoteutil
Em Java: `package com.empresapackte.utilpackage;`

### Evitar o uso de variáveis `static`

Podem ser usadas como contadores, mas devem ser evitadas
na maioria dos casos
Problemas:
 * Quebram encapsulamento de objetos 
 * Atrapalha gerenciamento de memória
 * Complica a coleta de lixo de memória
 * Ruim para segurança, reentrância e correspondência
Usar padrão singleton é uma prática melhor
Usar constantes `static`, pode ser considerado bom uso

### Comando `this (value)`

Possibilita chamar um construtor a partir do construtor padrão,
quando ambos estão na mesma classe
O `this (value)` chama outro construtor, passando o valor `value`
Ocorre somente como a primeira linha de outro construtor

### Campos `static`

Marcar um campo como `static`, indica que ele pertence
a uma `class` como todo
Útil quando um valor precisa ser compartilhado por vários objetos
de mesmo tipo, ou para criar contadores

### Uso do `sizeof`

Em C/C++, `sizeof()` retorna o número de bytes de um tipo de dado
Esse valor pode variar dependendo da máquina ou do SO
Java possui tamanhos fixos dos dados em todas as máquinas/SO,
portanto `sizeof` não é necessário em Java

### Convenção para range de valores

Quando especificando um range de valores: o primeiro valor no range (`from`) é incluso.
enquanto o último valor no range (`to`) é excluso
Exemplo: `"mundo".substring (1, 4);` retornará `"und"`
Essa convenção se aplica à: `List.sublist (from, to);` e `Arrays.copyOfRange (T[], from, to);`

### Inicialização com chaves duplas

Em vez de inicializar um set, lista ou  mapa e depois adiconar elementos a eles,
o Java fornece uma maneira de fazer tudo de uma vez, usando chaves duplas
Exemplo:
```java
// modo convencional
public Set<String> meuSet = new HashSet<String>;
meuSet.add ("um");
meuSet.add ("dois");
meuSet.add ("três");
umaFuncao (meuSet);
 
// usando chaves duplas
umaFuncao (new HashSet<String> {{
   add ("um");
   add ("dois");
   add ("três");
}} );
```

### Pacotes

Maneira de organizar classes Java em arquivos `.jar`
Usar pacotes permite a importação de um grupo de classes de uma só vez
Pacote `java.lang`, é um pacote que fornece classes fundamentais
Exemplos:
 * `package java.lang;`especifica que o arquivo Java pertence a um pacote `java.lang`
 * `import java.io.*;` importa todas as classes dentro do pacote `java.io`
 * `import java.io.Cla;` importa somente a classe Cla do pacote `java.io`

### Gerênciamento de memória

A liberação de memória usada depende inteiramente do coletor de lixo (GC)
do Java Virtual Machine (JVM)

#### Diferença entre memória **stack** e **heap**

Memória **heap** é usada para guardar objetos e classes JRE
Memória **stack** é usada para guardar variáveis locais, chamada de métodos, 
e referências à objetos guardados na memória **heap**
Mensagem de erro quando não há memória **stack** disponível:
`java.lang.StackOverFlowError`
Mensagem de erro quando não há espaço na memória **heap**:
`java.lang.OutOfMemoryError: Java heap Space`

#### Coletor de lixo (GC)

STW(**stop-the-world**): o JVM para a aplicação para executar a GC
Ativar log da GC: `java -XX:+PrintGCDetails minhaAplicacao`
CMS(**Concurrent Mark Sweep**): um algorítmo de GC que não
usa as pausas STW
Ativando CMS: `java -XX>+UseConcMarkSweepGC minhaAplicacao`