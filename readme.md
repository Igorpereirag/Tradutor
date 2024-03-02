# Tradutor Web

Este é um aplicativo da web simples que permite traduzir palavras de inglês para português. Ele utiliza um servlet Java para processar as solicitações do usuário e um arquivo de propriedades para armazenar as traduções.

## Tecnologias

- Java,jsp
- html e css
- Servidor Apache Tomcat

## Como usar

1. Clone ou baixe este repositório em seu computador.
2. Certifique-se de que o JDK, o Maven e o Tomcat estejam corretamente configurados em sua máquina.
3. No terminal, navegue até o diretório raiz do projeto.
4. Compile o projeto usando o comando Maven:

    ```bash
    mvn clean install
    ```

5. Implante o aplicativo na instância do Tomcat:

    ```bash
    mvn tomcat7:deploy
    ```

6. Abra um navegador da web e acesse o seguinte URL:

    ```
    http://localhost:8080/tradutor
    ```

7. Insira uma palavra em inglês na caixa de texto e pressione "Traduzir".
8. Veja a tradução correspondente em português.

## Arquivo de Tradução

O arquivo de tradução (`traducoes.properties`) contém as traduções das palavras. Aqui está um exemplo das traduções atualmente disponíveis:

```properties
hello=Olá
world=mundo
good=muito bom
cat=gato
dog=cachorro
house=casa
car=carro
book=livro
tree=árvore
computer=computador
water=água
sun=Sol
moon=lua
love=amor
friend=amigo
family=família
food=comida
drink=bebida
apple=maçã
orange=laranja
