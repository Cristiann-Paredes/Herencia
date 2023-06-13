public class Doctor extends Persona{

    private String especialida;
    private int codigo;
    private String horario;
    private String hospital;
    private String anios;


    public Doctor(int CI, String nombre, String apellido, String direccion, String telefono,String signo,
                  String especialida, int codigo, String horario, String hospital,String anios) {

        super(CI, nombre, apellido, direccion, telefono,signo);

        this.especialida = especialida;
        this.codigo = codigo;
        this.horario = horario;
        this.hospital = hospital;
        this.anios= anios;
    }
    public String getEspecialida() {
        return especialida;
    }

    public String getAnios() {
        return anios;
    }

    public void setAnios(String anios) {
        this.anios = anios;
    }

    public void setEspecialida(String especialida) {
        this.especialida = especialida;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
    public void examinar(){
        System.out.println("este es el metodo examinar");
    }



}
