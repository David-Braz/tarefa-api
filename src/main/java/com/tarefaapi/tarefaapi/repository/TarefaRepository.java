package com.tarefaapi.tarefaapi.repository;

import com.tarefaapi.tarefaapi.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    List<Tarefa> findByStatus(String status);
}
