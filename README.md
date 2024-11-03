# Click Counter Application

Este é um projeto simples de um contador de cliques implementado em Java seguindo o padrão de design MVC (Model-View-Controller). A aplicação permite que o usuário incremente um contador ao clicar em um botão e também o resete com outro botão.

## Estrutura do Projeto

A aplicação está organizada em três pacotes principais:

- `model`: Contém a lógica do contador (Modelo).
- `view`: Interface gráfica com o usuário (Visão).
- `controller`: Controla a interação entre o modelo e a visão.

### Pastas e Arquivos

- **src**
    - **main**
        - **java**
          - **controller**
              - `Controller.java` - Controla as ações dos botões, conectando o `Model` e o `View`.
          - **model**
              - `Model.java` - Gerencia o valor do contador e contém os métodos para incrementar e resetar.
          - **view**
              - `View.java` - Exibe a interface com os botões e o rótulo de contagem.
          - `Main.java` - Ponto de entrada do programa.

## Arquitetura MVC

1. **Model** (`Model.java`)
    - Armazena o número de cliques.
    - Fornece métodos para incrementar e resetar o contador.

2. **View** (`View.java`)
    - Exibe a interface gráfica.
    - Possui um rótulo para mostrar o número de cliques e dois botões: "Clique" e "Resetar".

3. **Controller** (`Controller.java`)
    - Conecta a `View` ao `Model`.
    - Escuta os eventos de clique dos botões e atualiza o `Model` e a `View` de acordo.

## Pré-requisitos

Para compilar e rodar este projeto, você precisará de:

- JDK (Java Development Kit) versão 8 ou superior.
- Um editor de código como IntelliJ IDEA, Eclipse ou VS Code com suporte para projetos Java.

## Como Executar

1. Clone o repositório para o seu ambiente local:
   ```bash
   git clone https://github.com/giulliaVilanova/click_counter.git
