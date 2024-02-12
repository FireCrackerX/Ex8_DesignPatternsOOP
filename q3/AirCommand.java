public class AirCommand implements Command {
    private Airconditioner airconditioner;
    String roomName;
    int temp, slot;

    public AirCommand(Airconditioner airconditioner, int temp, int slot) {
        this.airconditioner = airconditioner;
        this.roomName = airconditioner.getRoomName();
        this.temp = temp;
        this.slot = slot;
    }

    public void execute() {
        System.out.println("Slot " + slot + ", AC " + roomName);
        airconditioner.on();
        airconditioner.setTemp(temp);
        airconditioner.off();
    }   
}