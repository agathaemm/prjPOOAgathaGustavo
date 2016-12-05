create table tbfiscal (
cpf varchar(13),
nome varchar(40),
endereco varchar(100),
telefone varchar(15),
email varchar(40),
codigo varchar(15),
local varchar(100)
);

alter table tbfiscal add constraint pk_codigo primary key (codigo);

create table tbcandidato (
cpf varchar(13),
nome varchar(40),
endereco varchar(100),
telefone varchar(15),
email varchar(40),
inscricao varchar(15),
media float(5)
);

alter table tbcandidato add constraint pk_inscricao primary key (inscricao);
