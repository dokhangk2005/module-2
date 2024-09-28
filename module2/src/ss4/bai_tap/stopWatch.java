package ss4.bai_tap;

import java.time.LocalTime;

public class stopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public stopWatch() {
        this.startTime = LocalTime.now();
    }
    public LocalTime getStartTime() {
        return startTime;
    }
    public LocalTime getEndTime() {
        return endTime;
    }
    public void start() {
        this.startTime = LocalTime.now();
    }
    public void stop() {
        this.endTime = LocalTime.now();
    }
    public int getElapsedTime() {
        return ((endTime.getHour()-startTime.getHour())*3600 + (endTime.getMinute()-startTime.getMinute())*60 + (endTime.getSecond()-startTime.getSecond())*1000);
    }
    public static void main(String[] args) {
        stopWatch stopWatch = new stopWatch();
        stopWatch.start();
        int a = 0;
        for (int i = 0; i < 100000000; i++) {
            a++;
        }
        stopWatch.stop();
        System.out.println(stopWatch.getStartTime() + ", " + stopWatch.getEndTime() + ", " + stopWatch.getElapsedTime());
    }
}
