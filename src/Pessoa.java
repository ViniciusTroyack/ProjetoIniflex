import java.time.LocalDate;

/** Classe para representar uma pessoa
 *
 * @author Vinicius Troyack
 * @version 1.0 12/06/2024
 */
public class Pessoa {

    /** Nome da Pessoa */
    private String nome;
    /** Data de Nascimento da pessoa */
    private LocalDate dataNascimento;

    /** Construtos da classe */
    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    /**
     * Metodos para retornar a nome da Pessoa
     * @return Retorna o nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodo para retornar a data de nascimento da Pessoa
     * @return Retorna a data de nascimento
     */
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}
