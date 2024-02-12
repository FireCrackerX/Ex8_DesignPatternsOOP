public class LightCommand implements Command {
    private Light light;
    String roomName;
    int slot;

    public LightCommand(Light light, int slot) {
        this.light = light;
        this.roomName = light.getRoomName();
        this.slot = slot;
    }

    @Override
    public void execute() {
        System.out.println("Slot " + slot + ", light " + roomName);
        light.on();
        light.off();
    }
}
