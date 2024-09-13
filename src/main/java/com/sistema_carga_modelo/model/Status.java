package com.sistema_carga_modelo.model;

public enum Status {
    ANDAMENTO("Em Andamento"),
    PENDENTE("Pendente"),
    ENTREGUE("Entregue"),
    INDEFINIDO(null);

    private String status;

    Status(String status){
        this.status = status;
    }

}
