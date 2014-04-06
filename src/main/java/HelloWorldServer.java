import net.codestory.http.*;

public class HelloWorldServer {
  public static void main(String[] args) {
    new WebServer(routes -> routes
        .get("/greeting", () -> "Hello World")
    ).start();
  }
}
