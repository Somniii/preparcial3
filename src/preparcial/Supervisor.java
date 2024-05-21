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

    public static double calcularCostoTotalMensual(Recurso recurso, int cantidad){
        double costoTotal = 0;
        for (int i=0; i<cantidad; i++){
            costoTotal = (costoTotal + recurso.calculaCosto());
        }
    return costoTotal;
    }
/*
    public static void tiemposAltos(Recurso recurso){
        int totalEmergencia = 0;
        recurso
    }
    public static void supervisar(Usuario u){
        for(int u.getRecurso().length){

        }
    }
*/
}
