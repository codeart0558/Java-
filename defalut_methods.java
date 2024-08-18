import java.util.Scanner;

interface Camera {
    void takeSnaps();
    void record();
    private void g(){
        System.out.println("this is private");
    }
    default void music(){
        g();
        System.out.println("yes");
    }
}

interface Wifi {
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling: " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting...");
    }
}

class MySmartPhone extends MyCellPhone implements Wifi, Camera {
    public void takeSnaps() {
        System.out.println("Taking snap");
    }

    public void record() {
        System.out.println("Recording video");
    }

    public String[] getNetworks() {
        System.out.println("Getting list of networks");
        String[] networks = {"a", "bb", "ccc"};
        return networks;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}

class DefaultMethod {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.music();
        String[] ar = ms.getNetworks();
        for (String item : ar) {
            System.out.println(item);
        }
    }
}
