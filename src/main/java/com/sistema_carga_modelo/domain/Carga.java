package com.sistema_carga_modelo.domain;

import com.sistema_carga_modelo.model.Status;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Carga {
  private Long id;
  private String tipo;
  private double peso;
  private Status status;
  private String destino;
}