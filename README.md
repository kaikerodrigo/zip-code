Este projeto foi desenvolvido baseado no seguinte desafio técnico:
“1 - Expor um serviço de BUSCA DE CEP
    • Eu, como usuário, quero informar meu CEP e obter o nome da minha RUA, BAIRRO, CIDADE e ESTADO para preencher meus dados de cadastro de forma automática.
    • Os critérios de aceite dessa história são:
    • Dado um CEP válido, deve retornar o endereço correspondente
    • Dado um CEP válido, que não exista o endereço, deve substituir um dígito da direita para a esquerda por zero até que o endereço seja localizado (Exemplo: Dado 22333999 tentar com 22333990, 22333900 …)
    • Dado um CEP inválido, deve retornar uma mensagem reportando o erro: "CEP inválido"
    • O que se espera para as questões 1  - dicas e direcionamentos:
    • Os serviços devem receber e responder JSON;
    • Faça o uso de Mocks principalmente nos testes;
    • Os dados dos CEPs podem ser "Mocados";
    • Pense em como documentar os cenários desenvolvidos (Testes sempre são uma boa forma de documentar);
    • Ao finalizar o desenvolvimento você pode compartilhar o código pelo Github ou de outra maneira que preferir (como arquivo compactado). Se possível, em caso de arquivo compacto, envie o mesmo para um virtual drive e compartilha o link na prova;
    • Fique a vontade para entrar em contato e tirar dúvidas;
    • Juntamente com o Código, deve-se documentar a estratégia utilizada para a criação da aplicação, a arquitetura utilizada e os padrões. A documentação pode ser feita via GIT/Bitbucket ou adicionado no HackerRank. Isto faz parte da avaliação da prova.
    • Em caso de uso do Git/Bitbucket não esqueça de criar o .gitignore.” 

Com isso para o desenvolvimento da solução do desafio.
  * • A linguagem Java versão 11;
  * • A arquitetura utilizada para desenvolvimento foi baseado no MVC (Model-View-Controller);
  * • As bibliotecas utilizadas foram:
    * ◦ Bibliotecas do Spring boot:
        * ▪ spring-boot-configuration-processor;
        * ▪ spring-boot-devtools;
        * ▪ spring-boot-starter-data-jpa;
        * ▪ spring-boot-starter-security;
        * ▪ spring-boot-starter-validation;
        * ▪  spring-boot-starter-web;
    *◦ Bibliotecas para geração de código automático e builds:
        * ▪ lombok;	
        * ▪ mapstruct;
    *◦ Bibliotecas para configuração, utilização de banco de dados e validação:
         *▪ h2;
         *▪ mysql-connector-java;
         *▪ ojdbc8;
         *▪ postgresql;
            ▪ spring-boot-starter-data-jpa;
            ▪ spring-boot-starter-validation;
        ◦ Segurança/autenticação:
            ▪ jwt;
        ◦ Para documentação da api:
            ▪ springfox-boot-starter (swagger);
        ◦ Para testes e geração de objetos mock:
            ▪ junit-jupiter-api;
            ▪ junit-jupiter-engine;
            ▪ junit-vintage-engine;
            ▪ mockito-core;
            ▪ mockito-inline;
            ▪ mockito-junit-jupiter;
Para acessar a documentação da API do projeto depois que estiver em execução é necessário digitar o <IP>:<PORT>/swagger/index.html. Exemplo: http://localhost:8080/swagger-ui/index.html#/
Para realizar alguns testes o projeto já vem com uma lista de código de endereçamento postal pré-cadastrado, confira os mesmo na classe chamada PopulateGenericDataBase.
