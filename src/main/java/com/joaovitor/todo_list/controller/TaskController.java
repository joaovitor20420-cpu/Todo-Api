package com.joaovitor.todo_list.controller;

import com.joaovitor.todo_list.entity.Task;
import com.joaovitor.todo_list.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> AllList(){
        return  taskService.findAll();
    }

    @GetMapping("/{id}")
    public Task getTaskId(@PathVariable Long id) throws Exception{
        return taskService.getTaskId(id);
    }
    @PostMapping
    public Task createTask(@RequestBody Task task) throws Exception{
        return taskService.createTask(task);
    }
    @PutMapping
    public Task updateTask(@PathVariable Long id, @RequestBody Task newTask) throws Exception{
        return taskService.updateTask(id, newTask);
    }
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) throws Exception {
        taskService.deleteTask(id);
    }

}
