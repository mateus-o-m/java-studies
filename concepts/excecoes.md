\## Exceções



São eventos que ocorrem durante a execução do programa que interrompem o fluxo normal



Há dois tipos de exceções:

&#x20;\* \[Verificadas](#exceções-verificadas): são verificadas no estágio de compilação

&#x20;\* \[Não verificadas](#exceções-não-verificadas): ocorrem durante a execução, devido à erros de lógica

&#x20;  \* São subclasses diretas da classe `RuntimeException`



As exceções tem que ser \[tratadas](#tratamento-de-exceções), mas também podem ser \[lançadas](#lançamento-de-exceções)



Exceções também podem ser \[criadas](#criando-exceções), dependendo da necessidade 



\### Tratamento de exceções



É realizado dentro de um bloco `try/catch`



\#### Formato do bloco `try/catch`:

```java

try {

&#x20;  //executar una ação

} catch (firstException e) {

&#x20;  //lidar com a exceção "e"

} catch (secondException e) {

&#x20;  //lidar com a exceção "e"

}

```



\#### Lidando com múltiplas exceções no mesmo `Catch`:

```java

try {

&#x20;  //executar uma ação

} catch (firstException | secondException e) {

&#x20;  //lidar com exceção "e"

}

```



\### Lançamento de exceções 



Uma exceção deve ser lançada se uma suposição importante para um bloco de código não for verdadeira

&#x20;\* Formato: `throw new Exception()`



Por exemplo, um método que soma os elementos de uma lista deve lançar uma exceção se o parâmetro recebido não for uma lista



\#### Método lançando uma exceção:

```java

//IOException é um tipo específico de exceção 

public void umMetodo() throws IOException {

&#x20;  //código

}

```



\### Exceções verificadas



Muitas vezes causadas por inputs inválidos



O programa pode antecipar e tomar medidas caso essas exceções ocorram



\#### Exemplo:

```java

Scanner entradaDados = new Scanner (System.in);

System.out.print ("Enter a file name: ");

System.out.flush();

String nomeArquivo = entradaDados.nextLine();



//tratando exceção

try {

&#x20;  File arquivo = new File (nomeArquivo);

} catch (FileNotFoundException e) {

&#x20;  //tratar exceção "e"

}

```



\### Exceções não verificadas



\### Criando exceções



É possível criar uma exceção personalizada usando `extend Exceptions`, útil para:

&#x20;\* Diferenciar exceções lançadas por suas clasees das lançadas por outras classes

&#x20;\* Diferenciar entre exceções semelhantes/relacionadas



\#### Criando nova exceção:

```java

public class NewException extends Exception {

&#x20;  public NewException (String mensagem) {

&#x20;     super (mensagem);

&#x20;  }

&#x20;  ...

}

```

