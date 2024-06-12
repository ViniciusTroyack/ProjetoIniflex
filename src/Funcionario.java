import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.math.RoundingMode;

/** Classe para representar um Funcionario
 * Essa classe estende a classe Pessoa
 *
 * @author Vinicius Troyack
 * @version 1.0 12/06/2024
 */
public class Funcionario extends Pessoa {
    
    /** Salario do funcionario */
    private BigDecimal salario;
    /** Funcao do funcionario */
    private String funcao;

    /** Construtor da classe */
    public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salarioInicial, String funcaoInicial) {
        super(nome, dataNascimento);
        this.salario = salarioInicial;
        this.funcao = funcaoInicial;
    }

    /**
     * Metodo que retorna o salario do Funcionario
     * @return Retorna salario
     */
    public BigDecimal getSalario() {
        return salario;
    }

    /**
     * Metodo para alterar o salario do funcionario
     * @param salario Novo valor de salario
     */
    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    /**
     * Metodos para retornar o cargo/funcao do funcionario
     * @return Retorna a funcao
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * Sobreposição do metodo toString para formatar as informações do Funcionario
     */
    @Override
    public String toString() {
        return String.format("%s - %s - %s - %s",
                getNome(),
                getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                salario.setScale(2, RoundingMode.HALF_UP).toString().replace(".", ","),
                funcao);
    }
}
