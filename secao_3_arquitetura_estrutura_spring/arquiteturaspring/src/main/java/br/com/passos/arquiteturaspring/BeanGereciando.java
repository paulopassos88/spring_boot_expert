package br.com.passos.arquiteturaspring;

import br.com.passos.arquiteturaspring.montadora.todos.TodoEntity;
import br.com.passos.arquiteturaspring.montadora.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Lazy(value = false)
@Component
//@Scope(BeanDefinition.SCOPE_SINGLETON)
//@Scope(WebApplicationContext.SCOPE_REQUEST)
//@Scope(WebApplicationContext.SCOPE_SESSION)
//@Scope(WebApplicationContext.SCOPE_APPLICATION)
public class BeanGereciando {

    @Autowired
    private TodoValidator todoValidator;

    public BeanGereciando(TodoValidator todoValidator){
        this.todoValidator = todoValidator;
    }

    public void utilizar(){
        var todo = new TodoEntity();
        todoValidator.validar(todo);
    }

    @Autowired
    public void setTodoValidator(TodoValidator todoValidator){
        this.todoValidator = todoValidator;
    }

}
