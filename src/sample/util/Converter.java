package sample.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import sample.entity.Contract;

import java.io.IOException;

public class Converter {

    private static final String BASE_FILE = "contract.json";

    public static String objectToJson(Object object) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonObject = mapper.writeValueAsString(object);
        return jsonObject;
    }

    public static Contract jsonToObject(String json) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Contract contract = mapper.readValue(json, Contract.class);
        return contract;
    }
}
