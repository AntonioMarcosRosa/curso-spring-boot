package com.github.antoniomarcosrosa.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer clienteId;

    @Column(name = "nome", length = 100)
    private String nome;

    @OneToMany(mappedBy = "cliente")
    private Set<Pedido> pedidos;

    public Cliente() {}

    public Cliente(Integer clienteId, String nome) {
        this.clienteId = clienteId;
        this.nome = nome;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public String toString() {
        return "Cliente {" +
                "id: " + clienteId +
                ", nome: " + nome +
                "}";
    }
}
