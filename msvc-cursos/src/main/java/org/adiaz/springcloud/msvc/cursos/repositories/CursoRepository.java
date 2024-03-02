package org.adiaz.springcloud.msvc.cursos.repositories;

import org.adiaz.springcloud.msvc.cursos.entity.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoRepository extends CrudRepository<Curso, Long> {
}
