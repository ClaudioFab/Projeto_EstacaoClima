**Mini Estação do Clima**

**Descrição:**

Este projeto é uma aplicação simples em Java que simula uma estação climática básica utilizando interface gráfica com JOptionPane.

O programa permite ao usuário inserir uma temperatura em graus Celsius e realizar diferentes operações com esse valor através de um menu interativo.

**Funcionalidades:**

- Inserir temperatura em Celsius

- Converter temperatura para Fahrenheit

- Converter temperatura para Kelvin

- Classificar o clima como:
  - *Frio*
  - *Agradável*
  - *Quente*

* Alterar a temperatura atual

* Encerrar o programa

**Estrutura do Projeto:**

O projeto é dividido em duas classes principais:

- Main_EstacaoClima
  - Responsável por:
    - Iniciar o programa
    - Solicitar a temperatura inicial
    - Exibir o menu interativo
    - Controlar o fluxo do programa

- Clima
  - Responsável por:
    - Armazenar a temperatura em Celsius
    - Realizar conversões de temperatura
    - Classificar o clima
    - Interagir com o usuário via JOptionPane
    
**Lógica do Sistema**

  - O programa solicita ao usuário uma temperatura inicial em Celsius.
  
  - Exibe um menu com opções de operação.
  
  - O usuário escolhe uma opção:
    - Conversões são calculadas com base na temperatura atual
    - A classificação do clima é exibida
    - A temperatura pode ser alterada

  - Após cada operação, o usuário decide se deseja continuar ou encerrar.

**Fórmulas Utilizadas**

  - Celsius para Fahrenheit
    - F = (C × 1.8) + 32

  - Celsius para Kelvin
    - K = C + 273.15

**Classificação do Clima**

  - Até 15°C → Frio
  - Entre 16°C e 25°C → Agradável
  - A partir de 26°C → Quente

**Tecnologias Utilizadas**

  - Java

  - JOptionPane (Swing)

**Como Executar**

  - Abra o projeto em uma IDE (ex: NetBeans)

  - Compile e execute a classe Main_EstacaoClima

  - Interaja com o sistema através das janelas exibidas

**Observações**

  - O programa utiliza métodos estáticos para algumas operações

  - A entrada de dados é feita via interface gráfica simples

  - Não há tratamento de erros para entradas inválidas (ex: letras no lugar de números)

**Autor**

Projeto desenvolvido para fins de estudo em programação orientada a objetos em Java.
