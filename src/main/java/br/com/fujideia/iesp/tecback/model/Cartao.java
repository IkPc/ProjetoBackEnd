package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "tb_cartao")
public class Cartao implements Serializable {

    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Integer id;

    private String nome;

    private Integer numero;

    @Column
    private Date vencimento;

    @Column(length = 3)
    private Integer cvc;

    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuario usuario;
}