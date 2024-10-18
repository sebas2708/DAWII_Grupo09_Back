package com.cibertec.repaso.Mappers;

import com.cibertec.repaso.DTO.Grado.GradoDTO;
import com.cibertec.repaso.Entidades.Grado;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-26T08:20:52-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21 (Oracle Corporation)"
)
public class GradoMapperImpl implements GradoMapper {

    @Override
    public GradoDTO deEntityADTO(Grado grado) {
        if ( grado == null ) {
            return null;
        }

        GradoDTO gradoDTO = new GradoDTO();

        gradoDTO.setId( grado.getId() );
        gradoDTO.setDescripcion( grado.getDescripcion() );

        return gradoDTO;
    }
}
