package com.restful.api;

import com.restful.api.dummy.DummyDataSet;
import com.restful.dbc.ExampleDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class APIController {

    @RequestMapping(method = RequestMethod.GET, path = API.NAME_OF_API + "/{id}")
    public @ResponseBody Map<String, Object> getExamples(@PathVariable(value="id") int id) {
        System.out.println("controlled");
        ExampleDTO dummy = DummyDataSet.dummies.get(id);

        return dummy.toJson();
    }

}
