
package com.eacj.bceapi.domain.repository;

import com.eacj.bceapi.domain.model.Estado;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long>{
    List<Estado> findAllByOrderByNomeAsc();
}
