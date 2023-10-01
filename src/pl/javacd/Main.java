package pl.javacd;

import pl.javacd.drive.HDDDrive;
import pl.javacd.drive.SDDDrive;
import pl.javacd.usbdevice.MemoryStick;
import pl.javacd.usbdevice.Mouse;

public class Main {

    public static void main(String[] args) {
        Monitor monitor = new Monitor();
//        HDDDrive drive = new HDDDrive();
        SDDDrive drive = new SDDDrive();

        Computer computer = new Computer(monitor, drive);

//        drive.addFile(new File("jnsp.jpg"));
//        drive.listFiles();

        MemoryStick memoryStick = new MemoryStick("Pendirve");
        Mouse mouse = new Mouse("Mysz");

        computer.addUSBDevice(memoryStick);
//        computer.addUSBDevice(mouse);

        memoryStick.eject();
        computer.removeUSBDevice(memoryStick);
//        computer.removeUSBDevice(mouse);

    }
}
