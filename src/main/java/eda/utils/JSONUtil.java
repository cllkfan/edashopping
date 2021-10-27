package eda.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONUtil<T> {
    public String JsonToString(int code, String message, T data) {
        ResponseEntity<T> responseEntity = new ResponseEntity<>();
        responseEntity.setCode(code);
        responseEntity.setMessage(message);
        responseEntity.setData(data);

        ObjectMapper objectMapper = new ObjectMapper();
        String result = "";

        try {
            result = objectMapper.writeValueAsString(responseEntity);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return result;
    }
}
