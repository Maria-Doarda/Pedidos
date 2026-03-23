package com.example.pedidos.services;

import com.example.pedidos.models.PedidoModel;
import com.example.pedidos.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public PedidoModel criarPedido(PedidoModel pedidoModel){
        return pedidoModel;
    }

    public List<PedidoModel> findAll(){
        return pedidoRepository.findAll();
    }

    public Optional<PedidoModel> buscarPorId(Long id){
        return pedidoRepository.findAll(id);
    }

    public void deletar(Long id){
        pedidoRepository.delete(id);
    }

}
