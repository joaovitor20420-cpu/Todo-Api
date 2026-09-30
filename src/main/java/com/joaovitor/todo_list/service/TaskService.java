package com.joaovitor.todo_list.service;

import com.joaovitor.todo_list.entity.Task;
import com.joaovitor.todo_list.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task createTask(Task task) throws Exception{
        if(task.getName() == null || task.getName().isEmpty()){
            throw new Exception("Não se pode salvar task vazia");
        }
        List<Task> allTasks = taskRepository.findAll();

        boolean jaExiste = allTasks.stream()
                .anyMatch(t -> t.getName()
                        .equalsIgnoreCase(task.getName()));

        if(jaExiste){
            throw new Exception("Essa tarefa já existe");

        }
        return taskRepository.save(task);
    }

    public Task updateTask(Long id, Task newTask) throws Exception{
        Task task = taskRepository
                .findById(id).orElseThrow(() -> new Exception("Essa tarefa não existe"));
        task.setName(newTask.getName());
        task.setDescription(newTask.getDescription());
        task.setCompleted(newTask.isCompleted());

        return taskRepository.save(task);
    }

    public Task getTaskId(Long id) throws Exception{
        Task task = taskRepository.findById(id).orElseThrow(() -> new Exception("Essa tarefa não existe"));

                return task;
    }

    public void deleteTask(Long id) throws Exception{
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new Exception("Essa task não existi"));
        taskRepository.delete(task);
    }

    public List<Task> findAll() {
        return taskRepository.findAll();
    }
}
