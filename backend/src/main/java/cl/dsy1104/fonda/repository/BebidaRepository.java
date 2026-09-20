package cl.dsy1104.fonda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.dsy1104.fonda.model.Bebida;

public interface BebidaRepository extends JpaRepository<Bebida, Long> {

    // Spring Data genera la consulta a partir del nombre del metodo:
    // WHERE LOWER(nombre) LIKE LOWER('%texto%') ORDER BY id
    List<Bebida> findByNombreContainingIgnoreCaseOrderByIdAsc(String nombre);

    List<Bebida> findAllByOrderByIdAsc();
}
