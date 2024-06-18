# Projeto Bootcamp

Este projeto é uma simulação de um bootcamp de programação utilizando Java. Ele demonstra a criação e gestão de cursos, mentorias, desenvolvedores (alunos) e a estrutura de um bootcamp.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:

- **App**: Classe principal que executa o programa.
- **Bootcamp**: Representa um bootcamp com cursos e mentorias.
- **Curso**: Subclasse de `Conteudo`, representa um curso com título, descrição e carga horária.
- **Mentoria**: Subclasse de `Conteudo`, representa uma mentoria com título, descrição e data.
- **Dev**: Representa um desenvolvedor (aluno) inscrito no bootcamp.
- **Conteudo**: Classe abstrata base para `Curso` e `Mentoria`.

## Funcionalidades

### Classe `App`

- Cria instâncias de `Curso`, `Mentoria`, `Bootcamp` e `Dev`.
- Adiciona cursos e mentorias ao bootcamp.
- Inscreve desenvolvedores no bootcamp e simula seu progresso.

### Classe `Bootcamp`

- Atributos: `nome`, `descricao`, `dataInicio`, `dataFim`, `conteudos`, `devs`.
- Métodos para gerenciar os conteúdos e desenvolvedores do bootcamp.

### Classe `Dev`

- Atributos: `nome`, `conteudosInscritos`, `conteudosConcluidos`.
- Métodos: `inscreverBootcamp()`, `progredir()`, `calcularTotalXp()`.

### Classe `Conteudo`

- Atributos: `titulo`, `descricao`.
- Método abstrato `calcularXp()` para cálculo de XP.

### Classe `Curso`

- Atributos: `cargaHoraria`.
- Implementa `calcularXp()` baseado na carga horária.

### Classe `Mentoria`

- Atributos: `data`.
- Implementa `calcularXp()` com um valor fixo de XP.

## Diagrama de Classes

```mermaid
classDiagram
    Conteudo <|-- Curso
    Conteudo <|-- Mentoria
    Bootcamp "1" *-- "0..*" Conteudo
    Bootcamp "1" *-- "0..*" Dev
    Dev "1" *-- "0..*" Conteudo

    class Conteudo {
        <<abstract>>
        - double XP_PADRAO
        - String titulo
        - String descricao
        + String getTitulo()
        + void setTitulo(String titulo)
        + String getDescricao()
        + void setDescricao(String descricao)
        + double calcularXp()
    }

    class Curso {
        - int cargaHoraria
        + int getCargaHoraria()
        + void setCargaHoraria(int cargaHoraria)
        + double calcularXp()
        + String toString()
    }

    class Mentoria {
        - LocalDate data
        + LocalDate getData()
        + void setData(LocalDate data)
        + double calcularXp()
        + String toString()
    }

    class Dev {
        - String nome
        - Set~Conteudo~ conteudosInscritos
        - Set~Conteudo~ conteudosConcluidos
        + void inscreverBootcamp(Bootcamp bootcamp)
        + void progredir()
        + double calcularTotalXp()
        + String getNome()
        + void setNome(String nome)
        + Set~Conteudo~ getConteudosInscritos()
        + void setConteudosInscritos(Set~Conteudo~ conteudosInscritos)
        + Set~Conteudo~ getConteudosConcluidos()
        + void setConteudosConcluidos(Set~Conteudo~ conteudosConcluidos)
    }

    class Bootcamp {
        - String nome
        - String descricao
        - LocalDate dataInicio
        - LocalDate dataFim
        - Set~Conteudo~ conteudos
        - Set~Dev~ devs
        + String getNome()
        + void setNome(String nome)
        + String getDescricao()
        + void setDescricao(String descricao)
        + LocalDate getDataInicio()
        + LocalDate getDataFim()
        + Set~Conteudo~ getConteudos()
        + void setConteudos(Set~Conteudo~ conteudos)
        + Set~Dev~ getDevs()
        + void setDevs(Set~Dev~ devs)
    }

    class App {
        + void main(String[] args)
    }
