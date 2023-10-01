package pl.javacd;

import pl.javacd.drive.HDDDrive;
import pl.javacd.drive.SDDDrive;

public class Main {

    public static void main(String[] args) {
        Monitor monitor = new Monitor();
//        HDDDrive drive = new HDDDrive();
        SDDDrive drive = new SDDDrive();

        Computer computer = new Computer(monitor, drive);

        drive.addFile(new File("jnsp.jpg"));
        drive.listFiles();
    }
}
