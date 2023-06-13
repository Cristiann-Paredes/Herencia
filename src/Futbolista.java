public class Futbolista extends Persona{
    private String equipo;
    private String posicion;
    private int ncamiseta;
    private String representante;
    private int entrena;

    public Futbolista(int CI, String nombre, String apellido, String direccion, String telefono,String signo,
                      String equipo,String posicion,int ncamiseta,String representante, int entrena) {

        super(CI, nombre, apellido, direccion, telefono,signo);

        this.equipo=equipo;
        this.posicion=posicion;
        this.ncamiseta=ncamiseta;
        this.representante=representante;
        this.entrena=entrena;
    }

    public String getEquipo() {
        return equipo;
    }

    public int getEntrena() {
        return entrena;
    }

    public void setEntrena(int entrena) {
        this.entrena = entrena;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNcamiseta() {
        return ncamiseta;
    }

    public void setNcamiseta(int ncamiseta) {
        this.ncamiseta = ncamiseta;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }
    public void corre(){
        System.out.println("este es el metodo correr");
    }
}
