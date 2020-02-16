package CleanCodeTask;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class App {
	public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        PrintStream obj = new PrintStream(new FileOutputStream(FileDescriptor.out));
        int con = 1;
        do {
            obj.print("     Welcome to Assignemnt  \n");
            obj.print("Press 1 to run Interest(Simple/Compound)\n");
            obj.print("Press 2 to run House Cost Estimation\n");
            obj.print("Enter your choice = ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Interest obj1 = new Interest();
                    obj1.calculate();
                    break;
                case 2:
                	HomeCostEstimation obj2 = new HomeCostEstimation();
                    obj2.calculate();
                    break;
                default:
                    obj.print("Wrong choice\n");
            }
            obj.print("Press 0 to stop\n");
            con = sc.nextInt();
        }while (con!=0);
    }

}
