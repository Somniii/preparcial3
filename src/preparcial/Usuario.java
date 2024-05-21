package preparcial;

public class Usuario extends Persona{
    private String obraSocial;
    private Recurso[] recurso;
    private double facturaUsuario;
    public Usuario(){

    }

    public Usuario(String apellido, long DNI, String nombre, String obraSocial, Recurso[] recurso, double facturaUsuario) {
        super(apellido, DNI, nombre);
        this.obraSocial = obraSocial;
        this.recurso = recurso;
        this.facturaUsuario = facturaUsuario;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }

    public Recurso[] getRecurso() {
        return recurso;
    }

    public void setRecurso(Recurso[] recurso) {
        this.recurso = recurso;
    }

    public double getFacturaUsuario() {
        return facturaUsuario;
    }

    public void setFacturaUsuario(double facturaUsuario) {
        this.facturaUsuario = facturaUsuario;
    }
    public String toString(){
        return  ("Nombre usuario: "+getNombre()+"\nApellido usuario: "+getApellido()+"\nDni usuario: "+getDNI()+"\nPosee obra social :"+getObraSocial()+"\n---------");
    }

}
