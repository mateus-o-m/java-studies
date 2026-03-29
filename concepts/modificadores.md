## Modificadores

Palavras-chave que mudam o comportamento de variáveis,
classes ou métodos

Modificadores de acesso: indica a visibilidade
 * Nenhum modificador: visível para o pacote
 * `private`: visível somente à classe modificada
 * `public`: visível para todas as classes
 * `protected`: visível para o pacote e para as subclasses

Modificadores de não-acesso: indicam outras funcionalidades
 * `static`: torna uma declaração mais geral, e menos específica 
 * `final`: impede que a referência (da classe, método, variável) seja alterada
 * `abstract`: faz o JVM aguardar as subclasses implementarem
os métodos/classes

Nenhum modificador e modificador `public`:
 * Sem modificador: a variável é implicitamente visível à todas
as classes de um pacote
 * `public`: a variável é visível a qualquer classe, inclusive
as que estão fora do pacote, via `import` da classe/pacote

Modificador `private` e `protected`:
 * `private`: faz com que variáveis e métodos fiquem disponíveis
apenas dentro de suas classes
   * É usado para ajudar no encapsulamento doa dados
   * Variáveis privadas necessitam de funções do tipo "getter"
e "setter" para serem acessadas
 * `protected`: faz com que variáveis, métodos e construtores
fiquem disponíveis dentro de subclasses em outros pacotes, e
classes dentro de seu próprio pacote

Modificador `static` e `final`:
 * `static`: variáveis `static` são acessíveis em instâncias fora
da classe, con todas as instâncias compartilhando a mesma variável 
   * Métodos `static` não são permitidos 

### Encapsulamento

Manter as variáveis em uma classe privada, onde o uso de métodos
dentro da classe é necessário para acessá-las

Um objeto encapsulado determina qual tipo de dado será aceito e como
processar esse dado, sem influencias externas
 * O papel de um objeto encapsulado se torna claro para outros objetos
 * Reduz a interdependência entre classes

Métodos que utilizam compos privados:
 * "getter": retornam o valor de um campo privado
 * "setter": atualizam o valor de um campo privado
