package level3.lesson5.path2;

import java.util.HashSet;

import java.util.Set;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        Set<String> toDoList = new TreeSet<>();
        toDoList.add("сделать зарядку");
        toDoList.add("поесть");
        toDoList.add("поехать в офис");
        toDoList.add("поработать");
        toDoList.add("поесть");
        toDoList.add("поработать");
        toDoList.add("приехать домой");
        toDoList.add("обнять жену, детей");
        toDoList.add("поесть");
        toDoList.add("умыться");
        toDoList.add("лечь спать");

        for (String toDo : toDoList) {
            System.out.println(toDo);
        }
        System.out.println(toDoList);
        System.out.println("\n" + toDoList);
    }
}
