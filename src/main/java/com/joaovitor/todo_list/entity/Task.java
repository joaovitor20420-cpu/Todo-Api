package com.joaovitor.todo_list.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tasks" )
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private String name;
    private String description;
    private boolean completed;
}
