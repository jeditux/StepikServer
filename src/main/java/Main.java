import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import java.util.logging.Logger;

/**
 * Created by Anatoly Gostev on 17.02.2018.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Frontend frontend = new Frontend();
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.addServlet(new ServletHolder(frontend), "/mirror");

        Server server = new Server(8080);
        server.setHandler(context);
        server.start();
        Logger.getGlobal().info("Server started");
        server.join();
    }
}
