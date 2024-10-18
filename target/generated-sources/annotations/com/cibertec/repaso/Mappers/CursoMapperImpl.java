package com.cibertec.repaso.Mappers;

import com.cibertec.repaso.DTO.Alumno.AlumnoDTO;
import com.cibertec.repaso.DTO.Cursos.CursosCreateDTO;
import com.cibertec.repaso.DTO.Cursos.CursosDTO;
import com.cibertec.repaso.DTO.Cursos.CursosUpdateDTO;
import com.cibertec.repaso.Entidades.Alumno;
import com.cibertec.repaso.Entidades.Cursos;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-26T08:20:53-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21 (Oracle Corporation)"
)
public class CursoMapperImpl implements CursoMapper {

    @Override
    public List<CursosDTO> listadoCursos(List<Cursos> listado) {
        if ( listado == null ) {
            return null;
        }

        List<CursosDTO> list = new ArrayList<CursosDTO>( listado.size() );
        for ( Cursos cursos : listado ) {
            list.add( deDTOAEntity( cursos ) );
        }

        return list;
    }

    @Override
    public CursosDTO deDTOAEntity(Cursos cursos) {
        if ( cursos == null ) {
            return null;
        }

        CursosDTO cursosDTO = new CursosDTO();

        cursosDTO.setAlumnosDTO( alumnoListToAlumnoDTOList( cursos.getAlumnos() ) );
        cursosDTO.setId( cursos.getId() );
        cursosDTO.setDescripcion( cursos.getDescripcion() );

        return cursosDTO;
    }

    @Override
    public Cursos crearCursos(CursosCreateDTO cursosCreateDTO) {
        if ( cursosCreateDTO == null ) {
            return null;
        }

        Cursos cursos = new Cursos();

        cursos.setId( cursosCreateDTO.getId() );

        return cursos;
    }

    @Override
    public Cursos actualizarCursos(CursosUpdateDTO cursosUpdateDTO) {
        if ( cursosUpdateDTO == null ) {
            return null;
        }

        Cursos cursos = new Cursos();

        cursos.setId( cursosUpdateDTO.getId() );
        cursos.setDescripcion( cursosUpdateDTO.getDescripcion() );

        return cursos;
    }

    protected List<AlumnoDTO> alumnoListToAlumnoDTOList(List<Alumno> list) {
        if ( list == null ) {
            return null;
        }

        List<AlumnoDTO> list1 = new ArrayList<AlumnoDTO>( list.size() );
        for ( Alumno alumno : list ) {
            list1.add( mapAlumnosGrado( alumno ) );
        }

        return list1;
    }
}
