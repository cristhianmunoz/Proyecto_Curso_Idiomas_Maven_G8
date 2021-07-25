package courses_Languagues_0;

import ec.edu.epn.courses_Languagues.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class List_TeachersTest {
    public List_Teachers lt;
    public Teacher t,t1;
    public Secretary s;
    public Course c[];
    boolean expected;

    @Before
    public void setUp() {
        t = new Teacher("Sofia","Alvarez Torres",104);
        t1 = new Teacher("Axel","Lopez Torres",105);
        lt = new List_Teachers();
         s = new Secretary("Maria","Dolores",123);
        c = new Course[1];
        c[0] = new Course("1", "Inglès","Academico 1","4pm-6pm");
        System.out.println("prueba");
        this.expected = false;
    }

    @Test
    public void given_teacher_when_checkRegisterTeacher_then_true() {
        //boolean expected = true;
        boolean actual = lt.checkRegisterTeacher(new Teacher("Andrea","Cachipuendo Catucuamba", 103));
        assertEquals(expected,actual);
    }

    @Test
    public void given_teacher_when_checkRegisterTeacher_then_false() {

        boolean actual = lt.checkRegisterTeacher(new Teacher("Rosa","Perugachi Amaguana", 103));

        assertEquals(expected,actual);
    }
    @Test
    public void given_teacher_course_when_darDeBja_then_error() {

        lt.agregarProfesor(t);
        t.setEstado(false);
        Course c[] = new Course[1];
        c[0] = new Course("2", "Fraces","Academico 1","6pm-8pm");


        s.asignarProfesorACurso(t1,c[0]);

        boolean actual = lt.darDeBaja(t,c);
        assertEquals(expected,actual);
    }
    @Test
    public void given_teacher_course_when_darDeBja_then_ok() {
        lt.agregarProfesor(t);
        s.asignarProfesorACurso(t,c[0]);

        this.expected = false;
        boolean actual = lt.darDeBaja(t,c);
        assertEquals(expected,actual);
    }


}