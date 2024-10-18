package com.cibertec.repaso.Mappers;

import com.cibertec.repaso.DTO.Alumno.AlumnoCreateDTO;
import com.cibertec.repaso.DTO.Alumno.AlumnoDTO;
import com.cibertec.repaso.DTO.Alumno.AlumnoUpdateDTO;
import com.cibertec.repaso.DTO.Cursos.CursosCreateDTO;
import com.cibertec.repaso.DTO.Cursos.CursosDTO;
import com.cibertec.repaso.DTO.Cursos.CursosUpdateDTO;
import com.cibertec.repaso.DTO.Grado.GradoCreateDTO;
import com.cibertec.repaso.DTO.Grado.GradoDTO;
import com.cibertec.repaso.DTO.Grado.GradoUpdateDTO;
import com.cibertec.repaso.DTO.Usuario.UsuarioCreateDTO;
import com.cibertec.repaso.DTO.Usuario.UsuarioDTO;
import com.cibertec.repaso.Entidades.Alumno;
import com.cibertec.repaso.Entidades.Cursos;
import com.cibertec.repaso.Entidades.Grado;
import com.cibertec.repaso.Entidades.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-26T08:20:54-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21 (Oracle Corporation)"
)
public class AlumnoMapperImpl implements AlumnoMapper {

    @Override
    public AlumnoDTO entityADTO(Alumno alumno) {
        if ( alumno == null ) {
            return null;
        }

        AlumnoDTO alumnoDTO = new AlumnoDTO();

        alumnoDTO.setGradoDTO( gradoToGradoDTO( alumno.getGrado() ) );
        alumnoDTO.setCursosDTO( cursosListToCursosDTOList( alumno.getCursos() ) );
        alumnoDTO.setUsuarioDTO( alumnoToUsuarioDTO( alumno ) );
        alumnoDTO.setId( alumno.getId() );
        alumnoDTO.setNombre( alumno.getNombre() );
        alumnoDTO.setPaterno( alumno.getPaterno() );
        alumnoDTO.setMaterno( alumno.getMaterno() );
        alumnoDTO.setNacimiento( alumno.getNacimiento() );

        return alumnoDTO;
    }

    @Override
    public Alumno DTOAAlumno(AlumnoDTO alumnoDTO) {
        if ( alumnoDTO == null ) {
            return null;
        }

        Alumno alumno = new Alumno();

        alumno.setId( alumnoDTO.getId() );
        alumno.setNombre( alumnoDTO.getNombre() );
        alumno.setPaterno( alumnoDTO.getPaterno() );
        alumno.setMaterno( alumnoDTO.getMaterno() );
        alumno.setNacimiento( alumnoDTO.getNacimiento() );

        return alumno;
    }

    @Override
    public List<AlumnoDTO> listadoAlumno(List<Alumno> lista) {
        if ( lista == null ) {
            return null;
        }

        List<AlumnoDTO> list = new ArrayList<AlumnoDTO>( lista.size() );
        for ( Alumno alumno : lista ) {
            list.add( entityADTO( alumno ) );
        }

        return list;
    }

    @Override
    public Alumno crearAlumno(AlumnoCreateDTO alumnoCreat) {
        if ( alumnoCreat == null ) {
            return null;
        }

        Alumno alumno = new Alumno();

        alumno.setGrado( gradoCreateDTOToGrado( alumnoCreat.getGradoCreateDTO() ) );
        alumno.setCursos( cursosCreateDTOListToCursosList( alumnoCreat.getCursosCreateDTO() ) );
        alumno.setUsuario( usuarioCreateDTOToUsuario( alumnoCreat.getUsuarioCreateDTO() ) );
        alumno.setNombre( alumnoCreat.getNombre() );
        alumno.setPaterno( alumnoCreat.getPaterno() );
        alumno.setMaterno( alumnoCreat.getMaterno() );
        alumno.setNacimiento( alumnoCreat.getNacimiento() );

        return alumno;
    }

