package br.com.etechoracio.pw3_study.dto;

import br.com.etechoracio.pw3_study.entity.Disponibilidade;
import lombok.Data;

import java.util.List;

@Data
public class MonitorResponseDTO {
    private String nome;
    private String foto;
    private List<Disponibilidade> disponibilidades;
    private String conteudo;
    private String email;

}
