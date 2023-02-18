public class Telefono {
    public Bateria bateria;
    public Simcard numTelefono;
    public String modelo, marca;

    void mostrar(Bateria bateria, String modelo, String marca){
        System.out.println("El telefono " + marca + ""
                            +" de modelo " + modelo + ""
                            +" tiene una bateria " + bateria.amperios+""
                            +" amperios ");
    }

}
