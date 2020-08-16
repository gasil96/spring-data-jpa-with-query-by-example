INSERT INTO CARGO (ID_CARGO, NOME, SETOR, SALARIO_INICIAL, DATA_REGISTRO, IP_OPERADOR, DATA_MODIFICACAO) VALUES
  (1, 'Desenvolvedor', 'Tecnologia', 1800.00, 	'1996-11-11', '10.1.6.199', now()),
  (2, 'Treinee', 'Tecnologia', 1000.00, now(), '10.1.6.199', now()),
  (3, 'Analista de Requisitos', 'Tecnologia', 4000.00, now(), '10.1.6.199', now()),
  (4, 'Analista de Infraestrutura', 'Tecnologia', 4000.00, now(), '10.1.6.199', now()),
  (5, 'Suporte Técnico I', 'Tecnologia', 1200.00, now(), '10.1.6.199', now()),
  (6, 'Suporte Técnico II', 'Tecnologia', 1200.00, now(), '10.1.6.199', now()),
  (7, 'Gerente de Projeto', 'Tecnologia', 7800.00, now(), '10.1.6.199', now()),
  (8, 'Gerente Geral', null, 10000.00, now(), '10.1.6.199', now()),
  (9, 'Estagiário', null, 545.00, now(), '10.1.6.199', now());

INSERT INTO FUNCIONARIO (ID_FUNCIONARIO, ID_FISCAL, MATRICULA, NOME_COMPLETO, DATA_NASCIMENTO, DATA_INICIO, DATA_FIM,
SALARIO_BASE, DATA_REGISTRO, IP_OPERADOR, DATA_MODIFICACAO, ID_CARGO_FK) VALUES
  (1, '83464308090', '14882', 'Gabriel da Silva da Silva', '1996-11-11', '2019-03-01',
   null, 2500.00, '2019-02-21', '10.1.6.199', now(), 3),
  (2, '49616251082', '7474', 'Gilvan Souza Santos Filho', '1985-03-05', '2017-02-01',
   null, 8500.00, '2017-01-28', '10.1.6.199', now(), 1),
  (3, '31830726021', '3008', 'Rafael Ponte', '1996-11-11', '2019-12-01',
   null, 2500.00, '2019-11-21', '10.1.6.199', now(), 1),
  (4, '83133514032', '51785', 'Caroline Alves', '1994-06-4', '2020-01-01',
   null, 2500.00, '2019-12-16', '10.1.6.199', now(), 1),
  (5, '23418009042', '9756', 'Yuri Matheus', '1986-03-22', '2019-11-01',
   null, 2500.00, '2019-10-21', '10.1.6.199', now(), 1),
  (6, '36860867000', '14870', 'Victor Hugo', '1981-02-2', '2019-09-01',
   null, 2500.00, '2019-08-30', '10.1.6.199', now(), 1),
  (7, '74345719003', '1520', 'Alberto Souza', '1987-02-11', '2015-07-01',
   null, 12500.00, '2015-06-25', '10.1.6.199', now(), 8),
  (8, '61744079005', '9791', 'Claudio Oliveira', '1990-01-30', '2015-03-01',
   null, 12500.00, '2015-02-25', '10.1.6.199', now(), 8),
  (9, '61744079005', '9791', 'André Luiz de Guzmão', '1990-01-30', '2015-03-01',
   null, 8500.00, '2015-02-25', '10.1.6.199', now(), 1);

INSERT INTO FUNCAO (ID_FUNCAO, NOME, DESCRICAO, DATA_REGISTRO, IP_OPERADOR, DATA_MODIFICACAO, ID_CARGO_FK) VALUES
  (1, 'Programar', 'Desenvolver Softwares', now(), '10.1.6.199', now(), 1),
  (2, 'Auxiliar', 'Auxiliar em todos os pontos', now(), '10.1.6.199', now(), 2),
  (3, 'Levantar Requisitos', 'Análisar o négocio', now(), '10.1.6.199', now(), 3),
  (4, 'Operar Infraestrutura', 'Gerenciar Intranet da empresa', now(), '10.1.6.199', now(), 4),
  (5, 'Suporte ao Usuário', 'Formartar e prestar manutenção á máquinas', now(), '10.1.6.199', now(), 5),
  (6, 'Monitoramente de Máquinas', 'Prevenir erros nas máquinas', now(), '10.1.6.199', now(), 6),
  (7, 'Gerenciar Projetos', 'Gerir todos os coordenadores e gerentes de projeto',now(), '10.1.6.199', now(), 7),
  (8, 'Gerenciar Gerentes', 'Atuar como gestor geral de todos setores', now(), '10.1.6.199', now(), 8),
  (9, 'Aprender', 'Ajudar práticando e ganhando conhecimento na area que esta', now(), '10.1.6.199', now(), 9);

