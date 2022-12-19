public class RemoteControl implements Controller {
    //TV ON AND OFF
    private boolean state;
    private boolean stateMenu;
    private int channels;
    private int current_channel;

    public RemoteControl() {
        this.state = false;
        this.stateMenu = false;
        this.channels = 20;
        this.current_channel = 5;
    }
    public boolean isState() {
        return state;
    }
    public void setState(boolean state) {
        this.state = state;
    }
    public boolean isStateMenu() {
        return stateMenu;
    }
    public void setStateMenu(boolean stateMenu) {
        this.stateMenu = stateMenu;
    }


    @Override
    public void turnOn() {
        if (!this.isState()) {
            System.out.println("turn On TV");
            System.out.println("Current channel: " + current_channel);
            this.setState(true);
        } else {
            System.out.println("POWER: TV is ON");
        }
    }

    @Override
    public void turnOff() {
        if (this.isState()) {
            System.out.println("turn Off TV");
            this.setState(false);
        } else {
            System.out.println("POWER: TV isn't Otv esta ligadaN");
        }
    }

    @Override
    public void openMenu() {
        if (this.isState()) {
            if (!this.isStateMenu()) {
                System.out.println("Opened Menu!");
                this.setStateMenu(true);
            } else {
                System.out.println("MENU: TV isn't ON");
            }
        }
    }

    @Override
    public void closeMenu() {
        if (this.isState()) {
            if (this.isStateMenu()) {
                System.out.println("Closed Menu!");
                this.setStateMenu(false);
            }
        } else {
            System.out.println("MENU: TV isn't ON");
        }
    }

    @Override
    public void changeChannels(boolean state) {
        if (this.isState()) {
            if (state) {
                if (this.current_channel < this.channels) {
                    this.current_channel++;
                    System.out.println("turning up channel +1");
                } else if (this.current_channel == 20) {
                    this.current_channel = 0;
                }
            } else {
                if (this.current_channel > 0) {
                    System.out.println("turning down channel -1");
                    this.current_channel--;
                } else if (this.current_channel == 0) {
                    this.current_channel = 20;
                }
            }
            System.out.println("increase and decrease sound current Channel: " + this.current_channel);
        }
    }
}
