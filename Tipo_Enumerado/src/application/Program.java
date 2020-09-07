package application;

import java.util.Date;
 import entities.Pedido;
import entities.enums.StatusDoPedido;

public class Program {
	public static void main(String[] args) {

		Pedido pedido = new Pedido(1080, new Date(), StatusDoPedido.AGUARDANDO_PAGAMENTO);
		System.out.println(pedido);

		StatusDoPedido p1 = StatusDoPedido.ENTREGUE;
		StatusDoPedido p2 = StatusDoPedido.valueOf("ENTREGUE"); 

		System.out.println(p1);
		System.out.println(p2);

	}
}