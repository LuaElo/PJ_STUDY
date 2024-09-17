package br.com.etechoracio.pw3_study.entity;
//ELOAH CRISTINA SANTOS DO CARMO E LUARA RODRIGUES MAGALHÃES -3AI

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_DISCIPLINA")
public class Disciplina {
    @Id
    @Column(name = "ID_DISCIPLINA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TX_NOME")
    private String nome;

}
