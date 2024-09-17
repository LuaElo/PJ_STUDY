package br.com.etechoracio.pw3_study.service;

import br.com.etechoracio.pw3_study.dto.MonitorResponseDTO;
import br.com.etechoracio.pw3_study.entity.Monitor;
import br.com.etechoracio.pw3_study.repository.MonitorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class MonitorService {

    @Autowired
    private MonitorRepository repository;

    private ModelMapper modelMapper = new ModelMapper();
    public List<MonitorResponseDTO> listarMonitores(){
        var monitor = repository.findAll();
        var resultado = monitor.stream().map(
                        e-> modelMapper.map(e, MonitorResponseDTO.class))
                .collect(Collectors.toList());
        return resultado;
    }

    public ResponseEntity<Monitor> buscarPorId(Long idMonitor){
        var resposta = repository.findById(idMonitor);
        if (resposta.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        else{
            return ResponseEntity.ok(resposta.get());
        }
    }
    public ResponseEntity<Monitor> inserirMonitores(Monitor monitor) {
        Monitor monitorSalvo = repository.save(monitor);
        return ResponseEntity.status(HttpStatus.CREATED).body(monitorSalvo);
    }

    public ResponseEntity<Monitor> alterarMonitor(Long idMonitor, Monitor monitor) {
        var existe = repository.findById(idMonitor);
        if (!existe.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(repository.save(monitor));
    }

    public ResponseEntity<Monitor> deletarMonitor(Long idMonitor){
        var existe = repository.findById(idMonitor);
        if (!existe.isPresent())
            return ResponseEntity.notFound().build();
        repository.delete(existe.get());
        return ResponseEntity.ok().build();
    }
}
