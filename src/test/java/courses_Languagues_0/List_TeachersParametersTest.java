package courses_Languagues_0;

import ec.edu.epn.courses_Languagues.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith( value= Parameterized.class)
public class List_TeachersParametersTest {
    List_Teachers list = null;
    private Teacher teacher = null;
    private String path = null;

    @Before
    public void setUp(){list = new List_Teachers();}

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters(){
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{new Teacher("Juan","Perez",025), "List_Teachers.txt" });
        objects.add(new Object[]{new Teacher("Marcelo","Murillo",026), "List_Teachers.txt" });
        objects.add(new Object[]{new Teacher("Beto","Amaguana",027), "List_Teachers.txt" });
        objects.add(new Object[]{new Teacher("Marisol","Colcha",024), "List_Teachers.txt" });
        objects.add(new Object[]{new Teacher("Mary","Ramirez",023), "List_Teachers.txt" });
        objects.add(new Object[]{new Teacher("Lupe","Fernandez",030), "List_Teachers.txt" });
        return objects;
    }
    public List_TeachersParametersTest(Teacher teacher, String path){
        this.teacher=teacher;
        this.path=path;
    }
    @Test
    public void agregarProfesor() {
        assertTrue(list.agregarProfesor(teacher));
    }
}