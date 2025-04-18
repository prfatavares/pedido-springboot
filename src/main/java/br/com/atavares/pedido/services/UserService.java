package br.com.atavares.pedido.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.atavares.pedido.entities.User;
import br.com.atavares.pedido.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(Integer id){
        Optional<User> obj = userRepository.findById(id);
        return obj.get();
    }

    public User insert(User obj){
        return userRepository.save(obj);
    }

    public void delete(Integer id){
        userRepository.deleteById(id);
    }

    public User update(Integer id, User obj){
        User u = userRepository.getReferenceById(id);        
        u.setName(obj.getName());
        u.setEmail(obj.getEmail());
        u.setPhone(obj.getPhone());
        if (obj.getPassword() != null)
            u.setPassword(obj.getPassword());
        return userRepository.save(u);
    }

}
