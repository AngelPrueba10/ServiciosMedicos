package com.example.catalogo_servicios.controller;

import com.example.catalogo_servicios.model.ServicioMedico;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/servicios")
public class ServicioMedicoController {
    private List<ServicioMedico> servicios = new ArrayList<>();

    @PostMapping("/registrar")
    public String registrarServicio(@RequestBody ServicioMedico servicio) {
        servicios.add(servicio);
        return "Servicio registrado con éxito: " + servicio.getNombre();
    }

    @GetMapping("/buscar")
    public List<ServicioMedico> buscarServicio(@RequestParam String especialidad) {
        return servicios.stream()
                .filter(s -> s.getEspecialidad().equalsIgnoreCase(especialidad))
                .collect(Collectors.toList());
    }

    @PutMapping("/actualizar/{id}")
    public String actualizarServicio(@PathVariable int id, @RequestBody ServicioMedico servicioActualizado) {
        if (id >= 0 && id < servicios.size()) {
            servicios.get(id).setHorario(servicioActualizado.getHorario());
            return "Horario del servicio actualizado exitosamente.";
        }
        return "Servicio no encontrado.";
    }
}
