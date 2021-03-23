CREATE DATABASE semana3 
default character set utf8
default collate utf8_general_ci;

use semana3;

CREATE TABLE usuario {
	id int NOT NULL auto_increment,
 	dataCadastro DateTime NOT NULL,
	nome varchar(30) NOT NULL,
	login varchar(15) NOT NULL,
	senha varchar(10) NOT NULL,
	telefone varchar(11),
	email varchar(100),
	perfil enum('A','O') NOT NULL,
	status enum('A','C') NOT NULL
	UNIQUE (login)
} DEFAULT CHARSET = utf8;

CREATE TABLE clientes {
	id int NOT NULL auto_increment,
 	dataCadastro DateTime NOT NULL,
	nome varchar(30) NOT NULL,
	cpfCnpj varchar(14) NOT NULL,
	logradouro varchar(50) NOT NULL,
	cidade varchar(40) NOT NULL,
	uf char(2) NOT NULL,
	cep char(2) NOT NULL,
	telefone varchar(11),
	email varchar(100),
	UNIQUE (id)
} DEFAULT CHARSET = utf8;

CREATE TABLE livro_caixa {
	id int NOT NULL auto_increment,
 	dataLancamento Date NOT NULL,
	descricao varchar(50) NOT NULL,
	tipo enum('D','C') NOT NULL,
	valor decimal(12,2) NOT NULL,
	UNIQUE (id)
} DEFAULT CHARSET = utf8;