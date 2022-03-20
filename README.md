# E-COMMERCE
Essa aplicação é destinada a um sistema de e-commerce.

Foi desenvolvido um backend em Java Spring Boot que se conecta com um banco mySQL e atende padrões metodos API. Existe a documentação no SWAGGER para tal. 

Foi desenvolvido frontend em REACT utilizando fetch para comunicação com os endpoints e estilização em tailwinds.css. 

# BACK END
openjdk version 16.0.2

Apache Maven 3.8.5

Utilizando biblioteca LOMBOK*

A criação do projeto obedeceu um padrão de estruturação de pacotes (service, repository, controller...)

Utilização do Spring repository JPA para conexão com BD.

A conexão do BD foi especificado no arquivo MySqlConfiguration.java.

A entidade modelo é PRODUTO, onde foi realizado o CRUD no service e realizado os acessos as operacoes atraves de padroes de methodds API Gateway.

A documentacao foi realizada pelo Swagger, a configuracao esta no SwaggerConfig.java

Foi realizado o controle de acesso pelos sites externos no CorsConfig.java

*Tentei usar nesse projeto mas não funcionou, depois usei em outro projeto e funcionou

##FRONTEND
Node version v16.14.0

NPM version 8.5.2

Utilizado o Tailwinds.css para estilizacao dos componentes. Essa biblioteca utiliza HTML e CSS explicito. 

Utilizado o FETCH para se conectar com o backend.

Foi desenvolvida uma tela onde mostra os produtos disponiveis do ecommerce e uma tela onde pode incluir um produto com imagem. A ideia seria incluir uma funcionalidade para poder alterar os dados do produto. Porem, devido ao tempo despreendido para confeccao dos projetos  front , back e bd. Nao foi possivel.




## REFERÊNCIAS
 - Como construir uma API Spring Boot: https://www.oracle.com/br/technical-resources/articles/dsl/crud-rest-sb2-hibernate.html


## CURSOS

