class Persona {
    String nombre;
    String sexo;
    int edad;

    Persona(String nombre, String sexo, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }

    void hablar() {
        System.out.println("Hola, soy una persona");
    }
}

class Cuenta{
    double saldo;

    Cuenta(double saldoInicial){
        saldo = saldoInicial;
    }

    void cargar(double cantidad){
        saldo = saldo - cantidad;
    }

    void abonar(double cantidad){
        saldo = saldo + cantidad;
    }
}

class Cliente extends Persona {
    int numero;

    Cliente(String nombre, String sexo, int edad, int numero) {
        super(nombre, sexo, edad);
        this.numero = numero;
    }

    void asociarCuenta(Cuenta cuenta){
        this.numero = numero;
    }
}

class Banco {
    String nombre;
    Cliente clientes[];

    Banco (int cantidadClientes, String nombre){
        clientes = new Cliente [cantidadClientes];
        this.nombre = nombre;
    }

Cliente crearCliente (String nombre, String sexo, int edad, int numero){
    System.out.println("Creando cliente...");
    Cliente cliente = new Cliente (nombre, sexo, edad, numero);

    for (int i = 0; i < clientes.length; i++){
        if (clientes[i] == null){
            clientes[i] = cliente;
            System.out.println("Cliente creado exitosamente");
            break;
        }
    }

    return cliente;
}

void listarclientes(){
    for (int i = 0; i < clientes.length; i ++){
        if (clientes[i] != null){
            Cliente cliente = clientes[i];
            System.out.println("Cliente " + cliente.nombre + "No: " + cliente.numero);
        }
    }
}
}

class Programa {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

