/*DROP DATABASE IF EXISTS dw_repaso;*/
create database dw_repaso;
use dw_repaso;

insert into grado values (1,'Primer Grado');
insert into grado values (2,'Segundo Grado');
insert into grado values (3,'Tercer Grado');
insert into grado values (4,'Cuarto Grado');
select * from grado;

insert into cursos values (1,'Matematica');
insert into cursos values (2,'Religion');
insert into cursos values (3,'Geometria');
insert into cursos values (4,'Algebra');
select * from cursos;

insert into salones values (1,'Salon 1');
insert into salones values (2,'Salon 2');
insert into salones values (3,'Salon 3');
insert into salones values (4,'Salon 4');
select * from salones;

insert into horario values (1,'Manaña');
insert into horario values (2,'Tarde');
select * from horario;


INSERT INTO alumno (id,nombre, paterno, materno, nacimiento,grado,salon)
VALUES 
(1,'Sandro', 'del Aguila', 'Cordova', '2002-12-23',1,2),
(2,'Sandro', 'del Aguila', 'Cordova', '2002-12-23',1,2);
select * from alumno;



INSERT INTO profesor (id,nombre, paterno, materno, nacimiento,cursos)
VALUES 
 (1,'Pablo', 'del Roble', 'Gomez', '1980-12-23',1),
 (2,'Sara', 'del Pino', 'Quiñones', '1950-11-13',2),
 (3,'Jose', 'Perez', 'Gomez', '1990-08-23',3);
select * from profesor;



insert inscripcion_alumnos values(1,2);
select * from inscripcion_alumnos;

insert cursos_horarios values(1,2);
select * from cursos_horarios;

insert inscripcion_profesores values(1,2);
select * from inscripcion_profesores;

INSERT INTO `usuario` (`user`, `email`, `password`) VALUES
('Miguel', 'miguel@gmail.com', '$2a$10$B0VhxKKRqQ6nUjCJolrzWOFRE6AdSzpmya8lhenwts4ga7Us2D2CO');
