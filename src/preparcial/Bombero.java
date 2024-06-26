package preparcial;

public class Bombero implements Recurso{
    private static final double precioBase = 600;
    private double facturacion;
    private int tiempoRespuestaMinutos;
    public Bombero(){

    }

    public Bombero( int tiempoRespuestaMinutos, double facturacion) {
        this.tiempoRespuestaMinutos = tiempoRespuestaMinutos;
        this.facturacion = facturacion;
    }

    public double getFacturacion() {
        return precioBase;
    }

    public void setFacturacion(double facturacion){
        this.facturacion = facturacion;
    }
    public double getPrecioBase(){
        return precioBase;
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
    public String toString(){
        return ("El tiempo de respuesta fue de "+getTiempoRespuestaMinutos()+" y el precio final fue de "+getFacturacion());
    }

}
