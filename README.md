# Teste Prático - Iniflex

Este projeto em Java é um teste pratico.

## Estrutura do Projeto

O projeto contém as seguintes classes principais:

1. **Pessoa**: Classe base que define atributos comuns a todas as pessoas, como nome e data de nascimento (representada por `LocalDate`).

2. **Funcionário**: Subclasse de `Pessoa` que adiciona atributos específicos de funcionário, como salário (representado por `BigDecimal`) e função.

3. **Principal**: Classe que contém métodos estáticos para manipulação dos funcionários. Inclui operações como inserção de funcionários, remoção, atualização de salário, agrupamento por função, entre outras.

4. **App**: Classe principal que instancia a lista de funcionários e chama os métodos estáticos da classe `Principal` para realizar as operações desejadas.

## Funcionalidades Implementadas

- Inserção de funcionários na lista com dados pré-definidos.
- Remoção de um funcionário específico.
- Impressão detalhada de todos os funcionários, formatando a data de nascimento no padrão dd/mm/aaaa e o salário no formato brasileiro (ponto para milhar e vírgula para decimal).
- Aplicação de aumento de salário para todos os funcionários.
- Agrupamento dos funcionários por função em um mapa.
- Impressão dos funcionários agrupados por função.
- Identificação e impressão dos funcionários que fazem aniversário nos meses de outubro e dezembro.
- Identificação e impressão do funcionário mais velho, exibindo nome e idade.
- Impressão da lista de funcionários em ordem alfabética.
- Cálculo e impressão do total dos salários dos funcionários.
- Cálculo e impressão de quantos salários mínimos cada funcionário ganha, considerando o salário mínimo como R$ 1.212,00.

## Como Executar

Para executar o projeto, basta compilar e rodar a classe `App.java`. Certifique-se de ter configurado o ambiente de desenvolvimento Java adequado e tenha uma IDE instalada para facilitar o processo de compilação e execução.

## Requisitos

- JDK (Java Development Kit) instalado e configurado corretamente.
- IDE (como IntelliJ IDEA, Eclipse, NetBeans) ou editor de texto para edição e compilação do código.

Este projeto é um exemplo básico de manipulação de objetos em Java, demonstrando conceitos como herança, coleções, formatação de datas e números, além do uso de métodos estáticos para operações de negócio.
