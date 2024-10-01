package br.com.etechoracio.pw3_study.service;

import br.com.etechoracio.pw3_study.entity.Conexao;
import br.com.etechoracio.pw3_study.repository.ConexaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.css.Counter;

@Service
public class ConexaoService {

    @Autowired
    private ConexaoRepository repository;
    public Long contarConexoes(){
        return repository.count();
    }
}
