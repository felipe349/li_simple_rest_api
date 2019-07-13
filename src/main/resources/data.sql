DROP TABLE IF EXISTS pessoa;

CREATE TABLE pessoa (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  nome VARCHAR(250) NOT NULL,
  cpf VARCHAR(250) NOT NULL,
  idade INTEGER(10) NOT NULL,
  sexo VARCHAR(250) NOT NULL
);

INSERT INTO pessoa (nome, cpf, idade, sexo) VALUES
  ('Felipe', '34946105840', '21', 'M'),
  ('Laerte', '00883088800', '60', 'M'),
  ('Marcia', '13455983109', '50', 'F')