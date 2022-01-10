package structural.facade;

public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker) {
        if (bugTracker.isActiveSpring()) {
            System.out.println("Developer is solving the problems...");
        } else {
            System.out.println("Developer is reading dou.ua");
        }
    }
}
