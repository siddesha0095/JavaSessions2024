package builderPattern;

//Usage example
public class Main1 {
 public static void main(String[] args) {
     Product product = new Product.Builder()
             .field1("Value1")
             .field2("Value2")
             // ... set other fields ...
             .build();

     // Use the product...
 }
}