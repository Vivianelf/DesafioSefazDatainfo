-- Scripts para cria��o do projeto --

CREATE TABLE usuario (
   email VARCHAR(100) NOT NULL,
   nome VARCHAR(100) NOT NULL,
   senha VARCHAR(10) NOT NULL,
   PRIMARY KEY (email) 
);

CREATE TABLE telefone (
   id INTEGER IDENTITY PRIMARY KEY,
   ddd INTEGER NOT NULL,
   numero VARCHAR(100) NOT NULL,
   tipo VARCHAR(10 NOT NULL,
   email_usuario VARCHAR(100) NOT NULL
);

ALTER TABLE TELEFONE
ADD FOREIGN KEY (EMAIL_USUARIO) 
REFERENCES USUARIO(EMAIL);
