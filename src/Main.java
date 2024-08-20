import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    class Humane {
        private String nombre;
        private String apellido;
        private int dni;

        public Humane(String nombre, String apellido, int dni) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.dni = dni;
        }

        public String toString() {
            return "Nombre: " + this.nombre + "\nApellido: " + this.apellido + "\nDNI: " + this.dni;
        }
    }

    class Empleado extends Humane {
        private double sueldo;

        public Empleado(String nombre, String apellido, int dni, double sueldo) {
            super(nombre, apellido, dni);
            this.sueldo = sueldo;
        }

        public String toString() {
            return "\n" + super.toString() + "\nSueldo: " + this.sueldo;
        }
    }

    class Caja {
        private Empleado empleado;
        private int nroCaja;

        public Caja(Empleado empleado, int nroCaja) {
            this.empleado = empleado;
            this.nroCaja = nroCaja;
        }

        public String toString() {
            return this.empleado.toString() + "\nNro de caja: " + this.nroCaja;
        }
    }

    class Cliente extends Humane {
        private boolean mayorista;

        public Cliente(String nombre, String apellido, int dni, boolean mayorista) {
            super(nombre, apellido, dni);
            this.mayorista = mayorista;
        }

        public String toString() {
            return "\n" + super.toString() + "\nMayorista: " + this.mayorista;
        }
    }

    class Productos {
        private String nombre;
        private int cantidad;
        private int precio;

        public Productos(String nombre, int cantidad, int precio) {
            this.nombre = nombre;
            this.cantidad = cantidad;
            this.precio = precio;

        }

        public String toString() {
            return "Nombre: " + this.nombre + "\nCantidad:" + this.cantidad + "\nPrecio: " + this.precio;
        }
    }



    public static void main(String[] args) {

        Main programa = new Main();

        /*
        Cliente cliente = programa.new Cliente("Juan", "Perez", 12345678, true);
        System.out.println(cliente);

        */
        Scanner sc = new Scanner(System.in);
        Scanner productoScanner = new Scanner(System.in);

        /*
        System.out.println("Ingrese el numero de caja\n");
        int cajaNum = cajaScanner.nextInt();

        */
        System.out.println("Ingrese el nombre del empleado\n");
        String nombre = sc.nextLine();

        Empleado cajero = programa.new Empleado(nombre, "", 0, 0);
        if (cajero != null){

            int precioTotal = 0;
            /*
            Caja caja = programa.new Caja(cajero, cajaNum);
            sc.nextLine();
            */

            System.out.println("Ingrese cuantos productos diferentes tiene el cliente\n");
            int cant = sc.nextInt();

            Productos[] productos = new Productos[cant];

            for (int i = 0; i < cant ; i++){
                System.out.println("Ingrese el nombre del producto\n");
                String nombreProducto = productoScanner.nextLine();

                productoScanner.nextLine();

                System.out.println("Ingrese el cantidad del producto\n");
                int cantidadProducto = productoScanner.nextInt();

                productoScanner.nextLine();

                System.out.println("Ingrese el precio del producto\n");
                int precioProducto = productoScanner.nextInt();

                precioTotal += cantidadProducto * precioProducto;

                productoScanner.nextLine();

                productos[i] = programa.new Productos(nombreProducto, cantidadProducto, precioProducto);

            }

            System.out.print("el cliente compro: \n");
            for (int i = 0; i < productos.length; i++){
                System.out.println(productos[i].nombre + "\n");
            }
            System.out.print("y pago un total de: " + precioTotal + "\n");


        }







    }
}
