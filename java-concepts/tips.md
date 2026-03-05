## Dicas

### Especificando o tipo de dado

<p>Especificar o tipo de dado permite a ocorrência de menos erros<br>
Exemplo de uso parametrizado:<br>
<code>List<String> compras = Arrays.asList ("carne", "café", "frutas");</code><br>
No exemplo acima, a lista de compras é especificada como sendo do tipo <code>String</code>

### Passagem de argumentos como referência

<p>Não é possível passar um argumento como referência para um método<br>
Um exemplo de referência seria o ponteiro<br>
Tipos primitivos (<code>int, boolean, char</code>, etc.): o valor contido neles, ou uma cópia desse valor,<br>
é passado como argumento em métodos<br>
Objetos (<code>String, Object</code>, etc.): um valor de referência, que aponta para o objeto,<br>
é passado como argumento em métodos</p>

### Nomes descritivos

<p>Não utilizar nomes curtos ou longos demais<br>
Nome de variáveis, objetos, métodos, etc. , devem ser auto explicativos<br>
No exemplo abaixo, a última opção seria a indicada:<br>
<code>public String n ();
 public String getFirstAndLastName ();
 public String getName ();</code></p>

### Método <code>toString ()</code>

<p>É um método inerente a qualquer <code>Object</code> ,<br>
pode ser definido pelo usuário ou fornecido pelo JDK<br>
Por padrão, <code>toString ()</code> retorna o nome da <code>class</code>,<br> seguido por um <code>@</code> mais o valor hexadecimal de seu <code>hashcode</code><br>
Usar <code>@Override</code>, substitui o retorno padrão de <code>toString ()</code>,<br>
podendo fornecer informações importantes para depuração ou impressão na tela<br>
Exemplo:<br>
<code>@Override
 public String toString () {
        return "Alguma info útil" ;
}</code>

### Convenção dos nomes de pacotes

<p>Importante para evitar possíveis conflitos com nomes de pacotes.<br>
Convenção; o domínio da internet da pessoa/empresa responsável<br>
pelo pacote escrito ao contrário e seguido pelo nome do pacote<br>
Sempre escritos em letras minúsculas, exemplo:<br>
Dono do pacote: www.empresapacote.com<br>
Pacote: pacoteutil
Em java: <code>package com.empresapackte.utilpackage;</code></p>

### Comando <code>this (value)</code>

<p>Possobilita chamar um construtor a partir do construtor padrão,<br>
quando ambos estão na mesma classe<br>
O <code>this (value)</code> vhama outro construtor, passando o valor <code>value</code><br>
Ocorre somente como a primeira linha de outro construtor</p>

### Evitar o uso de variáveis <code>static</code>

<p>Podem ser usadas como contadores, mas devem ser evitadas<br>
na maioria dos casos
Problemas:
	• Quebram encapsulamento de objetos 
	• Atrapalha gerenciamento de memória
	• Complica a coleta de lixo de memória
	• Ruim para segurança, reentrância e correspondência<br>
Usar padrão singleton é uma prática melhor<br>
Usar constantes <code>static</code>, não é considerada</p>

### Métodos <code>default</code>

<p>Considere a interface:<br>
<code>public interface interfaceCozinha {
    public void frigideira();
    public void fogao();
    public void geladeira();
 }</code><br>
Adicionar um novo método à <code>interfaceCozinha</code> pode causar problemas,<br>
qualquer classe que tiver implementado <code>interfaceCozinha</code> terá que ser atualizada também<br>
Para adicionar nova funcionalidade e evitar erros,<br>
usar implementação <code>default</code>, como no exemplo:<br>
<code>public interface interfaceCozinha {
    public void frigideira();
    public void fogao();
    public void geladeira();
    default void microondas(){
       //implementação de microondas
    }
 }</code><br>

### Método <code>default</code> vs método de instância

<p>Quando há conflito ente um método <code>default</code> e um método comum,<br>
o compilador Java irá usar a implementação do método comum</p>

### Campos <code>static</code>

<p>Marcar um campo como <code>static</code>, indica que ele pertence<br>
a uma <code>class</code> como todo<br>
Útil quando um valor precisa ser compartilhado por vários objetos<br>
de mesmo tipo, ou para criar contadores</p>

### Classes internas

<p>É possível aninhar classes:<br>
<code>class classeExterna {
    ...
    class classeInterna {
    ...
    }
 }</code><br>
Uma instância de uma <code>class</code> interna só pode existir<br>
dentro de uma instância da <code>class</code> externa<br>
Uma <code>class</code> interna tem acesso a compos e métodos de sua <code>class</code> externa<br>
Vantagems do uso de classes internas<br>:
	• Maior encapsulamento
	• Agrupar logicamente as classes
	• Maior legibilidade</p>

### Métodos de interfaces

<p>Todo método definido dentro de uma <code>interface</code> é implicitamente <code>public</code><br>
Uma <code>interface</code> define a interface pública de uma classe,<br>
ou seja, todos os seus métodos são <code>public</code></p>
