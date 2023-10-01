package pl.javacd;

import pl.javacd.drive.Drive;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private Monitor monitor;
    private Drive drive;
    private Headphones hedaphones;

    List<USBDevice> usbDevices = new ArrayList<>();

    public Computer(Monitor monitor, Drive dive){
        this.monitor = monitor;
        drive = dive;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public Headphones getHedaphones() {
        return hedaphones;
    }

    public void setHedaphones(Headphones hedaphones) {
        this.hedaphones = hedaphones;
    }

    public List<USBDevice> getUsbDevices() {
        return usbDevices;
    }
}
