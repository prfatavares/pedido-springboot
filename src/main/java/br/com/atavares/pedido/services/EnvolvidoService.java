package br.com.atavares.pedido.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.atavares.pedido.entities.Envolvido;
import br.com.atavares.pedido.repositories.EnvolvidoRepository;

@Service
public class EnvolvidoService {

    @Autowired
    private EnvolvidoRepository envolvidoRepository;

    public List<Envolvido> findAll(){
        return envolvidoRepository.findAll();
    }

    public Envolvido findById(Integer id){
        Optional<Envolvido> obj = envolvidoRepository.findById(id);
        return obj.get();
    }

}
