- [X] Spring boot
- [X] Java 11+
- [X] Lombok
- [X] Maven
- [X] Postman / Insomnia
- [X] JPA / Hibernate
- [X] Flyway
- [X] MySQL Connector
- [X] 3 tipos de padrões de projeto

  - [X] M.V.C.

    - O padrão de Projeto MVC é um padrão arquitetural que separa as preocupações de apresentação, lógica de negócios e armazenamento de dados em uma aplicação, dividindo-a em três partes principais: Model, View e Controller. Ele promove a modularidade e flexibilidade do código.
  - [X] Builder

    - O padrão Builder é usado para separar a construção de um objeto complexo de sua representação final. Ele permite que você crie objetos complexos passo a passo, com cada passo sendo executado por um construtor dedicado. Isso é útil quando você precisa criar objetos complexos com muitas opções de configuração diferentes.
  - [X] Factory Method

    - O padrão Factory Method é um padrão de projeto de criação que fornece uma interface para criar objetos em uma superclasse, enquanto permite que as subclasses alterem o tipo de objetos que serão criados. Isso é útil quando se deseja delegar a criação de objetos para subclasses ou quando o tipo de objeto a ser criado só é determinado em tempo de execução. Para implementá-lo, é necessário criar uma interface ou classe abstrata para a criação de objetos e permitir que as subclasses implementem o método de criação para retornar o objeto desejado.
- [X] consumir 1 serviço externo

  - Astronomy Picture Of the Day no site da [NASA](api.nasa.gov)
- [X] guardar historico (Banco de dados)

---

### Link

[https://api.nasa.gov/planetary/apod](https://api.nasa.gov/planetary/apod?api_key=**API_KEY**&start_date=2023-04-14&thumbs=True) <!-- Censurada -->

---

### Excluídos

- [Angular 8+](https://mvnrepository.com/artifact/org.webjars.npm/angular)

### Alterações

- [X] SpacePController: Trocar "APOD" da linha 23, pois o array deve ficar na linha de baixo, e o link da "save.midia" deve se tornar uma
- [X] constante dentro da implementação do service.
- [X] Criar endpoint da API para retornar o dia e gerar relatório dos últimos 7 dias, assim como o endpoint para as 7 últimas imagens.
- [X] Ao apresentar o projeto, se não for possível fazer a requisição, exibir "ZERO".
- [X] Alterar "Media[]" para "MediaDTO" na lista.
- [X] Fazer a API atualizar a data para obter a data atual do dia para a requisição.
- [X] Alterar a extensão do link da API nos Utils, assim como a foto que foi enviada.
- [X] Remover linhas extras nos arquivos e comentários desnecessários.
