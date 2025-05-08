package api.estacionamiento.controller;

import api.estacionamiento.service.EstanciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/neo/estancias")
public class EstanciaController {

    @Autowired
    private EstanciaService estanciaService;

    @PostMapping("/entrada")
    public void entrada(@RequestBody String placa) {
        estanciaService.registrarEntrada(placa);
    }

    @PostMapping("/salida")
    public BigDecimal salida(@RequestBody String placa) {
        return estanciaService.registrarSalida(placa);
    }
}