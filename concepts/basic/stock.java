public class stock {
   public static void main(String[] args) {
      Product banana = new Product(5, 7.8f, 12098, "banana");
      Product arroz = new Product(20, 23f, 12048, "arroz");

      System.out.println("Produto: " + banana.name + ", Quantidade: " + banana.quantity);
      System.out.println("Produto: " + arroz.name + ", Quantidade: " + arroz.quantity);
   }
}
