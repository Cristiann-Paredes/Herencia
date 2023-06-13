import java.lang.reflect.Array;
import java.util.ArrayList;

public class menu {
    public static void main(String[] args) {

        ArrayList<Estudiante>integrantes=new ArrayList<>();


        Persona miPersona=new Persona(213345567,"Cristian","Paredes","Pomasqui","0995307713","geminis","Persona");
        Estudiante cris=new Estudiante();
        Persona Pedro=new Persona();

        System.out.println(miPersona.getCI());
        System.out.println(Pedro.getCI());



        Doctor Ana=new Doctor(123,"Ana"," "," "," ","Leo","Doctora","general",21,"10am","espejo"
                ,"33 años");

        System.out.println(Ana.getNombre()+" es "+Ana.getClase());
        System.out.println("Tiene "+Ana.getAnios());
        System.out.println("Es de signo "+Ana.getSigno());
        Ana.examinar();

        System.out.println("                      ");
        EmpleadoPublico pablo=new EmpleadoPublico(32121,"Pablo"," ","","312213","leo","Empleado Publico","Sobrecargo",
                "Supervisor",132);

        System.out.println(pablo.getNombre()+" es "+pablo.getClase());
        System.out.println("Su telefono es "+pablo.getTelefono());
        pablo.tramitar();
        System.out.println("                      ");

        Futbolista mari=new Futbolista(231,"Maritza","","","","","Futbolista","","medio",6,
                " ",5);
        System.out.println(mari.getNombre()+" es "+mari.getClase());
        System.out.println("Entrena "+mari.getEntrena() + " horas diarias");
        mari.corre();
        System.out.println("                      ");

        Estudiante mela=new Estudiante(12231,"Melani","","pomasqui","09812398",
                "LEO","Estudiante",231,"3re","Estudiante","TSDS");

        System.out.println(mela.getNombre()+" es "+mela.getClase());
        System.out.println("Es de "+mela.getSemestre()+" semestre");
        mela.leer();

        integrantes.add(mela);
        integrantes.add(cris);



    }











}
