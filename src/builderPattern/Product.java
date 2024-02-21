package builderPattern;

//Product class
public class Product {
 private String field1;
 private String field2;
 // ... other fields ...

 private Product(Builder builder) {
     this.field1 = builder.field1;
     this.field2 = builder.field2;
     // ... initialize other fields ...
 }

 // Getter methods...

 // Builder class
 public static class Builder {
     private String field1;
     private String field2;
     // ... other fields ...

     public Builder field1(String value) {
         this.field1 = value;
         return this;
     }

     public Builder field2(String value) {
         this.field2 = value;
         return this;
     }

     // ... methods for other fields ...

     public Product build() {
         return new Product(this);
     }
 }
}