    @Override
    public Alumno actualizarAlumno(AlumnoUpdateDTO alumnoUpdate) {
        if ( alumnoUpdate == null ) {
            return null;
        }

        Alumno alumno = new Alumno();

        alumno.setGrado( gradoUpdateDTOToGrado( alumnoUpdate.getGradoUpdateDTO() ) );
        alumno.setCursos( cursosUpdateDTOListToCursosList( alumnoUpdate.getCursosUpdateDTO() ) );
        alumno.setId( alumnoUpdate.getId() );
        alumno.setNombre( alumnoUpdate.getNombre() );
        alumno.setPaterno( alumnoUpdate.getPaterno() );
        alumno.setMaterno( alumnoUpdate.getMaterno() );
        alumno.setNacimiento( alumnoUpdate.getNacimiento() );

        return alumno;
    }

    protected GradoDTO gradoToGradoDTO(Grado grado) {
        if ( grado == null ) {
            return null;
        }

        GradoDTO gradoDTO = new GradoDTO();

        gradoDTO.setId( grado.getId() );
        gradoDTO.setDescripcion( grado.getDescripcion() );

        return gradoDTO;
    }

    protected CursosDTO cursosToCursosDTO(Cursos cursos) {
        if ( cursos == null ) {
            return null;
        }

        CursosDTO cursosDTO = new CursosDTO();

        cursosDTO.setId( cursos.getId() );
        cursosDTO.setDescripcion( cursos.getDescripcion() );

        return cursosDTO;
    }

    protected List<CursosDTO> cursosListToCursosDTOList(List<Cursos> list) {
        if ( list == null ) {
            return null;
        }

        List<CursosDTO> list1 = new ArrayList<CursosDTO>( list.size() );
        for ( Cursos cursos : list ) {
            list1.add( cursosToCursosDTO( cursos ) );
        }

        return list1;
    }

    protected UsuarioDTO alumnoToUsuarioDTO(Alumno alumno) {
        if ( alumno == null ) {
            return null;
        }

        UsuarioDTO usuarioDTO = new UsuarioDTO();

        usuarioDTO.setId( alumno.getId() );
        usuarioDTO.setNombre( alumno.getNombre() );

        return usuarioDTO;
    }

    protected Grado gradoCreateDTOToGrado(GradoCreateDTO gradoCreateDTO) {
        if ( gradoCreateDTO == null ) {
            return null;
        }

        Grado grado = new Grado();

        grado.setId( gradoCreateDTO.getId() );

        return grado;
    }

    protected Cursos cursosCreateDTOToCursos(CursosCreateDTO cursosCreateDTO) {
        if ( cursosCreateDTO == null ) {
            return null;
        }

        Cursos cursos = new Cursos();

        cursos.setId( cursosCreateDTO.getId() );

        return cursos;
    }

    protected List<Cursos> cursosCreateDTOListToCursosList(List<CursosCreateDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Cursos> list1 = new ArrayList<Cursos>( list.size() );
        for ( CursosCreateDTO cursosCreateDTO : list ) {
            list1.add( cursosCreateDTOToCursos( cursosCreateDTO ) );
        }

        return list1;
    }

    protected Usuario usuarioCreateDTOToUsuario(UsuarioCreateDTO usuarioCreateDTO) {
        if ( usuarioCreateDTO == null ) {
            return null;
        }

        Usuario usuario = new Usuario();

        return usuario;
    }

    protected Grado gradoUpdateDTOToGrado(GradoUpdateDTO gradoUpdateDTO) {
        if ( gradoUpdateDTO == null ) {
            return null;
        }

        Grado grado = new Grado();

        grado.setId( gradoUpdateDTO.getId() );
        grado.setDescripcion( gradoUpdateDTO.getDescripcion() );

        return grado;
    }

    protected Cursos cursosUpdateDTOToCursos(CursosUpdateDTO cursosUpdateDTO) {
        if ( cursosUpdateDTO == null ) {
            return null;
        }

        Cursos cursos = new Cursos();

        cursos.setId( cursosUpdateDTO.getId() );
        cursos.setDescripcion( cursosUpdateDTO.getDescripcion() );

        return cursos;
    }

    protected List<Cursos> cursosUpdateDTOListToCursosList(List<CursosUpdateDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Cursos> list1 = new ArrayList<Cursos>( list.size() );
        for ( CursosUpdateDTO cursosUpdateDTO : list ) {
            list1.add( cursosUpdateDTOToCursos( cursosUpdateDTO ) );
        }

        return list1;
    }
}
