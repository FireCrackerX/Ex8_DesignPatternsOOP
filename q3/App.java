public class App {
    public static void main(String[] args) {
        Light lightB = new Light("Bed Room");
        Light lightK = new Light("Kitchen");
        Airconditioner acB = new Airconditioner("Bed Room");
        
        LightCommand lightCommandB = new LightCommand(lightB, 0);
        LightCommand lightCommandK = new LightCommand(lightK, 1);
        AirCommand airCommandB = new AirCommand(acB, 25, 2);
        UnavailableCommand unavailableCommand = new UnavailableCommand(3);

        Remote remote = new Remote();
        remote.addCommand(lightCommandB);
        remote.addCommand(lightCommandK);
        remote.addCommand(airCommandB);
        remote.addCommand(unavailableCommand);

        remote.executeCommands();
    }
    
}
