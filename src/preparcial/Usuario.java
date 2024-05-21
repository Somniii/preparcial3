package preparcial;

public class Usuario extends Persona{
    private String obraSocial;
    private double facturaUsuario;
    private Recurso[] recurso;

    public Usuario() {
    }

    public double getFacturaUsuario() {
        return facturaUsuario;
    }

    public void setFacturaUsuario(double facturaUsuario) {
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

    public Usuario(String apellido, long DNI, String nombre, double facturaUsuario, String obraSocial, Recurso[] recurso) {
        super(apellido, DNI, nombre);
        this.facturaUsuario = facturaUsuario;
        this.obraSocial = obraSocial;
        this.recurso = recurso;
    }
}
