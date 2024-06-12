import java.util.List;
import java.util.Map;
import java.math.BigDecimal;

/** 
 * @author Vinicius Troyack
 * @version 1.0 12/06/2024
 */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Teste Prático - Iniflex");

        //3.1
        List<Funcionario> funcionarios = Principal.criarListaDeFuncionarios();

        //3.2
        Principal.removerFuncionario(funcionarios, "João");

        //3.3
        Principal.imprimirFuncionarios(funcionarios);

        // 3.4
        Principal.aumentarSalario(funcionarios, new BigDecimal("1.10"));

        // 3.5
        Map<String, List<Funcionario>> funcionariosAgrupadosPorFuncao = Principal.agruparFuncionariosPorFuncao(funcionarios);

        //3.6
        Principal.imprimirFuncionariosAgrupadosPorFuncao(funcionariosAgrupadosPorFuncao);

        //3.8
        Principal.imprimirAniversariantesDoMes(funcionarios, 10);
        Principal.imprimirAniversariantesDoMes(funcionarios, 12);

        //3.9
        Principal.imprimirFuncionarioMaisVelho(funcionarios);

        //3.10
        Principal.imprimirFuncionáriosEmOrdemAlfabetica(funcionarios);

        //3.11
        Principal.imprimirTotalDeSalários(funcionarios);

        // 3.12
        Principal.imprimirQuantiadadeSalariosMinimos(funcionarios);
    }
}
