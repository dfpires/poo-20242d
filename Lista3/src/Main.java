import br.edu.fatecfranca.ex0.CarItem;
import br.edu.fatecfranca.ex0.Product;
import br.edu.fatecfranca.ex0.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        Product prod1 = new Product(1, "Monitor", 600);
        Product prod2 = new Product(2, "Teclado", 140);
        Product prod3 = new Product(3, "Mouse", 90);

        ShoppingCart sc1 = new ShoppingCart(1, "Franca", "Cartão de crédito");
        sc1.addCarItem(1, 5, prod1);
        sc1.addCarItem(3, 10, prod2);
        sc1.calculatePrice();
        System.out.println(sc1.toString());

        ShoppingCart sc2 = new ShoppingCart(2, "Batatais", "PIX");
        sc2.addCarItem(2, 6, prod1);
        sc2.addCarItem(5, 20, prod3);
        sc2.calculatePrice();
        System.out.println(sc2.toString());

    }
}