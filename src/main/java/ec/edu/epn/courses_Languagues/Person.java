package ec.edu.epn.courses_Languagues;

public abstract class Person {
    private String nombre;
    private String apellidos;
    private int id;

    public Person(String nombre, String apellidos, int id){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.id=id;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", id=" + id +
                '}';
    }
}
