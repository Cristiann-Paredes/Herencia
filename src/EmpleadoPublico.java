public class EmpleadoPublico extends Persona {
    private String puesto;
    private String cargo;
    private int rmu;

    public EmpleadoPublico(int CI, String nombre, String apellido, String direccion, String telefono,String signo,
                           String puesto,String cargo,int rmu) {

        super(CI, nombre, apellido, direccion, telefono,signo);

        this.puesto=puesto;
        this.cargo=cargo;
        this.rmu=rmu;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getRmu() {
        return rmu;
    }

    public void setRmu(int rmu) {
        this.rmu = rmu;
    }

    public void tramitar(){
        System.out.println("este es el metodo tramitar");
    }
}
