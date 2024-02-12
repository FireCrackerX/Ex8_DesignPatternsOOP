import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ThaiFan tf = new ThaiFan();
        UAEFan uf = new UAEFan();

        Reporter reporter = new Reporter();
        reporter.addObserver(tf);
        reporter.addObserver(uf);

        do {
            System.out.print("Enter Score : ");
            String result = sc.nextLine();
            if (result.equals("")) {
                break;
            }
            reporter.setText(result);
        } while (true);
        
        sc.close();
    }
}