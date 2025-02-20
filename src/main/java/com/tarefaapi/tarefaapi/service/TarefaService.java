package com.tarefaapi.tarefaapi.service;

import com.tarefaapi.tarefaapi.model.Tarefa;
import com.tarefaapi.tarefaapi.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefarepository;

    public List<Tarefa> getAllTarefas(){
        return tarefarepository.findAll();
    }
    public Tarefa createTarefa(Tarefa tarefa){
        return tarefarepository.save(tarefa);
    }


}
