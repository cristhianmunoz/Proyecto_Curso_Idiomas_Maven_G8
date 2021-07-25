package ec.edu.epn.courses_Languagues;

public class Student extends Person {

    public Student(String nombre, String apellidos, int id){
        super(nombre,apellidos,id);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public String toSave(){
        return getId()+";"+getNombre()+";"+getApellidos()+";";
    }
}
