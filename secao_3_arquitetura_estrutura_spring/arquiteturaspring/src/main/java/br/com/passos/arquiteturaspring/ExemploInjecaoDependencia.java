package br.com.passos.arquiteturaspring;

import br.com.passos.arquiteturaspring.montadora.todos.TodoEntity;
import br.com.passos.arquiteturaspring.montadora.todos.TodoRepository;
import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ExemploInjecaoDependencia {
    public static void main(String[] args) throws SQLException {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        Connection connection = dataSource.getConnection();
        EntityManager entityManager = null;

        //TodoRepository repository = new SimpleJpaRepository<TodoEntity, Long>();
    }
}
