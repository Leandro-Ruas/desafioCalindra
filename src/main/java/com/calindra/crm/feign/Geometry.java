package com.calindra.crm.feign;

import java.util.List;

public class Geometry {

    private Location location;

    public Location getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Geometry{" +
                "location=" + location +
                '}';
    }
}
