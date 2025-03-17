!["Imagem desafio"](https://user-images.githubusercontent.com/66698429/227000674-0d88d9f6-cef8-47c3-87b4-b83ff7db4a13.png?text=imagem+lindona+do+meu+projeto)
# Consultar-CEP-JAVA

Este projeto em Java tem como objetivo fornecer uma ferramenta para consulta de endereços a partir de um Código de Endereçamento Postal (CEP) válido no Brasil. Ao fornecer um CEP, o sistema retorna informações detalhadas como rua, bairro, cidade e estado correspondentes.

## Funcionalidades

- **Consulta de Endereço por CEP**: Ao inserir um CEP válido, o sistema retorna o endereço completo associado.
- **Tratamento de CEPs Inválidos**: Se um CEP inválido for fornecido, o sistema informa que o CEP é inválido.
- **Busca Aproximada**: Para CEPs válidos que não retornam um endereço específico, o sistema realiza uma busca aproximada, substituindo os últimos dígitos da direita para a esquerda até encontrar um endereço correspondente.

## Tecnologias Utilizadas

- **Java SE**: Linguagem principal utilizada no desenvolvimento do projeto.
- **Maven**: Ferramenta de automação de compilação e gerenciamento de dependências.
- **APIs de Consulta de CEP**: Integração com serviços de terceiros para obtenção de dados de endereços a partir do CEP fornecido.
- 
## Como Executar

1. **Pré-requisitos**:
   - Java JDK 17 ou superior instalado.
   - Maven instalado e configurado no PATH do sistema.

2. **Clonar o Repositório**:
   ```bash
   git clone https://github.com/EduDalla/Consultar-CEP-JAVA.git
   ```


3. **Compilar o Projeto**:
   ```bash
   mvn clean install
   ```


4. **Executar a Aplicação**:
   ```bash
   java -jar target/consultar-cep-java-1.0-SNAPSHOT.jar
   ```


5. **Utilizar a Aplicação**:
   - Insira um CEP válido quando solicitado para obter o endereço correspondente.
   - Caso o CEP seja inválido, uma mensagem de erro será exibida.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests com melhorias, correções de bugs ou novas funcionalidades.

## Licença

Este projeto está licenciado sob a licença MIT. Consulte o arquivo LICENSE para mais detalhes.
