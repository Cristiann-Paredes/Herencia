public class Persona {
   private int CI;
    private String nombre;
    private String apellido;
    private String direccion;
    private  String telefono;
    private String signo;

public Persona(){
}
    public Persona(int CI, String nombre, String apellido, String direccion, String telefono,String signo) {
        this.CI = CI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.signo= signo;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void caminar(){
        System.out.println("Este es el método caminar");
    }

    public int trabajar(){return 0;}








}