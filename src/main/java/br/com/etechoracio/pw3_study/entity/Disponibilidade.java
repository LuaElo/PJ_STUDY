package br.com.etechoracio.pw3_study.entity;
//ELOAH CRISTINA SANTOS DO CARMO E LUARA RODRIGUES MAGALHÃES -3AI


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Table(name = "TBL_DISPONIBILIDADE")
public class Disponibilidade {

    @Id
    @Column(name = "ID_DISPONIBILIDADE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDisponibilidade;

    @Column(name = "TX_DIA_SEMANA")
    private String diaSemana;

    @Column(name = "DT_DAS")
    private LocalDateTime dtDas;

    @Column(name = "DT_ATE")
    private LocalDateTime dtAte;

}

