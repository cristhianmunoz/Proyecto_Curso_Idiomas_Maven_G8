package ec.edu.epn.courses_Languagues;

public class Enrollment {

    private Student student;
    private Course courseMatriculado;

    public Enrollment(Student student, Course course) {
            this.student = student;
            this.courseMatriculado = course;
        if (course.asignarCurso(this)){
            System.out.println("Student matriculado con èxito");
        } else System.out.println("Course no Disponible");

    }

    public void generarComprobante(Student student, Course course){
            voucher generaCom = new voucher(student, course);
            generaCom.imprimirComprobante();
            generaCom.guardarComporbante();

    }

    public Course getCursoMatriculado() {
        return courseMatriculado;
    }

    public Student getEstudiante() {
        return student;
    }
}
