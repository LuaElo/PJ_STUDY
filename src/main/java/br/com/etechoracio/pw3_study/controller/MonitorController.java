package br.com.etechoracio.pw3_study.controller;

import br.com.etechoracio.pw3_study.dto.MonitorResponseDTO;
import br.com.etechoracio.pw3_study.entity.Monitor;
import br.com.etechoracio.pw3_study.service.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/monitores")
public class MonitorController {
    @Autowired
    private MonitorService service;

    @GetMapping
    public List<MonitorResponseDTO> listarMonitores(){return service.listarMonitores();}

    @GetMapping("/{idMonitor}")
    public ResponseEntity<Object> buscarPorId(@PathVariable Long idMonitor) {
        ResponseEntity<Monitor> dto = service.buscarPorId(idMonitor);
        if (dto == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(dto);
    }
    @PostMapping
    public ResponseEntity<Monitor> inserirMonitores(@RequestBody Monitor monitor){
        return service.inserirMonitores(monitor);}

    @PutMapping("/{idMonitor}")
    public ResponseEntity<Monitor> alterar(@PathVariable Long idMonitor, @RequestBody Monitor monitor) {
        return service.alterarMonitor(idMonitor, monitor);
    }

    @DeleteMapping("/{idMonitor}")
    public ResponseEntity<Monitor> deletar (@PathVariable Long idMonitor){
        return service.deletarMonitor(idMonitor);
    }
}




