package entities;

import java.util.Date;

import entities.enums.StatusDoPedido;

public class Pedido {

	private Integer id;
	private Date dataDoPedido;
	private StatusDoPedido Status;

	public Pedido() {
	}
	
	public Pedido(Integer id, Date dataDoPedido, StatusDoPedido Status) {
		this.id = id;
		this.dataDoPedido = dataDoPedido;
		this.Status = Status;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataDoPedido() {
		return dataDoPedido;
	}

	public void setDataDoPedido(Date dataDoPedido) {
		this.dataDoPedido = dataDoPedido;
	}

	public StatusDoPedido getStatus() {
		return Status;
	}

	public void setStatus(StatusDoPedido status) {
		Status = status;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", dataDoPedido=" + dataDoPedido + ", Status=" + Status + "]";
	}
	
	
	
	
	
	
	
}