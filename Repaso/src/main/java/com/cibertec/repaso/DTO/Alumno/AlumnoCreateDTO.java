package com.cibertec.repaso.DTO.Alumno;

import com.cibertec.repaso.DTO.Cursos.CursosCreateDTO;
import com.cibertec.repaso.DTO.Grado.GradoCreateDTO;
import com.cibertec.repaso.DTO.Salon.SalonDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class AlumnoCreateDTO {

    private String Nombre;

    private String Paterno;

    private String Materno;

    private Date Nacimiento;

    private GradoCreateDTO gradoDTO;

    private List<CursosCreateDTO> cursosDTO;

    private SalonDTO salonDTO;

}
