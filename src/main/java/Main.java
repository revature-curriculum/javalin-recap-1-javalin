

import io.javalin.Javalin;

public class Main {

    public static void main(String[] args) {
      Javalin app = Javalin.create().start(4100);
        
      app.get("/", ctx -> ctx.result("The miracle is not some magic that you got. The miracle is you.-Mirabel Madrigal, Encanto"));

      app.get("/day", ctx -> {
        String day = ctx.queryParam("day");
        ctx.result("Today is " + day);
      });
    }
}
