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

    public double calcularCostoTotalMensual(Recurso recurso, int cantidad){
        double costoTotal = 0;
        for (int i=0; i<cantidad; i++){
            costoTotal = (costoTotal + recurso.calculaCosto());
        }
    return costoTotal;
    }

    public int tiemposAltos(Recurso recurso){
        int totalEmergencia = 0;
        Ambulancia a= new Ambulancia();
        Bombero b = new Bombero();
        Policia p = new Policia();
        if (recurso instanceof Ambulancia){
            if(((Ambulancia) recurso).getTiempoRespuestaMinutos()>=50){
                totalEmergencia++;
            }
        } else if (recurso instanceof  Bombero){
            if(((Bombero) recurso).getTiempoRespuestaMinutos()>=50){
                totalEmergencia++;
            }
        }else if (recurso instanceof  Policia){
            if(((Policia) recurso).getTiempoRespuestaMinutos()>=50){
                totalEmergencia++;
            }
        }
        return totalEmergencia;
    }
    public static void supervisar(Usuario u){
        for(int u.getRecurso().length){

        }
    }
}
