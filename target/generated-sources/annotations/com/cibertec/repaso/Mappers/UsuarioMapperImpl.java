package com.cibertec.repaso.Mappers;

import com.cibertec.repaso.DTO.Usuario.UsuarioCreateDTO;
import com.cibertec.repaso.DTO.Usuario.UsuarioDTO;
import com.cibertec.repaso.Entidades.Usuario;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-26T08:20:55-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21 (Oracle Corporation)"
)
public class UsuarioMapperImpl implements UsuarioMapper {

    @Override
    public Usuario crearUsuario(UsuarioCreateDTO usuarioCreateDTO) {
        if ( usuarioCreateDTO == null ) {
            return null;
        }

        Usuario usuario = new Usuario();

        return usuario;
    }

    @Override
    public Usuario deEntityADTO(UsuarioDTO usuarioDTO) {
        if ( usuarioDTO == null ) {
            return null;
        }

        Usuario usuario = new Usuario();

        usuario.setId( usuarioDTO.getId() );
        usuario.setNombre( usuarioDTO.getNombre() );
        usuario.setContraseña( usuarioDTO.getContraseña() );

        return usuario;
    }
}
