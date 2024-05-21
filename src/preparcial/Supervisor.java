package preparcial;

public class Supervisor extends Persona{
    private double facturacionTotal;
    private int resultadoAuditoriaTiempos;

    public Supervisor() {
    }

    public Supervisor(String apellido, long DNI, String nombre, double facturacionTotal, int resultadoAuditoriaTiempos) {
        super(apellido, DNI, nombre);
        this.facturacionTotal = facturacionTotal;
        this.resultadoAuditoriaTiempos = resultadoAuditoriaTiempos;
    }
}
