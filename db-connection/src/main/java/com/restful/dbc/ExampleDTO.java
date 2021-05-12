package com.restful.dbc;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
public class ExampleDTO {

    private String name;
    private int age;

    public Map<String, Object> toJson() {
        Map<String, Object> json = new HashMap<>();

        json.put("name", name);
        json.put("age", age);

        return json;
    }

}
