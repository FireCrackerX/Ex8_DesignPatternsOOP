public class UnavailableCommand implements Command {
    private int slot;
    private Unavailable unavailable;

    public UnavailableCommand(int slot) {
        this.slot = slot;
        unavailable = new Unavailable();
    }

    public void execute() {
        System.out.println("Test one unavailable slot, slot " + slot);
        unavailable.on();
        unavailable.off();
    }
}
