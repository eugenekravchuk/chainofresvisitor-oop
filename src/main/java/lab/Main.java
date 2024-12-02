package lab;

import lab.task2.Group;
import lab.task2.Signature;

public class Main {
    public static void main(String[] args) {
        Group<String> group = new Group<>();
        
        Signature<String> task1 = new Signature<>(arg -> System.out.println("Task 1 processed: " + arg));
        Signature<String> task2 = new Signature<>(arg -> System.out.println("Task 2 processed: " + arg));

        group.addTask(task1).addTask(task2);
        
        group.apply("Hello, world!");

        System.out.println("Task 1 stamp: " + task1.getStamp());
        System.out.println("Task 2 stamp: " + task2.getStamp());
        System.out.println("Group UUID: " + group.getGroupUuid());
    }
}
