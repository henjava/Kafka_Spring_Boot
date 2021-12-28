package com.example.kafkaspring1;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
public class RandoMessage
{
    @JsonProperty("messageTemplate")
    Map<String, String> fieldMessage = new HashMap<String, String>();

    @JsonProperty("randomizedFields")
    public List<HashMap<String,String>> randoMessage;

    public Map<String, String> getFieldMessage() {
        return fieldMessage;
    }

    public void setFieldMessage(Map<String, String> fieldMessage) {
        this.fieldMessage = fieldMessage;
    }

    public List<HashMap<String, String>> getRandoMessage() {
        return randoMessage;
    }

    public void setRandoMessage(List<HashMap<String, String>> randoMessage) {
        this.randoMessage = randoMessage;
    }
}
