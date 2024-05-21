package preparcial;

public class Persona {
    private String nombre, apellido;
    private long DNI;

    public Persona() {
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String apellido, long DNI, String nombre) {
        this.apellido = apellido;
        this.DNI = DNI;
        this.nombre = nombre;
    }
    
}
