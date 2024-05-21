package preparcial;

public class Policia {
    private double facturacion;
    private int tiempoRespuestaMinutos;
    public Policia(){

    }

    public double getFacturacion() {
        return facturacion;
    }

    public void setFacturacion(double facturacion) {
        this.facturacion = facturacion;
    }

    public int getTiempoRespuestaMinutos() {
        return tiempoRespuestaMinutos;
    }

    public void setTiempoRespuestaMinutos(int tiempoRespuestaMinutos) {
        this.tiempoRespuestaMinutos = tiempoRespuestaMinutos;
    }

    public Policia(double facturacion, int tiempoRespuestaMinutos) {
        this.facturacion = facturacion;
        this.tiempoRespuestaMinutos = tiempoRespuestaMinutos;
    }
}
