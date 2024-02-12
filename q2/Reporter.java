public class Reporter extends Source {
    private String text;

    public void setText(String text) {
        this.text = text;
        this.notifyObservers();
    }

    public String getText() {
        return this.text;
    }
}
