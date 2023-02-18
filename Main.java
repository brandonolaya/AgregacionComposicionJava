public class Main {
    public static void main(String[] args) {

        Telefono telefono = new Telefono();
        Bateria bateria = new Bateria("asd12s", "xase", 19);
        telefono.bateria = bateria;
        telefono.marca = "Samsung";
        telefono.modelo = "G10HH";
        telefono.mostrar(telefono.bateria, telefono.marca, telefono.modelo);


        Simcard simcard = new Simcard("3120425463");
        telefono.numTelefono = simcard;
        System.out.println(telefono.numTelefono.numeroTelefonico);//valor
        System.out.println(telefono.numTelefono); //referencia


//        Telefono telefono1 = new Telefono();
//        telefono1.modelo = "3Hf45";
//        telefono1.marca = "Nokia";
//        telefono1.mostrar(telefono1.bateria,telefono1.marca,telefono1.modelo);


        //bateria.mostrarBateria();

    }
}