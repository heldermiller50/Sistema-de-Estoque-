USE estoque_db;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    
    username VARCHAR(50) NOT NULL,
    psw VARCHAR(255) NOT NULL,
    
    nameFirst VARCHAR(100),
    sobrenome VARCHAR(100),
    
    matricula VARCHAR(50),
    cpf VARCHAR(14),
    
    sexo VARCHAR(10),
    dtaNascimento DATE,
    
    email VARCHAR(150),
    telefone VARCHAR(20),
    
    funcao VARCHAR(100),
    
    cep VARCHAR(10),
    endereco VARCHAR(150),
    numero VARCHAR(10),
    bairro VARCHAR(100),
    cidade VARCHAR(100),
    estado VARCHAR(50),
    complemento VARCHAR(150),
    
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO users (
    username, psw, nameFirst, sobrenome, matricula, cpf,
    sexo, dtaNascimento, email, telefone, funcao,
    cep, endereco, numero, bairro, cidade, estado, complemento
) VALUES (
    'Helder Muller', '86898723', 'Helder', 'Nascimento', '0212522', 
    '86259789992', '2000-01-25', 'heldermiller50@gmail.com', 
    '71986898723', 'Estoquista', '41225170', 'Conjunto Dom Avelar', 
    'Salvador', 'Mata escura', 'Bahia', '53', 'Hotel Valeu'
);