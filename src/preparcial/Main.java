package preparcial;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Usuario user = crearUsuario(scan);
        System.out.println("PASA A RECORRER USUARIO");
        recorrerUsuario(user);
        System.out.println("PASA A MOSTRAR ESTADISTICA");
        mostrarEstadistica(user);
        Supervisor s = cargarSupervisor(scan , user);
        int total = 0;
        for(int i = 0; i<user.getRecurso().length; i++){
            Recurso r = user.getRecurso()[i];
            total = total + s.tiemposAltos(r);

        }
        System.out.println("El total de los recursos que superan los 49 minutos es :\n"+total);
        System.out.println(s.toString());
    }
    public static Usuario crearUsuario(Scanner scan){
        //ENTRADA NORMAL DE DATOS DEL USUARIO
        System.out.println("------BIENVENIDO A LA CREACION DEL USUARIO------");
        Persona per = cargaPersona(scan);
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

        for(int i = 0; i<cant ;i++){
            System.out.println("Cual tipo de recurso fue?\n1.Ambulancia\n2.Policia\n3.Bombero\n");
            int tipoOrden = scan.nextInt();
            System.out.println("Cual fue el tiempo de respuesta en minutos?");
            int tiempo = scan.nextInt();
            double precioTotal;
            switch (tipoOrden){
                case 1:
                    Ambulancia a = new Ambulancia();
                    if(obraSocial =="si"){
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
                    facturaFinal = facturaFinal +precioTotal;
                    a.calculaCosto();
                    //PROBANDO SINO facturaFinal =+ a.getFacturacion
                    facturaFinal =facturaFinal+ a.calculaCosto();

>>>>>>> 922eea704feba2ffe24d5c3f9a332320798c2bcc
                    recurso[i] = a;
                    break;
                case 2:
                    Policia p = new Policia();
                    p.setFacturacion(p.getPrecioBase());
                    p.setTiempoRespuestaMinutos(tiempo);
<<<<<<< HEAD
                    facturaFinal =+ p.getPrecioBase();
=======
                    facturaFinal =facturaFinal+ p.calculaCosto();
>>>>>>> 922eea704feba2ffe24d5c3f9a332320798c2bcc
                    recurso[i] = p;
                    break;
                case 3:
                    Bombero b = new Bombero();
                    b.setFacturacion(b.getPrecioBase());
                    b.setTiempoRespuestaMinutos(tiempo);
<<<<<<< HEAD
                    facturaFinal =+ b.getPrecioBase();
=======
                    b.calculaCosto();
                    facturaFinal =facturaFinal+ b.calculaCosto();
>>>>>>> 922eea704feba2ffe24d5c3f9a332320798c2bcc
                    recurso[i] = b;
                    break;
                default:
                    System.out.println("Fue roto por culpa señor usuario del que puso un valor distinto , sos un rompecodigos");
                    break;
            }
            //System.out.println("------------Factura final-----------\n"+facturaFinal);

        }
        Usuario u = new Usuario(per.getApellido(),per.getDNI(),per.getNombre(),obraSocial,recurso,facturaFinal);
        return u;

    }
    public static void recorrerUsuario(Usuario u){
        System.out.println(u.toString());
        for(int i = 0; i< u.getRecurso().length ; i++){
            Recurso recurso = u.getRecurso()[i];
            if(recurso instanceof Ambulancia){
                System.out.println("El recurso utilizado por el usuario fue una Ambulancia");
                System.out.println(recurso.toString());
            }
            else if(recurso instanceof Policia){
                System.out.println("Recurso:"+i+1);
                System.out.println("El recurso utilizado por el usuario fue un Policia");
                System.out.println(recurso.toString());
            }
            else if(recurso instanceof Bombero){
                System.out.println("Recurso:"+i+1);
                System.out.println("El recurso utilizado por el usuario fue un Policia");
                System.out.println(recurso.toString());

            }
        }
        //factuacion total en el println de abajo
        System.out.println("TOTAL FACTURACION MENSUAL:"+u.getFacturaUsuario());
    }
    public static void mostrarEstadistica(Usuario u){
        //SE PUEDE HACER SIN LA LINEA TOTAL RECURSOS PERO LA HAGO PARA HACERLO MAS SIMPLE
        double totalRecursos = u.getRecurso().length;
        int a,b,p,tiemposExcesivos, tEA,tEB,tEP;
        a=0;
        b=0;
        p=0;
        tiemposExcesivos=0;
        tEA=0;
        tEB=0;
        tEP=0;
        double porcentajeAmbulancia,porcentajeBombero,porcentajePolicia;
        for(int i = 0; i< u.getRecurso().length ;i++){
            Recurso recurso = u.getRecurso()[i];
            if(recurso instanceof  Ambulancia){
                a++;
                if(((Ambulancia) recurso).getTiempoRespuestaMinutos()>50){
                    tiemposExcesivos++;
                   // tEA++;
                }
            }else if(recurso instanceof Bombero){
                b++;
                if(((Bombero) recurso).getTiempoRespuestaMinutos()>50){
                    tiemposExcesivos++;
                    //tEB++;
                }
            }else if(recurso instanceof Policia){
                p++;
                if(((Policia) recurso).getTiempoRespuestaMinutos()>50){
                    tiemposExcesivos++;
                }
            }


        }
        System.out.println("De los "+totalRecursos+" del usuario:\n"+ (a/totalRecursos)*100 + "% fueron de ambulancias \n"+ (b/totalRecursos)*100+"% fueron de Bomberos\n"+(p/totalRecursos)*100+"% fueron de Policias\nEl "+(tiemposExcesivos/totalRecursos)*100+"% del total supero los 50 minutos\n");
    }
    public static void mostrarSupervisor(Supervisor s){
        System.out.println(s.toString());
    }
    public static Supervisor cargarSupervisor(Scanner scan, Usuario usuario){
        System.out.println("----------Bienvenido a la carga de supervisor----------");
        Persona p = cargaPersona(scan);
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

    public static Persona cargaPersona(Scanner scan){
        System.out.println("Ingrese un nombre de la persona");
        String nombre = scan.nextLine();
        System.out.println("Ingrese el dni de la persona");
        long dni = scan.nextLong();
        scan.nextLine();
        System.out.println("Ingrese un apellido de la persona");
        String apellido = scan.nextLine();
        Persona p = new Persona(apellido,dni,nombre);
        return  p;
    }
}