public class menu {
    public static void main(String[] args) {
        Persona miPersona=new Persona(213345567,"Cristian","Paredes","Pomasqui","0995307713","geminis");


        Persona Pedro=new Persona();



        System.out.println(miPersona.getCI());
        System.out.println(Pedro.getCI());

        Estudiante Cris=new Estudiante(12231,"cristian","paredes","pomasqui","09812398",
                "LEO",3243,"tercero","TSDS","tsdl");

        Doctor Ana=new Doctor(132132,"Ana","paez","pomasqui","324243","Leo","Doctora ",432342,
                "8 am a 10pm","Espejo","33 años");

        System.out.println(Ana.getNombre()+" es "+Ana.getEspecialida());
        System.out.println("Tiene "+Ana.getAnios());
        System.out.println("Es de signo "+Ana.getSigno());
        Ana.examinar();

        System.out.println("                      ");
        EmpleadoPublico pablo=new EmpleadoPublico(321321,"Pablo","lopez","calderon","231412","geminis",
                "Empleado Publico","Trabajador",450);

        System.out.println(pablo.getNombre()+" es "+pablo.getPuesto());
        System.out.println("Su telefono es "+pablo.getTelefono());
        pablo.tramitar();
        System.out.println("                      ");









    }











}
