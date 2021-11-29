package sample.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import sample.entity.Contract;

import java.io.IOException;
import java.util.List;

public class Converter {

    public static String objectToJson(Object object) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonObject = mapper.writeValueAsString(object);
        return jsonObject;
    }

    public static List<Contract> jsonToObject(String json) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Contract> contracts = mapper.readValue(json, new TypeReference<List<Contract>>() {});

        return contracts;
    }
}

