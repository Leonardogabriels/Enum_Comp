package entities;

public class OrderItem {
   private Integer quantity;
   private Double price;

   private Product product;

    public OrderItem() {
    }

    public OrderItem(Integer quantity,Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quntity) {
        this.quantity = quntity;
    }

    public Double getPrice() {
        return price = product.getPrice();
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    public Double subTotal(){
            return  price * quantity;
        }

    @Override
    public String toString() {
        return getProduct().getName()
                + ", $" 
                +String.format("%.2f",price)
                +", " + "quantity: " + quantity 
                +String.format(" Subtotal: %.2f",subTotal());
    }
    

    }
    

   
    

