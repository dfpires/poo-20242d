package br.edu.fatecfranca.ex0;
// é objeto-todo para a associção com Product
// é objeto-parte para a associação com ShoppingCart

public class CarItem {
    private int id;
    private int quantity;
    // objeto-parte
    private Product product;

    public CarItem(){

    }
    public CarItem(int id, int quantity, Product product) {
        this.id = id;
        this.quantity = quantity;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "\nCarItem{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", product=" + product +
                '}';
    }
}
