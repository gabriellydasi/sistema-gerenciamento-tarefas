package br.com.gabriellysilva.tarefas.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.gabriellysilva.tarefas.entity.Tarefa;
import br.com.gabriellysilva.tarefas.repository.TarefaRepository;

@Service 
public class TarefaService {
    private TarefaRepository tarefaRepository;
    
    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public List<Tarefa> criar(Tarefa tarefa) {
        Sort sort = Sort.by("prioridade").descending().and(
            Sort.by("nome").ascending()
        );

        return tarefaRepository.findAll(sort); 
    }

    public List<Tarefa> listar() {
        return tarefaRepository.findAll();
    }

    public List<Tarefa> atualizar(Tarefa tarefa) {
        tarefaRepository.save(tarefa);
        return listar();
    }

    public List<Tarefa> deletar(Long id) {
        tarefaRepository.deleteById(id);
        return listar();
    }
}
