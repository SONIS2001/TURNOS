package TURNOS;



public class TURNOS {

    public static void main(String[] args) throws Exception {
        Casos caso = new Casos();
        
        Pedido pedido;
        
        pedido = practico.ejercicio2();
        
        System.out.println("Nombre Cliente");
        System.out.println(pedido.getCliente().getNombre());
        
        System.out.println("Mercaderia 2");
        System.out.println(pedido.getDetalles().get(1).getMercaderia().getNombre());
        
        List<DetallePedido> listaDetalles = pedido.getDetalles();
        DetallePedido detallePedido2 = listaDetalles.get(1);
        Mercaderia mercaderia = detallePedido2.getMercaderia();
        
        System.out.println("Mercaderia 2 - Ordenada");
        System.out.println(mercaderia.getNombre());
        
        System.out.println("Cantidad de Botellas");
        System.out.println(pedido.getDetalles().get(1).getCantidad());
        
    }

}

}
