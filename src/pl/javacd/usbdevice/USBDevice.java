package pl.javacd.usbdevice;

public interface USBDevice {
    boolean connect();
    boolean disconnect();
    String getName();

}
