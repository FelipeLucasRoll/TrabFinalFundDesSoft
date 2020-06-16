Fundamentos de Desenvolvimento de Software, turma 168


Técnicas de Programação, turma 128


Prof. Bernardo Copstein

Trabalho Final


Objetivo

O objetivo deste trabalho é avaliar a capacidade dos alunos em aplicar os conceitos apresentados ao longo do semestre a saber: sistemas de gerência de configuração, sistemas de automação da compilação, desenvolvimento de software em equipe, teste unitário, padrões de projeto e arquitetura de software (em especial arquitetura CLEAN). Para tanto os estudantes, organizados em grupos, deverão desenvolver um sistema conforme com as características descritas neste documento. Neste sistema deverão evidenciar sua capacidade de desenvolvimento em equipe e de aplicação dos conceitos apresentados. Serão avaliados tanto os artefatos entregues pelo Moodle como a apresentação do sistema feita através do software Zoom em horário a ser agendado com o professor. O tema do trabalho é livre desde que atenda aos requisitos não funcionais apresentados a seguir. O tema do trabalho, entretanto, deverá ser apresentado e aprovado pelo professor até a data definida no cronograma.


Requisitos


Deverá ser desenvolvido um sistema Web de tema livre. Entretanto o sistema deverá atender aos seguintes requisitos não funcionais:


•	Ser composto por dois módulos: um módulo cliente (front-end) e um módulo servidor (back-end). Para efeitos de demonstração os dois módulos podem executar em um único equipamento (localhost) porém será valorizado caso o sistema seja instalado em um servidor remoto e puder ser acessado pela WEB.


•	O módulo cliente deve ser “magro”, isto é, deve-se restringir aos seguintes aspectos: apresentação da interface do usuário, tratamento dos eventos de usuário e coleta de informações nos componentes de interface, solicitação de serviços para o “backend” enviando os parâmetros informados pelo usuário, exibição de resultados e gestão do fluxo de telas. Todas as operações relativas à lógica da aplicação deverão ser executadas no “backend”.


•	O módulo servidor deverá ser construído segundo os preceitos da arquitetura CLEAN. O nível de “Entidades” deverá conter pelo menos 3 entidades distintas;  o nível de casos de uso deverá explorar o padrão fachada e conter pelo menos duas políticas distintas; o nível de interface deverá abrigar a classe responsável por expor os “endpoints” e as responsáveis por abrigar os mecanismos de persistência se houverem.


•	Padrões de projeto deverão ser explorados de maneira a garantir os princípios SOLID. É necessário justificar de que maneira cada um dos princípios foi garantido. Independente disso é obrigatório explorar, pelo menos, os seguintes padrões de projeto: “fachada”, “strategy”, “builder” e injeção de dependências. 


•	Devem ser gerados drivers de teste para todas as classes dos níveis de entidade e casos de uso. As exceções são as classes do tipo “DTO” para as quais não é necessário gerar driver de teste. Os drivers de teste devem garantir pelo menos 100% de cobertura de linhas e de cobertura de condição de cada uma das classes. Tal condição deve poder ser comprovada pelos relatórios do Code Coverage ou equivalente (o uso de um framework de teste unitário e de uma ferramenta de análise de cobertura de código são obrigatórios). Pelo menos um driver de teste deve explorar testes parametrizados.


•	O sistema deve ser desenvolvido em grupo com auxílio dos softwares Git e GitHub. Deverá ser possível demonstrar, durante a apresentação, que todos os integrantes do grupo foram capazes de criar seus próprios “branches” em submeter atualizações no “branch master”. Será avaliado se todos os integrantes do grupo tiveram as tarefas igualmente distribuídas. 

Cronograma de entregas


Os entregáveis que não correspondem a código fonte devem ser armazenados em uma pasta chamada “OutrosEntregaveis” a ser criada na raiz do projeto no “GitHub”. Para as apresentações intermediárias é necessária a presença de apenas um dos integrantes do grupo no momento síncrono. Na data da apresentação final todos os integrantes devem estar “presentes”. Caso algum grupo perca alguma entrega/apresentação intermediária deverá contatar o professor para agendar horário alternativo. Os atrasos terão impacto na avaliação final.


Data	Entrega


04/06	Entrega do link do projeto no GitHub. Deverá ser encaminhado por email. Acompanhe se o email foi recebido na Wiki de acompanhamento dos trabalhos no Moodle)


09/06	Definição do tema do trabalho. Deve ser entregue um arquivo contendo a especificação de requisitos do sistema de será desenvolvido. Esta especificação deverá conter os objetivos do sistema, a relação de funcionalidades e “mocks” das telas. A definição do trabalho deverá ser armazenada no projeto do GitHub, enviada por email e apresentada na aula do dia 09/07. A aprovação ou não do tema do trabalho ficará registrada na Wiki de acompanhamento dos trabalhos no Moodle.


16/06	Entrega do diagrama de classes e pacotes demonstrando a arquitetura do sistema. O diagrama deverá ser encaminhado por email e apresentado na aula. A aprovação do diagrama ficará registrada na Wiki de acompanhamento dos trabalhos no Moodle.


23/06	Entrega das classes do nível de entidades com os respectivos drivers de teste. As classes deverão estar disponíveis no GitHub do projeto e deverão ser apresentadas em aula. Um email de notificação deve ser enviado tão logo as classes estejam disponíveis. O acompanhamento ficará registrado na Wiki de acompanhamento dos trabalhos no Moodle.


25/06	Entrega de documento explicitando as tecnologias a serem usadas na aplicação cliente e na aplicação servidora. O documento deverá ser encaminhado por email e apresentado em aula para o professor. A aprovação das tecnologias ficará registrada na Wiki de acompanhamento dos trabalhos no Moodle.


02/07	Entrega final do trabalho e apresentação do projeto durante a aula.


07/07	Apresentação do projeto para aqueles em que não houve tempo hábil na aula do dia 02





