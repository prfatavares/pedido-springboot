package br.com.atavares.pedido.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_envolvido")
public class Envolvido implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String no_envolvido;
    private String nu_cpf;

    public Envolvido(){
    }

    public Envolvido(Integer id, String no_envolvido, String nu_cpf) {
        this.id = id;
        this.no_envolvido = no_envolvido;
        this.nu_cpf = nu_cpf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNo_envolvido() {
        return no_envolvido;
    }

    public void setNo_envolvido(String no_envolvido) {
        this.no_envolvido = no_envolvido;
    }

    public String getNu_cpf() {
        return nu_cpf;
    }

    public void setNu_cpf(String nu_cpf) {
        this.nu_cpf = nu_cpf;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Envolvido other = (Envolvido) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Envolvido [id=" + id + ", no_envolvido=" + no_envolvido + ", nu_cpf=" + nu_cpf + "]";
    }

}
