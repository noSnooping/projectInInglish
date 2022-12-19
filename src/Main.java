public class Main {
    //*** App Made by LUCAS DAMACENO  ***
    public static void main(String[] args) {
        System.out.println("TV is plugged in");
        RemoteControl t = new RemoteControl();
        t.turnOn();
        t.openMenu();
        t.changeChannels(false);
        t.turnOff();
        t.closeMenu();
        //new
    }
}