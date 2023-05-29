- [x] Spring boot
- [x] Java 11+
- [x] Lombok
- [x] Maven
- [x] Postman / Insomnia
- [x] JPA / Hibernate
- [x] Flyway
- [x] MySQL Connector
- [x] 3 tipos de padrões de projeto
  - [x] M.V.C.
    - O padrão de Projeto MVC é um padrão arquitetural que separa as preocupações de apresentação, lógica de negócios e armazenamento de dados em uma aplicação, dividindo-a em três partes principais: Model, View e Controller. Ele promove a modularidade e flexibilidade do código.

  - [x] Builder
    - O padrão Builder é usado para separar a construção de um objeto complexo de sua representação final. Ele permite que você crie objetos complexos passo a passo, com cada passo sendo executado por um construtor dedicado. Isso é útil quando você precisa criar objetos complexos com muitas opções de configuração diferentes.

  - [x] Factory Method
    - O padrão Factory Method é um padrão de projeto de criação que fornece uma interface para criar objetos em uma superclasse, enquanto permite que as subclasses alterem o tipo de objetos que serão criados. Isso é útil quando se deseja delegar a criação de objetos para subclasses ou quando o tipo de objeto a ser criado só é determinado em tempo de execução. Para implementá-lo, é necessário criar uma interface ou classe abstrata para a criação de objetos e permitir que as subclasses implementem o método de criação para retornar o objeto desejado.

- [x] consumir 1 serviço externo
  - ???
- [x] guardar historico (Banco de dados)

---

### Link

<https://api.nasa.gov/planetary/apod?api_key=**API_KEY**&start_date=2023-04-14&thumbs=True>

---

### Excluídos

- Angular 8+ (<https://mvnrepository.com/artifact/org.webjars.npm/angular>)

### Alterações

- [x] SpacePController: Trocar "APOD" da linha 23, pois o array deve ficar na linha de baixo, e o link da "save.midia" deve se tornar uma
- [x] constante dentro da implementação do service.
- [x] Criar endpoint da API para retornar o dia e gerar relatório dos últimos 7 dias, assim como o endpoint para as 7 últimas imagens.
- [x] Ao apresentar o projeto, se não for possível fazer a requisição, exibir "ZERO".
- [x] Alterar "Media[]" para "MediaDTO" na lista.
- [x] Fazer a API atualizar a data para obter a data atual do dia para a requisição.
- [x] Alterar a extensão do link da API nos Utils, assim como a foto que foi enviada.
- [x] Remover linhas extras nos arquivos e comentários desnecessários.
