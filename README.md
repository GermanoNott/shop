# E-COMMERCE
Essa aplicação é destinada a um sistema de e-commerce.

Foi desenvolvido um back-end em Java Spring Boot que se conecta com um banco mySQL e atende padrões métodos API. Existe a documentação no SWAGGER para tal. 

Foi desenvolvido front-end em React utilizando fetch para comunicação com os endpoints e estilização em tailwinds.css. 

# BACK-END
JavaSE 11 - openjdk version 16.0.2

Apache Maven 3.8.5

Utilizando biblioteca LOMBOK*

A criação do projeto obedeceu a um padrão de estruturação de pacotes (service, repository, controller...)

Utilização do Spring repository JPA para conexão com BD.

A conexão do BD foi especificada no arquivo MySqlConfiguration.java.

A entidade modelo é PRODUTO, onde foi realizado o CRUD no service e realizado os acessos as operações através de padrões de methods API Gateway.

A documentação foi realizada pelo Swagger, a configuração está no SwaggerConfig.java

Foi realizado o controle de acesso pelos sites externos no CorsConfig.java

Ao iniciar o projeto Spring Boot a conexão com BD já deve existir localhost:3306, com o BD bd_product criado. O mesmo se encarrega de criar as tabelas do pacote model.

# FRONT-END
Node version v16.14.0

NPM version 8.5.2

Utilizado o Tailwinds.css para estilização dos componentes. Essa biblioteca utiliza HTML e CSS explicito. 

Utilizado o FETCH para se conectar com o back-end.

Foi desenvolvida uma tela onde mostra os produtos disponíveis do recomece e uma tela onde pode incluir um produto com imagem. A ideia seria incluir uma funcionalidade para poder alterar os dados do produto. Porem, devido ao tempo desprendido para confecção dos projetos front , back e bd. Não foi possível.



# REFERÊNCIAS
 - Como construir uma API Spring Boot: https://www.oracle.com/br/technical-resources/articles/dsl/crud-rest-sb2-hibernate.html
 - HTTP Methods https://restfulapi.net/http-methods/
 - Microservices https://spring.io/microservices
 - JavaScript: Fetch https://www.devmedia.com.br/javascript-fetch/41206
 - useState in React: A complete guide https://blog.logrocket.com/a-guide-to-usestate-in-react-ecb9952e406c/
 - Preparação do ambiente para desenvolvimento em Java https://www.devmedia.com.br/preparacao-do-ambiente-para-desenvolvimento-em-java/25188
 - Swagger https://en.wikipedia.org/wiki/Swagger_(software)
 - MySQL Tutotial https://www.devmedia.com.br/mysql-tutorial/33309

# CURSOS

 - Spring Boot + React JS: Desenvolva Aplicações Web Completas https://www.udemy.com/course/desenvolva-aplicacoes-completas-com-spring-boot-e-react-js/learn/lecture/16258300#overview




![image](https://user-images.githubusercontent.com/64489811/159278361-d3b83956-6e5f-4a34-9b59-fedb0049ae17.png)
