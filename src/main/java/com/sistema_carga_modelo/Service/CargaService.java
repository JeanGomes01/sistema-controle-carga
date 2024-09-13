package com.sistema_carga_modelo.Service;

import com.sistema_carga_modelo.domain.Carga;
import com.sistema_carga_modelo.model.Status;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class CargaService {


    private static List<Carga> cargas;


    static {
       cargas = new ArrayList<>(List.of(new Carga(1L,"Carga1",100.0, Status.ANDAMENTO,"Rio de Janeiro"), new Carga(2L,"Carga2",80,Status.PENDENTE,"São Paulo")));
    }
    public List<Carga> listAll() {
    return cargas;
    }



    public Carga save(Carga carga) {


    carga.setId(ThreadLocalRandom.current().nextLong(3,10000000));
    cargas.add(carga);
    return carga;
    }
}
