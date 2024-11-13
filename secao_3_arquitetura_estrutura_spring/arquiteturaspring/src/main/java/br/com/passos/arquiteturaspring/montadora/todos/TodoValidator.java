package br.com.passos.arquiteturaspring.montadora.todos;

import org.springframework.stereotype.Component;

@Component
public class TodoValidator {

    private TodoRepository todoRepository;

    public TodoValidator(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public void validar(TodoEntity todo){
        if(existeTodoComDescricao(todo.getDescricao())){
            throw new IllegalArgumentException("Já existe um TODO com esta descrição!");
        }
    }

    private boolean existeTodoComDescricao(String descricao){
        return todoRepository.existsByDescricao(descricao);
    }
}
