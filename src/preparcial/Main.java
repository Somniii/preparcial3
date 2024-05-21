package preparcial;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    }
    public static Usuario crearUsuario(Scanner scan){
        System.out.println("Ingrese un nombre del usuario");
        String nombre = scan.nextLine();
        System.out.println("Ingrese un apellido del usuario");
        String apellido = scan.nextLine();
        System.out.println("Ingrese el dni del usuario");
        int dni = scan.nextInt();
        System.out.println("El usuario posee obra social?\n1.Si\n2.No\nOtra opcion sera tomada como no\n");
        int opc = scan.nextInt();
        String obraSocial;
        if(opc ==1){
            obraSocial = "si";
        }else{
            obraSocial = "no";
        }
        System.out.println("Ingrese la cantidad de recursos del usuario");
        int cant = scan.nextInt();
        Recurso[] recurso = new Recurso[cant];
        for(int i = 0; i<=cant ;i++){
            System.out.println("Cual tipo de recurso fue?\n1.Ambulancia\n2.Policia\n3.Bombero\n");
            int tipoOrden = scan.nextInt();
            switch (tipoOrden){
                case 1:
                    Ambulancia a = new Ambulancia();
                    recurso[i] = a;

                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    break;
            }

        }

    }
    public static Usuario gestionFactura(Usuario u){
        if(u.getObraSocial() == "no"){

        }
    }

}