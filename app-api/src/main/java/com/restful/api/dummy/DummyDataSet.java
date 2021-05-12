package com.restful.api.dummy;

import com.restful.dbc.ExampleDTO;

import java.util.ArrayList;
import java.util.List;

public class DummyDataSet {

    public static List<ExampleDTO> dummies = new ArrayList<>();

    static {
        ExampleDTO example1 = new ExampleDTO();
        ExampleDTO example2 = new ExampleDTO();
        ExampleDTO example3 = new ExampleDTO();

        example1.setName("Nam");
        example1.setAge(22);

        example2.setName("John");
        example2.setAge(24);

        example3.setName("Park");
        example3.setAge(18);

        dummies.add(example1);
        dummies.add(example2);
        dummies.add(example3);
    }

}
