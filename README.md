# Desafio DIO - Sistema Operacional Simplificado para iPhone

Este projeto em Java implementa um sistema operacional simplificado para um iPhone, inspirado no modelo de lançamento do iPhone de 2007. O sistema simula três principais funcionalidades do dispositivo:

1. **Reprodutor Musical**: Capaz de tocar, pausar e selecionar músicas.
2. **Aparelho Telefônico**: Permite realizar chamadas, atender chamadas e iniciar o correio de voz.
3. **Navegador na Internet**: Possibilita exibir páginas web, adicionar novas abas e atualizar páginas.

## Funcionalidades Modeladas

### Reprodutor Musical

- **Método `tocar()`**: Inicia a reprodução de música, exibindo a mensagem "Reproduzindo música".
- **Método `pausar()`**: Pausa a música que está sendo reproduzida, exibindo a mensagem "Música pausada".
- **Método `selecionarMusica(String musica)`**: Permite ao usuário selecionar uma música específica, exibindo a mensagem "Selecionando a música: [nome da música]".

### Aparelho Telefônico

- **Método `ligar(String numero)`**: Realiza uma chamada para o número fornecido, exibindo a mensagem "Ligando para: [número]".
- **Método `atender()`**: Atende uma chamada recebida, exibindo a mensagem "Atendendo a chamada".
- **Método `iniciarCorreioVoz()`**: Inicia o correio de voz, exibindo a mensagem "Iniciando o correio de voz".

### Navegador na Internet

- **Método `exibirPagina(String url)`**: Exibe a página da web correspondente ao URL fornecido, exibindo a mensagem "Exibindo a página: [URL]".
- **Método `adicionarNovaAba()`**: Adiciona uma nova aba no navegador, exibindo a mensagem "Adicionando uma nova aba".
- **Método `atualizarPagina()`**: Atualiza a página web atual, exibindo a mensagem "Atualizando a página".

## Estrutura do Código

- **Classe `SistemaOperacional`**: Contém o método `main` que inicia o sistema e gerencia o menu principal, permitindo ao usuário escolher entre as funcionalidades disponíveis.
- **Classe `Iphone`**: Implementa as interfaces `ReprodutorMusical`, `AparelhoTelefonico` e `NavegadorInternet`, definindo os métodos correspondentes a cada funcionalidade.

## Exemplo de Uso

1. Execute o programa.
2. Escolha uma das funcionalidades no menu principal.
3. Siga as instruções para tocar músicas, fazer chamadas ou navegar na internet.

## Considerações Finais

Este projeto ilustra a aplicação de conceitos de Programação Orientada a Objetos (POO) em Java, como interfaces, encapsulamento e modularização, proporcionando uma base prática para o desenvolvimento de sistemas interativos complexos.
