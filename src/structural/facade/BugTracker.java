package structural.facade;

public class BugTracker {
    private boolean activeSpring;

    public boolean isActiveSpring() {
        return activeSpring;
    }

    public void startSprint() {
        System.out.println("Sprint is active.");
        activeSpring = true;
    }

    public void finishSprint() {
        System.out.println("Sprint is not active.");
        activeSpring = false;
    }
}
