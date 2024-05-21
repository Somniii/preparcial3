package preparcial;

public class Ambulancia {
    private double facturacion;
    private int tiempoRespuestaMinutos;

    public Ambulancia(double facturacion, int tiempoRespuestaMinutos) {
        this.facturacion = facturacion;
        this.tiempoRespuestaMinutos = tiempoRespuestaMinutos;
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
}
