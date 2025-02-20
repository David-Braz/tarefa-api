package com.tarefaapi.tarefaapi.controller;

import com.tarefaapi.tarefaapi.model.Tarefa;
import com.tarefaapi.tarefaapi.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {


    @Autowired
    private TarefaService tarefaservice;

    @GetMapping
    public List<Tarefa> getAllTarefas(){
        return tarefaservice.getAllTarefas();

    }

    @PostMapping
    public Tarefa createTarefa(@RequestBody Tarefa tarefa){
        return tarefaservice.createTarefa(tarefa);
    }
}
