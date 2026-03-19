## Modificadores

Palavras-chave que mudam o comportamento de variáveis,
classes ou métodos

Modificadores de acesso: indica a visibilidade
 * Nenhum modificador: visível para o pacote
 * `private`: visível somente à classe modificada
 * `public`: visível para todas as classes
 * `protected`: visível para o pacote e para as subclasses

Nenhum modificador vs modificador `public`:
 * Sem modificador: a variável é implicitamente visível à todas
as classes de um pacote
 * `public`: a variável é visível a qualquer classe, inclusive
as que estão fora do pacote, via

Modificadores de não-acesso: indicam outras funcionalidades
 * `static`: torna uma declaração mais geral, e menos específica 
 * `final`: impede que a referência (da classe, método, variável) seja alterada
 * `abstract`: faz o JVM aguardar as subclasses implementarem
os métodos/classes
