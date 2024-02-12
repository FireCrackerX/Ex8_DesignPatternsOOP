public class UAEFan implements Observer {
    public void update(Source o) {
        System.out.println("Live result: " + ((Reporter)o).getText());
    }
}
