## Exceções

São eventos que ocorrem durante a execução do programa que interrompem o fluxo normal

Há dois tipos de exceções:
 - [Verificadas](#exceções-verificadas): são verificadas no estágio de compilação
 - [Não verificadas](#exceções-não-verificadas): ocorrem durante a execução, devido à erros de lógica
   - São subclasses diretas da classe `RuntimeException`

As exceções tem que ser [tratadas](#tratamento-de-exceções), mas também podem ser [lançadas](#lançamento-de-exceções)

É importante utilizar o tratamento de excessões somente quando [necessário](#excesso-de-tratamentos)

Exceções podem ser [criadas](#criando-exceções) e a causa de uma exceção também pode ser [recuperada](#recuperando-a-causa), dependendo da necessidade 

### Tratamento de exceções

É realizado dentro de um bloco `try/catch`

#### Formato do bloco `try/catch`:
```java
try {
   //executar una ação
} catch (firstException e) {
   //lidar com a exceção "e"
} catch (secondException e) {
   //lidar com a exceção "e"
}
```

#### Lidando com múltiplas exceções no mesmo `catch`:
```java
try {
   //executar uma ação
} catch (firstException | secondException e) {
   //lidar com exceção "e"
}
```

### Lançamento de exceções 

Uma exceção deve ser lançada se uma suposição importante para um bloco de código não for verdadeira
 - Formato: `throw new Exception()`

Por exemplo, um método que soma os elementos de uma lista deve lançar uma exceção se o parâmetro recebido não for uma lista

#### Método lançando uma exceção:
```java
//IOException é um tipo específico de exceção 
public void umMetodo() throws IOException {
   //código
}
```

Também é possível lançar exceções dentro de outra exceção, o que é chamado de exceções encadeadas

#### Exemplo de lançamento de exceção encadeada:
```java
try {
   //código que pode lançar uma exceção 
} catch (Exception ex) {
   //formato: Exception ("mensagem", objeto_Throwable)
   throw new Exception ("Exceção encadeada", ex);
}
```

### Exceções verificadas

Muitas vezes causadas por inputs inválidos

O programa pode antecipar e tomar medidas caso essas exceções ocorram

#### Exemplo:
```java
Scanner entradaDados = new Scanner (System.in);
System.out.print ("Enter a file name: ");
System.out.flush();
String nomeArquivo = entradaDados.nextLine();

//tratando exceção
try {
   File arquivo = new File (nomeArquivo);
} catch (FileNotFoundException e) {
   //tratar exceção "e"
}
```

### Exceções não verificadas

Geralmente causadas por erros de lógica

Não é esperado que o programa pegue essas exceções, nem que ele se recupere delas

A origem do erro deve ser eliminada
 - Identificar e remover o erro de lógica

### Excesso de tratamentos

É importante tratar exceções somente quando necessário, como em erros considerados críticos

O uso em excesso pode tornar um programa difícil de ler

#### Exemplo de uso excessivo:
```java
public void method() {
   validador (p);
}
//valida o código e lança uma exceção 
private void validator (Object p) throws Exception {
   try {
      //algum código 
   } catch {
      //exceção 
   }
}
```

#### Exemplo de uma melhor abordagem:
```java
public void method() {
   if (!isValid (p)) throw new Exception();
}
//se "p" for válido (true), nenhuma exceção será lançada
private boolean isValid (Object p) {
   return //"true" ou "false"
}
```

### Recuperando a causa

Quando há muitas exceções pode ser necessário recuperar a causa de uma exceção específica 

O `getCause()` é utilizado, juntamente com `Throwable`, para retornar a causa de uma exceção

#### Exemplo:
```java
try {
   //alguma ação
} catch (Exception ex) {
   //getCause() retornará o objeto que causou a exceção "ex"
   Throwable causaExcecao = ex.getCause();
}
```

### Criando exceções

É possível criar uma exceção personalizada usando `extend Exceptions`, útil para:
 - Diferenciar exceções lançadas por suas clasees das lançadas por outras classes
 - Diferenciar entre exceções semelhantes/relacionadas

#### Criando nova exceção:
```java
public class NewException extends Exception {
   public NewException (String mensagem) {
      super (mensagem);
   }
   ...
}
```
