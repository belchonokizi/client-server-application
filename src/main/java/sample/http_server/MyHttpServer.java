package sample.http_server;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import sample.database_connection.DatabaseConnection;
import sample.entity.Contract;
import sample.util.Converter;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.List;

public class MyHttpServer {

    public static void startServer() throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.createContext("/contracts", new MyHandler());
        server.setExecutor(null); // creates a default executor
        server.start();
    }

    static class MyHandler implements HttpHandler {
        public void handle(HttpExchange t) throws IOException {
            OutputStream os = t.getResponseBody();
            List<Contract> allContacts = DatabaseConnection.getAllContract();
            for (Contract contract : allContacts) {
                String json = Converter.objectToJson(contract);
                byte[] response = json.getBytes();
                t.sendResponseHeaders(200, response.length);
                os.write(response);
            }
            os.close();
        }
    }
}


