## Conceitos

### Dados primitivos: tipo mais básico de dados

<p>Primitivos numéricos: <code>byte, short, int, long, float, double</code><br>
Caractere: <code>char</code><br>
Booleano: <codeboolean</code><br>
Sufixos para dados numéricos: se não especificados, será tipo <code>int</code> para <code>long</code>, e tipo <code>double</code> para <code>float</code><br>
<code>float numFloat = 2.6f;
 double numDouble = 5.8d;
 long numLong = 876976L;</code></p>

### Dados tipo <code>String</code>

<p>Uma <code>String</code> não é um primitivo, e sim um objeto.<br>Inicialização da <code>String</code>: <code>String nome = "Meu nome";</code><br>
Concatenar string: <code>String nomeConcat = "Nome" + "Sobrenome";</code></p>

### Funções

<p>Também chamadas de métodos, devem estar dentro de uma <code>class</code><br>
Corpo de um método:<br>
<code>modificador tipoDeDadoRetornado nomeMetodo (parâmetros){
    //corpo de método
}</code><br>
Exemplo:<br>
<code>public static void olaMundo(){
    System.out.println("Olá mundo");
}</code><br>
Funções void: métodos que não retornam nenhum valor<br>
Funções não-void: retornam um valor específico, que pode ser de qualquer tipo (primitivo ou não)</p>

### Pacotes

<p>Maneira de organizar classes java, em arquivos <code>.jar</code><br
Usar pacotes permite a importação de um grupo de classes de uma só vez<br
Pacote <code>java.lang</code>, é um pacote que fornece classes fundamentais<br>
Exemplos:<br>
<code>package java.lang;</code> especifica que o arquivo java pertence a um pacote (java.lang)<br>
<code>import java.io.*;</code> importa todas as classes dentro do pacote java.io<br>
<code>import java.io.Cla;</code> importa somente a classe Cla do pacote java.io</p>

### Tipos de variáveis

#### Locais

<p>Usadas dentro de blocos (como contadores) ou de métodos (como variáveis temporárias)<br>
São usadas para guardar informação para um único método</p>

#### De instância

<p>Definem atributos/estados de um objeto em particular<br>
São usadas para guardar informação de multiplos objetos/métodos</p>

#### De classe

<p>Global para uma classe e todas as instâncias dentro dela<br>
Usada para se comunicar com diferentes objetos denteo de uma classe e acompanhar os estados globais</p>

### Operador ternário: alternativa ao <code>if</code> e <code>else</code>

<p>Formato: <code>resultado = condicaoTeste ? valorSeTrue : valorSeFalse;</code><br>
No exemplo abaixo, <code>x</code> receberá o valor de 4<br>
<code>int y = 3;
 int x = y > 2 ? 4 : 8;</code></p>

### Operador <code>.equals()</code>

<p>Objetos primitivos podem ser comparados usando o operador <code>==</code><br>
Exemplo:<br>
<code>boolean bol1 = True;
 boolean bol2 = False;
 boolean bol3 = (bol1 == bol2); //false</code><br>
Objetos não primitivos devem ser comparados utilizando <code>.equals()</code><br>
Formato: <code>objeto1.equals(objeto2)</code><br>
Exemplo:<br>
<code>String str1 = "Olá";
 String str2 = "Mundo";
 boolean compara = str1.equals(str2); //false</code><br>
O operador <code>==</code> pode ser usado para comparar a referência de objetos<br>
Exemplo:<br>
<code>Object o1 = new String ("Olá");
 Object o2 = new String ("Mundo");
 boolean objetosIguais = (o1 == o2); //false</code></p>

### Convenção para range de valores

<p>Quando especificando um range de valores: o primeiro valor no range (<code>from</code>) é incluso,<br>
enquanto o último valor no range (<code>to</code>) é excluso<br>
Formato: <code>String.substring (from, to)</code>, o caractere em <code>from</code> será incluso,<br> enquanto o caractere em <code>to</code> não será<br>
Exemplo: <code>"mundo".substring (1, 4);</code> retornará <code>"und"</code><br>
Essa convenção se aplica à:<br>
<code>List.sublist (from, to);</code> e <code>Arrays.copyOfRange (T[], from, to);</code></p>

### Operador <code>&&</code> (AND)

<p>Usado para testar multiplas relações<br>
<code>if (relação1 && relação2){
    //ação
}</code></p>

### Operadores <code>++</code> e <code>--</code>

<p>Java suporta duas formas de incremento/decremento curto<br>
Como prefixo: <code>++i</code> e <code>--i</code><br>
<code>int i = 2;
 int j = ++i;
 System.out.println (i);// 3
 System.out.println (j);// 3</code><br>
Como sufixo: <code>i++</code> e <code>i--</code><br>
<code>int i = 3;
 int j = i--;
 System.out.println (i);// 2
 System.out.println (j):// 3</code></p>

### Usando varargs: operador <code>...</code>

<p>Varargs são argumentos que podem aceitar uma quantidade variável de valores<br>
Na função abaixo, o parâmetro <code>preco</code> pode aceitar qualquer número de <code>int</code>s:<br>
<code>public int calcular (int...preco){
    Int soma = 0;
    for (int item: preco){
        soma += item;
    }
    return soma;
}</code><br>
O método <code>calcular</code> pode ser chamado de diversas maneiras:<br>
<code>int soma1 = calcular (24, 50, 3);
int soma2 = calcular (2, 6, 9, 44);</code></p>

### Comentários

<p>Uma linha: <code>//comentário</code><br>
Multi linha:<br>
<code>/*
comentários
*/</code></p>

### Iteração 

<p>O <code>Iterator</code> pode ser usado para iterar sobre uma coleção<br>
de valores usando o loop <code>for</code> ou o loop <code>while</code><br>
Exemplo de uso:<br>
<code>List<String> frutas = Arrays.asList ("banana", "laranja", "uva");
 //iterando sobre uma lista usando loop while
 Iterator<String> frutasLista = frutas.iterator();
 while (frutasLista.hasNext()) {
    System.out.println (frutasLista.next());
 }
 //iterando sobre uma lista usando loop while
 for (Iterator<String> frutasLista = frutas.iterator();
 frutasLista.hasNext())  System.out.println (frutasLista.next());
 }</code>