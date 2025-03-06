package me.dio.DesafioApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.DesafioApi.model.Pedido;

public interface PedidoRepository  extends JpaRepository<Pedido, Long>{

}
