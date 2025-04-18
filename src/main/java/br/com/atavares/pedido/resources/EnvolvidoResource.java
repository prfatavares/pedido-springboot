package br.com.atavares.pedido.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.atavares.pedido.entities.Envolvido;
import br.com.atavares.pedido.services.EnvolvidoService;

@RestController
@RequestMapping(value = "/envolvidos")
public class EnvolvidoResource {

    @Autowired
    private EnvolvidoService envolvidoService;

    @GetMapping
    public ResponseEntity<List<Envolvido>> findAll(){
        List<Envolvido> list = envolvidoService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/id={id}")
    public ResponseEntity<Envolvido> findById(@PathVariable Integer id){
        Envolvido e = envolvidoService.findById(id);
        return ResponseEntity.ok().body(e);
    }

}
