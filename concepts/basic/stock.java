public class Product {
   public int quantity;
   public float price;
   public int id;
   public String name;

   public Product (int newQuantity, float newPrice, int newId, String newName) {
      quantity = newQuantity;
      price = newPrice;
      id = newId;
      name = newName;
   }

   @Override
   public String toString() {
      return "Produto: " + name + ", Quantidade: " + quantity + ", Preço: " + price;
   }
}

public class stock {
   public static void main(String[] args) {
      Product banana = new Product(5, 7.8f, 12098, "banana");
      Product arroz = new Product(20, 23f, 12048, "arroz");

      System.out.println("Produto: " + banana.name + ", Quantidade: " + banana.quantity);
      System.out.println("Produto: " + arroz.name + ", Quantidade: " + arroz.quantity);
   }
}
