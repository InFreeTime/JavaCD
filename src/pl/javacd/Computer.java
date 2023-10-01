package pl.javacd;

import pl.javacd.drive.Drive;
import pl.javacd.usbdevice.USBDevice;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private Monitor monitor;
    private Drive drive;
    private Headphones hedaphones;

    private List<USBDevice> usbDevices = new ArrayList<>();

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

    public void addUSBDevice(USBDevice usbDevice){
        boolean isConnected = usbDevice.connect();

        if(isConnected){
            usbDevices.add(usbDevice);
        }
    }

    public void removeUSBDevice(USBDevice usbDevice){
        boolean isDisconnected = usbDevice.disconnect();

        if(isDisconnected){
            usbDevices.remove(usbDevice);
        }

    }
}
