package preparcial;

public class Bombero implements Recurso{
    private static final double facturacion = 600;
    private int tiempoRespuestaMinutos;
    public Bombero(){

    }

    public Bombero( int tiempoRespuestaMinutos) {
        this.tiempoRespuestaMinutos = tiempoRespuestaMinutos;
    }

    public double getFacturacion() {
        return facturacion;
    }

    public int getTiempoRespuestaMinutos() {
        return tiempoRespuestaMinutos;
    }

    public void setTiempoRespuestaMinutos(int tiempoRespuestaMinutos) {
        this.tiempoRespuestaMinutos = tiempoRespuestaMinutos;
    }
    public double calculaCosto() {
        double costo = getFacturacion();
        if (tiempoRespuestaMinutos > 50) {
            costo = costo / 2;
        }
        return costo;
    }

}
