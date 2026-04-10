\## Exceções



São eventos que ocorrem durante a execução do programa que interrompem o fluxo normal



Há dois tipos de exceções:

&#x20;\* \[Verificadas](#exceções-verificadas): são verificadas no estágio de compilação

&#x20;\* \[Não verificadas](#exceções-não-verificadas): ocorrem durante a execução, devido à erros de lógica

&#x20;  \* São subclasses diretas da classe `RuntimeException`



As exceções tem que ser \[tratadas](#tratamento-de-exceções), mas também podem ser \[lançadas](#lançamento-de-exceções)



É importante utilizar o tratamento de excessões somente quando \[necessário](#excesso-de-tratamentos)



Exceções podem ser \[criadas](#criando-exceções) e a causa de uma exceção também pode ser \[recuperada](#recuperando-a-causa), dependendo da necessidade 



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



\#### Lidando com múltiplas exceções no mesmo `catch`:

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



Também é possível lançar exceções dentro de outra exceção, o que é chamado de exceções encadeadas



\#### Exemplo de lançamento de exceção encadeada:

```java

try {

&#x20;  //código que pode lançar uma exceção 

} catch (Exception ex) {

&#x20;  //formato: Exception ("mensagem", objeto\_Throwable)

&#x20;  throw new Exception ("Exceção encadeada", ex);

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



Geralmente causadas por erros de lógica



Não é esperado que o programa pegue essas exceções, nem que ele se recupere delas



A origem do erro deve ser eliminada

&#x20;\* Identificar e remover o erro de lógica



\### Excesso de tratamentos



É importante tratar exceções somente quando necessário, como em erros considerados críticos



O uso em excesso pode tornar um programa difícil de ler



\#### Exemplo de uso excessivo:

```java

public void method() {

&#x20;  validador (p);

}

//valida o código e lança uma exceção 

private void validator (Object p) throws Exception {

&#x20;  try {

&#x20;     //algum código 

&#x20;  } catch {

&#x20;     //exceção 

&#x20;  }

}

```



\#### Exemplo de uma melhor abordagem:

```java

public void method() {

&#x20;  if (!isValid (p)) throw new Exception();

}

//se "p" for válido (true), nenhuma exceção será lançada

private boolean isValid (Object p) {

&#x20;  return //"true" ou "false"

}

```



\### Recuperando a causa



Quando há muitas exceções pode ser necessário recuperar a causa de uma exceção específica 



O `getCause()` é utilizado, juntamente com `Throwable`, para retornar a causa de uma exceção



\#### Exemplo:

```java

try {

&#x20;  //alguma ação

} catch (Exception ex) {

&#x20;  //getCause() retornará o objeto que causou a exceção "ex"

&#x20;  Throwable causaExcecao = ex.getCause();

}

```



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



