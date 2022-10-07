package tarea06;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        tienda.setNombre("Tienda de tiendas");
        tienda.setDireccion("Jr.Direccion");
        tienda.agregarCliente(new Cliente("juanito","Alcachofa",90));
        tienda.agregarCliente(new Cliente("Esteban","Quito",70));
        tienda.agregarCliente(new Cliente("Andres","Nurga",30));
        tienda.agregarCliente(new Cliente("Erick","Martel",60));
        tienda.agregarCliente(new Cliente("Jorge","Nazar",50));
        tienda.agregarCliente(new Cliente("Joel","Meza",20));
        tienda.agregarCliente(new Cliente("Martin","Marin",10));
        tienda.agregarCliente(new Cliente("Fin","Portral",40));
        tienda.agregarCliente(new Cliente("Mike","Chaparro",80));
        System.out.println("Nombre de tienda: " + tienda.getNombre() + ", Direccion: " + tienda.getDireccion());

        for (Cliente clien: tienda.getCliente()){
            System.out.println(" " + clien.getNombre() + "," + clien.getApellido() + ", " + clien.getCodigo());
        }
        tienda.ordenarCodigo();
    }

}
