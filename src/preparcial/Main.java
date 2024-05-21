package preparcial;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    }
    public static Usuario crearUsuario(Scanner scan){
        //ENTRADA NORMAL DE DATOS DEL USUARIO
        System.out.println("Ingrese un nombre del usuario");
        String nombre = scan.nextLine();
        System.out.println("Ingrese un apellido del usuario");
        String apellido = scan.nextLine();
        System.out.println("Ingrese el dni del usuario");
        int dni = scan.nextInt();
        System.out.println("El usuario posee obra social?\n1.Si\n2.No\nOtra opcion sera tomada como no\n");
        int opc = scan.nextInt();
        //PARA VER SI TIENE OBRA SOCIAL O NO
        String obraSocial;
        if(opc ==1){
            obraSocial = "si";
        }else{
            obraSocial = "no";
        }
        //PARA VER EL TAMAÑO DEL ARRAY RECURSO
        System.out.println("Ingrese la cantidad de recursos del usuario");
        int cant = scan.nextInt();
        //PARA VER EL PRECIO FINAL DE LA FACTURA FINAL DE TODOS LOS RECURSOS
        double facturaFinal = 0;

        Recurso[] recurso = new Recurso[cant];

        //PARA LLENAR CADA FACTURA DEPENDIENDO DEL TIPO DE ORDEN
        for(int i = 0; i<=cant ;i++){
            System.out.println("Cual fue el tiempo de respuesta en minutos?");
            int tiempo = scan.nextInt();
            System.out.println("Cual tipo de recurso fue?\n1.Ambulancia\n2.Policia\n3.Bombero\n");
            int tipoOrden = scan.nextInt();
            double precioTotal;
            switch (tipoOrden){
                case 1:
                    Ambulancia a = new Ambulancia();
                    if(obraSocial=="si"){
                        precioTotal = a.getPrecioBase();
                    }else{
                        //Aca si no tiene obra social o si no especifico se le suman 1000
                        precioTotal = a.getPrecioBase() + 1000;
                    }
                    a.setFacturacion(precioTotal);
                    a.setTiempoRespuestaMinutos((tiempo));
<<<<<<< HEAD

                    facturaFinal =+ precioTotal;
=======
                    a.calculaCosto();
                    //PROBANDO SINO facturaFinal =+ a.getFacturacion
                    facturaFinal =+ a.calculaCosto();
>>>>>>> 1bb07989ce83689ab843219cfb836102b50603d8
                    recurso[i] = a;
                    break;
                case 2:
                    Policia p = new Policia();
                    p.setFacturacion(p.getPrecioBase());
                    p.setTiempoRespuestaMinutos(tiempo);
                    facturaFinal =+ p.calculaCosto();
                    recurso[i] = p;
                    break;
                case 3:
                    Bombero b = new Bombero();
                    b.setFacturacion(b.getPrecioBase());
                    b.setTiempoRespuestaMinutos(tiempo);
                    b.calculaCosto();
                    facturaFinal =+ b.calculaCosto();
                    recurso[i] = b;
                    break;
                default:
                    System.out.println("Fue roto por culpa señor usuario del que puso un valor distinto , sos un rompecodigos");
                    break;
            }

        }
        Usuario u = new Usuario(apellido,dni,nombre,obraSocial,recurso,facturaFinal);
        return u;

    }
    public static Supervisor supervisor(Scanner scan, Usuario usuario, Recurso recurso){
        Persona p = CargaPersona(scan);
        Usuario user = usuario;
        int tiempo = 0;
        double facturaTotal=0;
        facturaTotal= user.getFacturaUsuario();
        for (int i=0; i<user.getRecurso().length;i++){
            Recurso aux = user.getRecurso()[i];
            if (aux instanceof  Ambulancia){
                tiempo= tiempo + ((Ambulancia) aux).getTiempoRespuestaMinutos();
            } else if (aux instanceof Bombero) {
                tiempo= tiempo + ((Bombero) aux).getTiempoRespuestaMinutos();
            } else if (aux instanceof  Policia){
                tiempo= tiempo + ((Policia) aux).getTiempoRespuestaMinutos();
            }
        }

        Supervisor s = new Supervisor(p.getApellido(), p.getDNI(),p.getNombre(), facturaTotal, tiempo);

    return  s;
    }

    public static Persona CargaPersona(Scanner scan){
        System.out.println("Ingrese un nombre del usuario");
        String nombre = scan.nextLine();
        System.out.println("Ingrese un apellido del usuario");
        String apellido = scan.nextLine();
        System.out.println("Ingrese el dni del usuario");
        long dni = scan.nextLong();
        Persona p = new Persona(apellido,dni,nombre);
        return  p;
    }
}