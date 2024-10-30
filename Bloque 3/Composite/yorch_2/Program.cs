Grupo grupo = new Grupo("LIS 501");
Alumno alumno1 = new Alumno("Alexis","s22017012");
Alumno alumno2 = new Alumno("Ricardo","s22017010");
Alumno alumno3 = new Alumno("Sebastian","s22017007");

Materia materia1 = new Materia("Redes");
Materia materia2 = new Materia("Bases de Datos");
Materia materia3 = new Materia("Intro a la Programacion");
Materia materia4 = new Materia("Mates Discretas");

grupo.agregarAlumno(alumno1);
grupo.agregarAlumno(alumno2);
grupo.agregarAlumno(alumno3);

alumno1.agregarMateria(materia1,5);
alumno1.agregarMateria(materia2,6);
alumno1.agregarMateria(materia3,8);
alumno1.agregarMateria(materia4,10);

alumno2.agregarMateria(materia1,5);
alumno2.agregarMateria(materia2,8);
alumno2.agregarMateria(materia3,3);
alumno2.agregarMateria(materia4,8);


alumno3.agregarMateria(materia1,10);
alumno3.agregarMateria(materia2,10);
alumno3.agregarMateria(materia3,10);
alumno3.agregarMateria(materia4,10);

Console.WriteLine(grupo.getPromedio());