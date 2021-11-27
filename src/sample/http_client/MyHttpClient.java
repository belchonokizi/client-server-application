package sample.http_client;

import org.apache.http.client.fluent.Content;
import org.apache.http.client.fluent.Request;
import sample.entity.Contract;
import sample.http_server.MyHttpServer;
import sample.util.Converter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyHttpClient {
    private static final String URI = "http://localhost:8080/contracts";

    public static List<Contract> getContent() {
        Content getResult;
        List<Contract> contracts = new ArrayList<>();

        try {
            MyHttpServer.startServer();
            getResult = Request.Get(URI)
                    .execute().returnContent();
            String jsonObject = getResult.asString();
            Contract contract = Converter.jsonToObject(jsonObject);
            contracts.add(contract);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contracts;
    }

}
