package com.yang.domain;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.Data;
import org.springframework.boot.context.properties.ConstructorBinding;

@Data

public class book {

    private int id;
    private String name;

    public book(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
