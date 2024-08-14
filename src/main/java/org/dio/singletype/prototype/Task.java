package org.dio.singletype.prototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Task {
    private String taskName;

    public Task() {
        this.taskName = "Task " + Math.random();
    }

    public void execute() {
        System.out.println("Executing: " + taskName);
    }
}
