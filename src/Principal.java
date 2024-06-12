import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

/** Classe responsalvel pelos metodos
 * 
 * @author Vinicius Troyack
 * @version 1.0 12/06/2024
 */
public class Principal {
    
    /**
     * 3.1
     * Metodo para criar uma lista de funcionarios de acordo com a tabela informada
     * @return Retorna a lista de funcionarios
     */
    public static List<Funcionario> criarListaDeFuncionarios() {
        return new ArrayList<>(Arrays.asList(
                new Funcionario("Maria", LocalDate.parse("2000-10-18"), new BigDecimal("2009.44"), "Operador"),
                new Funcionario("João", LocalDate.parse("1990-05-12"), new BigDecimal("2284.38"), "Operador"),
                new Funcionario("Caio", LocalDate.parse("1961-05-02"), new BigDecimal("9836.14"), "Coordenador"),
                new Funcionario("Miguel", LocalDate.parse("1988-10-14"), new BigDecimal("19119.88"), "Diretor"),
                new Funcionario("Alice", LocalDate.parse("1995-01-05"), new BigDecimal("2234.68"), "Recepcionista"),
                new Funcionario("Heitor", LocalDate.parse("1999-11-19"), new BigDecimal("1582.72"), "Operador"),
                new Funcionario("Arthur", LocalDate.parse("1993-03-31"), new BigDecimal("4071.84"), "Contador"),
                new Funcionario("Laura", LocalDate.parse("1994-07-08"), new BigDecimal("3017.45"), "Gerente"),
                new Funcionario("Heloísa", LocalDate.parse("2003-05-24"), new BigDecimal("1606.85"), "Eletricista"),
                new Funcionario("Helena", LocalDate.parse("1996-09-02"), new BigDecimal("2799.93"), "Gerente")
        ));
    }

    /**
     * 3.2 - Metodo para remover funcionarios pelo nome
     * @param funcionarios Lista de funcionarios a ser modificada
     * @param nome Nome a ser removido
     */
    public static void removerFuncionario(List<Funcionario> funcionarios, String nome) {
        funcionarios.removeIf(func -> func.getNome().equals(nome));
    }

    /**
     * 3.3 - Metodo para imprimir todos os funcionarios e suas informações 
     * @param funcionários Lista de funcionarios a ser impressa 
     */
    public static void imprimirFuncionarios(List<Funcionario> funcionarios) {
        System.out.println("Funcionários cadastrados:");
        funcionarios.forEach(System.out::println);
    }

    /**
     * 3.4 - Metodo para adicionar almento no salario dos funcionarios
     * @param funcionarios Lista de funcionarios que ira receber o aumentos
     * @param percentualDeAumento valor a ser multiplicado ao salario para o aumento
     */
    public static void aumentarSalario(List<Funcionario> funcionarios, BigDecimal percentualDeAumento) {
        funcionarios.forEach(func -> func.setSalario(func.getSalario().multiply(percentualDeAumento)));
    }

    /**
     * 3.5 - Metodo para criar um MAP dos funcionarios por funcao
     * @param funcionarios Lista de funcionarios a ser agrupado
     * @return retorna um MAP com os funcionarios agrupados por funcao
     */
    public static Map<String, List<Funcionario>> agruparFuncionariosPorFuncao(List<Funcionario> funcionarios) {
        return funcionarios.stream().collect(Collectors.groupingBy(Funcionario::getFuncao));
    }

    /**
     * 3.6 Metodo para imprimir a lista de funcionarios agrupados por funcao
     * @param funcionariosAgrupadosPorFuncao
     */
    public static void imprimirFuncionariosAgrupadosPorFuncao(Map<String, List<Funcionario>> funcionariosAgrupadosPorFuncao) {
        System.out.println("\nFuncionários agrupados por função:");
        funcionariosAgrupadosPorFuncao.forEach((funcao, infosFunc) -> {
            System.out.println(funcao + ":");
            infosFunc.forEach(System.out::println);
        });
    }

    /**
     * 3.8 Metodo para imprimir a lista de funcionarios que fazem aniversario em um determinado mes
     * @param funcionarios Lista de funcionarios para buscar os aniversariantes
     * @param mes Mes de aniversario
     */
    public static void imprimirAniversariantesDoMes(List<Funcionario> funcionarios, int mes) {
        System.out.println("\nAniversariantes do mes " + mes +":");
        funcionarios.stream()
                .filter(func -> func.getDataNascimento().getMonthValue() == mes)
                .forEach(System.out::println);
    }

    /**
     * 3.9 Metodo para buscar e imprimir o funcionario com mais idade dentro de uma lista de funcionarios
     * @param funcionários Lista de funcionario onde sera feita a pesquisa
     */
    public static void imprimirFuncionarioMaisVelho(List<Funcionario> funcionarios) {
        System.out.println("\nFuncionário com a maior idade:");
        Funcionario funcionarioMaisVelho = Collections.min(funcionarios, Comparator.comparing(Funcionario::getDataNascimento));
        int idadeMaisVelho = Period.between(funcionarioMaisVelho.getDataNascimento(), LocalDate.now()).getYears();
        System.out.println(funcionarioMaisVelho.getNome() + " - " + idadeMaisVelho + " anos");
    }

    /**
     * 3.10 Metodo para imprimir uma lista de funcionario em ordem alfabetica
     * @param funcionários Lista de funcionarios a ser ordenada
     */
    public static void imprimirFuncionáriosEmOrdemAlfabetica(List<Funcionario> funcionarios) {
        System.out.println("\nFuncionários em ordem alfabética:");
        funcionarios.stream()
                .sorted(Comparator.comparing(Funcionario::getNome))
                .forEach(System.out::println);
    }

    /**
     * 3.11 - Metodos para imprimir o total dos salarios de uma lista de funcionarios
     * @param funcionários Lista de funcionarios para a soma dos salarios
     */
    public static void imprimirTotalDeSalários(List<Funcionario> funcionarios) {
        BigDecimal totalSalarios = funcionarios.stream()
                .map(Funcionario::getSalario)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("\nTotal dos salários: " + totalSalarios.toString().replace(".", ","));
    }

    /**
     * 3.12 Metodo para calcular quantos salarios minimos ganha cada funcionario de um lista de funcionarios
     * @param funcionários Lista de funcionarios a ser calculada
     */
    public static void imprimirQuantiadadeSalariosMinimos(List<Funcionario> funcionarios) {
        BigDecimal salarioMinimo = new BigDecimal("1212.00");
        System.out.println("\nSalários mínimos por funcionário:");
        funcionarios.forEach(func -> {
            BigDecimal saláriosMínimos = func.getSalario().divide(salarioMinimo, RoundingMode.HALF_UP);
            System.out.println(func.getNome() + " - " + saláriosMínimos.toString().replace(".", ","));
        });
    }
}
