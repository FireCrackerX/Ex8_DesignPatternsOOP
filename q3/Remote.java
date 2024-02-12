import java.util.ArrayList;

public class Remote {
    private ArrayList<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeCommands() {
        for (Command command : commands) {
            command.execute();
            System.out.println("---------------------------------------------");
        }
    }
}
