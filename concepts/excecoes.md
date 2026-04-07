\## Exceções



São eventos que ocorrem durante a execução do programa que interrompem o fluxo normal



Há dois tipos de exceções:

&#x20;\* Verificadas: são verificadas no estágio de compilação

&#x20;\* Não verificadas: ocorrem durante a execução, devido à erros de lógica

&#x20;  \* São subclasses diretas da classe `RuntimeException`

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



