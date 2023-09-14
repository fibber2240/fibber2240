package Example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int cup = scanner.nextInt();
        boolean weekend = scanner.hasNextBoolean();
        boolean party = (cup >= 10 && cup <= 20) && (weekend) || (cup >= 15 && cup <= 25) && (weekend);
    }
}
