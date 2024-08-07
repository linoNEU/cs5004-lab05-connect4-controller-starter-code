import connect.ConnectFourConsoleController;
import connect.ConnectFourConsoleView;
import connect.ConnectFourModelImpl;
import connect.ConnectFourView;
import java.io.InputStreamReader;

/**
 * Run a Connect Four game interactively on the console.
 */
public class Main {
  /**
   * Run a Connect Four game interactively on the console.
   *
   * @param args command-line arguments
   */
  public static void main(String[] args) {
    Readable input = new InputStreamReader(System.in);
    Appendable output = System.out;
    ConnectFourView view = new ConnectFourConsoleView(output);
    new ConnectFourConsoleController(input, view).playGame(new ConnectFourModelImpl(6, 7));
  }
}
