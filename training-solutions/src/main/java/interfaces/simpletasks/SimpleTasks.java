package interfaces.simpletasks;

import java.util.List;

public class SimpleTasks implements Runnable{

    private List<String> tasks;

    public SimpleTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    public List<String> getTasks() {
        return tasks;
    }

    private boolean nextStep() {
        if (tasks.size() < 2) {
            if (tasks.size() > 0) {
                tasks.remove(tasks.size() - 1);
            }
            return false;
        } else {
            tasks.remove(tasks.size() - 1);
            return true;
        }
    }

    public void run() {
        while (nextStep()) {
            nextStep();
        }
    }
}
