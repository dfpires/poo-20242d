import br.edu.fatecfranca.exe0.AtletaVolei;
import br.edu.fatecfranca.exe0.AtletaVoleiBasquete;
import br.edu.fatecfranca.exe0.IJogadorBasquete;
import br.edu.fatecfranca.exe0.IJogadorVolei;

public class Main {
    public static void main(String[] args) {
        IJogadorVolei obj1 = new AtletaVolei();
        obj1.levantar();
        obj1.sacar();

        IJogadorBasquete obj2 = new AtletaVoleiBasquete();
        obj2.arremessar();
        obj2.cobrarLanceLivre();

        IJogadorVolei obj3 = new AtletaVoleiBasquete();
        obj3.levantar();
        obj3.sacar();
    }
}