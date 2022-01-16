package collectionsqueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class ToDoList {

    private List<ToDo> todos;

    public ToDoList(List<ToDo> todos) {
        this.todos = todos;
    }

    public Deque<ToDo> getTodosInUrgencyOrder() {
        ArrayDeque priority = new ArrayDeque();
        for (ToDo toDo: todos) {
            if (toDo.isUrgent()) {
                priority.addFirst(toDo);
            } else {
                priority.addLast(toDo);
            }
        }
        return priority;
    }

    public static void main(String[] args) {

        List<ToDo> toDos= List.of(new ToDo("first", true),
                new ToDo("second", false),
                new ToDo("third", false),
                new ToDo("fourth", true),
                new ToDo("fifth", true),
                new ToDo("sixth", false));

        ToDoList toDoList = new ToDoList(toDos);
        ArrayDeque priority = (ArrayDeque) toDoList.getTodosInUrgencyOrder();
        System.out.println(priority);
        System.out.println(priority.pop());;
        System.out.println(priority);
    }
}
