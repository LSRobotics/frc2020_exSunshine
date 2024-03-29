package frc.robot.software;

public class Timer {
    private long startTime = 0;
    private long endTime = 0;
    private boolean isBusy = false;
    private String name;

    public Timer(String name) {
        this.name = name;
        startTime = System.currentTimeMillis();
    }   

    public void start() {
        startTime = System.currentTimeMillis();
        isBusy = true;
    }

    public boolean isBusy() {
        return isBusy;
    }

    public void stop() {
        endTime = System.currentTimeMillis();
        isBusy = false;
    }

    public long getElaspedTimeInMs() {
        endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public String toString() {
        if (isBusy) {
            stop();
        }

        return "[" + name + "] Time elapsed: " + (getElaspedTimeInMs()) + "ms";
    }

}
