package br.com.gabriellysilva.tarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gabriellysilva.tarefas.entity.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    
}
