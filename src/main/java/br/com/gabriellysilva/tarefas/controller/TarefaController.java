package br.com.gabriellysilva.tarefas.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gabriellysilva.tarefas.entity.Tarefa;
import br.com.gabriellysilva.tarefas.service.TarefaService;

@RestController 
@RequestMapping("/tarefas")
public class TarefaController {
    private TarefaService tarefaService;
    
    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    @PostMapping 
    List<Tarefa> criar(@RequestBody Tarefa tarefa) {
        return tarefaService.criar(tarefa);
    }

    @GetMapping 
    List<Tarefa> listar() {
         return tarefaService.listar();
    }

    @PutMapping 
    List<Tarefa> atualizar(@RequestBody Tarefa tarefa) {
         return tarefaService.atualizar(tarefa);
    }

    @DeleteMapping("{id}") 
    List<Tarefa> deletar(@PathVariable ("id") Long id) {
         return tarefaService.deletar(id);
    }
}
