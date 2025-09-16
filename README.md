# Sistema de Gerenciamento de Pedidos

## Descrição do Projeto
Este projeto é um sistema de gerenciamento de pedidos para um restaurante, desenvolvido em **Java** como parte do Laboratório 1 da disciplina de LPII da Universidade Federal do Rio Grande do Norte (UFRN). A aplicação é executada via console e foi projetada para modelar um sistema de pedidos de forma organizada e eficiente.

## Índice
* **[Funcionalidades](#funcionalidades)**
* **[Requisitos Técnicos](#requisitos-técnicos)**
* **[Estrutura do Código](#estrutura-do-código)**
* **[Como Executar o Projeto](#como-executar-o-projeto)**

## Funcionalidades
O sistema interage com o usuário por meio de um menu principal no terminal, oferecendo as seguintes opções:

**1**. **`Criar novo pedido`**  
**2**. **`Listar pedidos`**  
**3**. **`Remover pedido`**  
**4**. **`Sair`**  


## Requisitos Técnicos
O projeto foi construído seguindo os requisitos e conceitos obrigatórios da atividade:

- **Linguagem:** Java
- **Programação Orientada a Objetos:** O sistema é modelado por três classes principais: `Restaurante`, `Pedido` e `Item`.
- **Composição:** O conceito de composição é aplicado, onde a classe `Pedido` contém uma lista de objetos da classe `Item`.
- **Estrutura de Dados:** Uma `ArrayList` é utilizada para armazenar a lista de pedidos.
- **Controle de Fluxo:** O menu principal é implementado com uma estrutura `switch-case` dentro de um loop `do-while`, garantindo que o menu continue em execução após cada operação.
- **Interface:** A interação com o usuário é feita via console, utilizando a classe `Scanner` para a entrada de dados.

## Estrutura do Código
O projeto está organizado em três classes principais, cada uma com sua responsabilidade específica:

- **Restaurante.java:** Classe principal que contém a lógica do sistema, o menu de interação e a lista de pedidos. É aqui que o programa inicia.
- **Pedido.java:** Representa um pedido individual. Contém atributos como o número de identificação, nome do cliente e a lista de itens. Possui métodos para adicionar itens, calcular o valor total e exibir a nota fiscal.
- **Item.java:** Representa um item que compõe um pedido. Possui atributos para o nome e o preço do item.

## Como Executar o Projeto
Para executar o sistema, siga as instruções abaixo:

1. **Clone o repositório:** Clone este repositório para o seu ambiente local de desenvolvimento.
2. **Abra o projeto:** Abra o projeto em sua IDE.
3. **Compile e execute:** Compile os arquivos e execute a classe `Restaurante.java`, que contém o método `main`.
4. **Interaja via console:** O programa será iniciado no console, e você poderá interagir com o menu para `criar`, `listar` e `remover` pedidos.
