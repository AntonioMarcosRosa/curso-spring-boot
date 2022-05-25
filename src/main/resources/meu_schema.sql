CREATE TABLE Cliente (
    cliente_id INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100)
);

CREATE TABLE Produto (
    produto_id INTEGER PRIMARY KEY AUTO_INCREMENT,
    descricao VARCHAR(100),
    preco NUMERIC(20,2)
);

CREATE TABLE Pedido (
    pedido_id INTEGER PRIMARY KEY AUTO_INCREMENT,
    cliente_id INTEGER REFERENCES Cliente (cliente_id),
    data_pedido TIMESTAMP,
    total NUMERIC(20,2)
);


CREATE TABLE Item_Pedido (
    item_pedido_id INTEGER PRIMARY KEY AUTO_INCREMENT,
    pedido_id INTEGER REFERENCES Pedido (pedido_id),
    produto_id INTEGER REFERENCES Produto (produto_id),
    quantide INTEGER
);





