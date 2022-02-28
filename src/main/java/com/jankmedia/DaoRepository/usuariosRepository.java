package com.jankmedia.DaoRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jankmedia.ModeloEntidad.usuarios;

@Repository
public interface usuariosRepository extends JpaRepository<usuarios, Integer>{

}
