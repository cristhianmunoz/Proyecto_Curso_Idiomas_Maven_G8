package ec.edu.epn.courses_Languagues;

import javax.swing.*;
import java.io.*;

public class List_Teachers {
    public boolean b,p,n;
    private Teacher teacher;
    private List_Teachers listTeachers;

    public List_Teachers() {
        this.teacher = teacher;
    }

    public boolean agregarProfesor (Teacher teacher){
    this.teacher = teacher;
        File file= new File(getPath());

        if(file.exists()){
            try {
                setEscribirEnArchivo(file, true);
                return true;
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Ha sucedido un error en List_Teachers");
            }
        }else {
            try {
                file.createNewFile();
                setEscribirEnArchivo(file, false);
                return true;
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Ha sucedido un error en List_Teachers");
            }
        }
        return false;
    }
    public boolean darDeBaja(Teacher teacher, Course[] course) throws NullPointerException{
        this.teacher = teacher;
        String line = "";
        File file= new File(getPathInactiveTeacher());
        checkFileInactiveTeachers(file);
        //checkRegisterTeacher(teacher);
        //VERIFICA QUE EL PROFESOR EXISTE EN LA LISTA
        try{
            BufferedReader br = new BufferedReader(new FileReader(getPath()));
            while((line= br.readLine()) !=null){
                if(line.indexOf(teacher.getApellidos())!= -1){
                    System.out.println("Se han encontrado registro del Profesor");
                    b=true;
                }else{
                    System.out.println("No se han encontrado registro del Profesor");
                    b=false;
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        //return b;
        //teacher.getEstado() = TRUE = disponible
        //!teacher.getEstado() = FALSE = no esta disponible
        if(!teacher.getEstado()){
            for(int i = 0; i< course.length-1; i++){

                try {
                    if(course[i].getProfesor().getId()== teacher.getId()){
                        System.out.println("Asignar un nuevo teacher al course "+ course[i]);
                        course[i].setProfesor(null);
                        p=true;
                    }else{
                        System.out.println("Profesor no encontrado en ningun curso");
                        p=false;
                    }

                }catch (NullPointerException e){
                    System.out.println("Fin");
                }

            }
        }
        editedFileTxt(getPath(), teacher.getApellidos());
        return p;
    }

    /*private boolean checkRegisterTeacher(Teacher teacher) {
        String line="";
        //VERIFICA QUE EL PROFESOR EXISTE EN LA LISTA
        try{
            BufferedReader br = new BufferedReader(new FileReader(getPath()));
            while((line= br.readLine()) !=null){
                if(line.indexOf(teacher.getApellidos())!= -1){
                    System.out.println("Se han encontrado registro del Profesor");
                    return true;
                }else{
                    System.out.println("No se ha encontrado registro del Profesor");
                    return false;
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return false;
    }*/

    private void checkFileInactiveTeachers(File file) {
        try{
            if(file.exists()){
                setEscribirEnArchivo(file, true);
            }else{
                file.createNewFile();
                setEscribirEnArchivo(file, true);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public boolean editedFileTxt(String path, String apellidos){
        String line = "";
        String sCadena="";
        try {
            //BUSCAR SI EXISTE UNA PALABRA
            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line= br.readLine()) !=null){
                if(line.indexOf(apellidos)!= -1){
                    sCadena += line.replaceAll(line,"");
                }else{
                    sCadena += line+"\n";
                }
            }
            FileWriter wr = new FileWriter(getPath());
            wr.write(sCadena);
            br.close();
            wr.close();
            n=true;
        }catch (IOException e){
            n=false;
            e.printStackTrace();
        }
        return n;
    }

    public void eliminarProfesor(Teacher teacher, Course[] courses, String path1, String path2){
        teacher = null;


    }
    private void setEscribirEnArchivo(File file, boolean b) throws IOException {
        FileWriter fw = new FileWriter(file,b);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw= new PrintWriter(bw);

        pw.println(this.teacher.toSave());
        pw.close();
        bw.close();
    }
    private String getPath(){
        return "List_Teachers.txt";
    }
    private String getPathInactiveTeacher(){
        return "InactiveTeachers.txt";
    }

    public Teacher getProfesor() {
        return teacher;
    }

    public void setProfesor(Teacher teacher) {
        this.teacher = teacher;
    }

    public boolean checkRegisterTeacher(Teacher  teacher) {
        String line="";
        //VERIFICA QUE EL PROFESOR EXISTE EN LA LISTA
        try{
            BufferedReader br = new BufferedReader(new FileReader(getPath()));
            while((line= br.readLine()) !=null){
                if(line.indexOf(teacher.getApellidos())!= -1){
                    System.out.println("Se han encontrado registro del Profesor");
                    b=true;
                }else{
                    System.out.println("No se han encontrado registro del Profesor");
                    b=false;
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return b;
    }
}
