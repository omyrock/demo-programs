package com.example.demo.service.Immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class Immutable {
   private final  String name;
   private final List<String> address;

    public String getName() {
        return name;
    }

    public List<String> getAddress() {
        return Collections.unmodifiableList(address);
    }

    Immutable(String name, List<String> address) {
        this.name = name;
        // defensive copy
        this.address = new ArrayList<>(address);
    }
}
