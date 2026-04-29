## Saída de dados

A expressão mais comum para impressão na tela é: `System.out.print (conteudo)`

A classe `System` faz parte do pacote `java.lang`, portanto não precisa ser importada para ser usada

Existem algumas opções alternativas ao `print()`
 - `println (conteudo)`: comando `print` com quebra de liha após o `conteudo` ser impresso
 - `printf ("comteudo", formatacao)`: comando `print` formatado, é possível formatar vários itens presentes no `conteudo`

## Entrada de dados

A expressão mais comum para entrada via teclado é `Scanner sc = new Scanner (System.in)`, onde:
 - `sc`: é um novo objeto criado do tipo `Scanner`
 - `new Scanner()`: gerador do objeto `Scanner`
 - `System.in`: método de input padrão do sistema

A classe `Scamner` faz parte do pacote `java.util`, e deve ser importada para ser acessada
 - `import java.util.Scanner;`


