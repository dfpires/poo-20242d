import br.edu.fatecfranca.exe0.Assistente;
import br.edu.fatecfranca.exe0.Diretor;
import br.edu.fatecfranca.exe0.Funcionario;
import br.edu.fatecfranca.exe0.Gerente;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void calculaFolhaPagto(List<Funcionario> funcionarios){
        float soma  = 0;
        for(Funcionario funcionario: funcionarios){
            soma += funcionario.calculaSalario();
        }
        System.out.println("O total da folha é R$ " + soma);
    }
    public static void polimorfismo(Funcionario funcionario) {
        System.out.println(funcionario.toString());
    }
    public static void main(String[] args) {
      //  Funcionario fu1 = new Funcionario(); -> não pode fazer

        Assistente ass1 =
new Assistente("Pedro", "Franca", "123.456.789-0", 3000,
        8);
        polimorfismo(ass1);
        Gerente ger1 = new Gerente("Paulo", "Cristais", "977.342",
                5000, 3000);
        polimorfismo(ger1);
        Diretor dir1 = new Diretor("Marcos", "Pedregulho", "021.439",
                8000, 1000);
        polimorfismo(dir1);

        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(ass1);
        funcionarios.add(ger1);
        funcionarios.add(dir1);
        calculaFolhaPagto(funcionarios);

    }
}