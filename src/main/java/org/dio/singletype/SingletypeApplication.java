package org.dio.singletype;

import org.dio.singletype.prototype.Task;
import org.dio.singletype.singleton.LoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;


@SpringBootApplication
public class SingletypeApplication{

	public static void main(String[] args) {
		SpringApplication.run(SingletypeApplication.class, args);
	}
}

@Component
class MyApp implements CommandLineRunner {
	/* Exemplo de Singleton
	@Autowired
	private LoggerService loggerService;

	@Override
	public void run(String... args) throws Exception {
		loggerService.log("Starting application");
		loggerService.log("Working on application");
		loggerService.log("Closing application...");
	}
	 */

	// Exemplo de Prototype
	@Autowired
	private ApplicationContext co;

	@Override
	public void run(String... args) throws Exception {
		Task task1 = co.getBean(Task.class);
		Task task2 = co.getBean(Task.class);

		task1.execute();
		task2.execute();
	}
}
/*
Singleton: Um único bean é criado e compartilhado em toda a aplicação.
Ideal para serviços ou recursos que devem ser únicos, como um serviço
de logging ou uma conexão com banco de dados.

Prototype: Uma nova instância do bean é criada toda vez que ele é solicitado.
Ideal para objetos que devem manter estado individual ou para tarefas temporárias.
 */
