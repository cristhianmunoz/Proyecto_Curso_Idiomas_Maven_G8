package ec.edu.epn.courses_Languagues;



public class Secretary extends Person {

    public Secretary(String nombre, String apellidos, int id) {
        super(nombre, apellidos, id);

    }

    public Student inscribirEstudiante(String nombres, String apellidos, int id) {
        Student alumno = new Student(nombres, apellidos, id);
        System.out.println("El estudiante fue registrado con èxito en el sistema\n" + "Datos personales del alumno son:");
        System.out.println(alumno.toString());

        return alumno;
    }

    public Teacher registrarProfesor(String nombres, String apellidos, int id) {
        Teacher teacher = new Teacher(nombres, apellidos, id);
        System.out.println("El teacher fue registrado con èxito en el sistema\n" + "Datos personales del teacher son:");
            List_Teachers lp = new List_Teachers();
            lp.agregarProfesor(teacher);
        System.out.println(teacher.toString());

        return teacher;
    }

    public void asignarProfesorACurso(Teacher teacher, Course course) {

        if (teacher.getEstado() == true && course.getProfesor() == null) {
            course.setProfesor(teacher);
            course.asignarProfesor(false);
            System.out.println("Porfesor Asignado con exito");
        }
        if (course.getProfesor() != null) {
            System.out.println("Ya existe teacher asignado a este course");
        } else {
            System.out.println("Teacher no disponible");
        }

    }

}
