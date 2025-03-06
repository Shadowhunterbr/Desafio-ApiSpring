package me.dio.DesafioApi.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import me.dio.DesafioApi.model.Pedido;
import me.dio.DesafioApi.service.PedidoService;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoController {
	
	private final PedidoService pedidoService;
	
	public PedidoController(PedidoService pedidoService) {
		this.pedidoService = pedidoService;
	}
	
	@GetMapping
	public List<Pedido> getAll(){
		return pedidoService.getAll();
	}
	
	@PostMapping("/save")
	public Pedido create(@RequestBody Pedido pedido){
		return pedidoService.save(pedido);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete (@PathVariable Long id) {pedidoService.delete(id);}
	
	@GetMapping("/{id}")
	public ResponseEntity<Pedido> buscaPedido(@PathVariable Long id){
		
		Pedido pedido = pedidoService.findPedido(id); 
		//ProdutoModel produtoModel = ProdutoService.findById(id);
		
		return ResponseEntity.ok().body(pedido);
	}
	
}
