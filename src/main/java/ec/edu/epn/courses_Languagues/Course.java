package ec.edu.epn.courses_Languagues;

public class Course {
    private String id;
    private Teacher teacher;
    private String idioma;
    private String nivel;
    private String horario;
    private List_Students listStudents =new List_Students();

    public Course(String id, String idioma, String nivel, String horario ) {
        this.id=id;
        this.idioma=idioma;
        this.nivel=nivel;
        this.horario=horario;
    }

    public void setProfesor(Teacher teacher) {
        this.teacher = teacher;
    }

    public Teacher getProfesor() {
        return teacher;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getNivel() {
        return nivel;
    }

    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getId() {
        return id;
    }

    public void añadirListaEstudiante(Student student){
        this.listStudents.add_Student(student, getNameFile());
    }

    /*public void asignarProfesor (String teacher){
        //Instanciar la Lista de Profesores
        //List_Teachers profesores = new List_Teachers();
        String estado = "Disponible";
        String sCadena = "";
        int contador=0;
        try {
            FileReader fr = new FileReader("List_Teachers.txt");
            BufferedReader bf = new BufferedReader(fr);

            while ((sCadena = bf.readLine()) != null) {
                contador++;
                if (this.teacher.getNombre().equalsIgnoreCase(teacher)) {
                    if (sCadena.equalsIgnoreCase(estado)) {
                        //Reescribe la lista con estado=ocupado

                        //
                        //getProfesor().getNombre();
                        //return this.teacher;
                    } else {
                        System.out.println("Teacher no disponible");
                    }
                }else{
                    System.out.println("No existen registro del teacher");
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }*/
    public void asignarProfesor (boolean b){
        this.teacher.setEstado(b);
        System.out.println("Se ha cambiado el estado del teacher a No disponible");
    }

    public boolean verificarCupos(){
        //Enrollment generarMatriula = new Enrollment();
        String sCadena="";
        int cuposDisponibles = 0;
        int numeroEstudiantes = this.listStudents.get_Enrolled_Students(getNameFile());
        if(numeroEstudiantes < 25){
            cuposDisponibles = 25-numeroEstudiantes;
            System.out.println("Cupos Disponibles: "+cuposDisponibles);
            return true;
        }else{
            return false;
        }
    }

    public String getNameFile(){
        return getId()+"_"+"List_Students.txt";
    }

    public boolean asignarCurso(Enrollment enrollment) {

        if(verificarCupos()){
            añadirListaEstudiante(enrollment.getEstudiante());
            enrollment.generarComprobante(enrollment.getEstudiante(), enrollment.getCursoMatriculado());
            return true;
        }else{
            return false;
        }

    }

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", teacher=" + teacher +
                ", idioma='" + idioma + '\'' +
                ", nivel='" + nivel + '\'' +
                ", horario='" + horario + '\'' +
                '}';
    }
}
