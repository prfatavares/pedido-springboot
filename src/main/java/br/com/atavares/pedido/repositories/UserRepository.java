package br.com.atavares.pedido.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.atavares.pedido.entities.User;

public interface UserRepository extends JpaRepository <User, Integer> {

}
