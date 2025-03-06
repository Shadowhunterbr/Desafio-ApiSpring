package me.dio.DesafioApi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import me.dio.DesafioApi.model.Pedido;
import me.dio.DesafioApi.repository.PedidoRepository;

@Service
public class PedidoService {
	
	private final PedidoRepository pedidoRepository;
	
	public PedidoService(PedidoRepository pedidoRepository) {
		this.pedidoRepository = pedidoRepository;
	}
	
	public List<Pedido> getAll() {
	    List<Pedido> pedidos = pedidoRepository.findAll();
	    System.out.println("Pedidos no banco de dados: " + pedidos);  // Log no serviço
	    return pedidos;
	}
	
	public Pedido save(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}
	
	public void delete(Long id) {pedidoRepository.deleteById(id);}
	
	public Pedido findPedido(Long id) {return pedidoRepository.findById(id).orElse(null);}

}
