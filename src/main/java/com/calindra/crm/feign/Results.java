package com.calindra.crm.feign;

import java.util.List;

public class Results {
    private String formatted_address;
    private Geometry geometry;

    public String getFormatted_address() {
        return formatted_address;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    @Override
    public String toString() {
        return "Results{" +
                "formatted_address='" + formatted_address + '\'' +
                ", geometry=" + geometry +
                '}';
    }
}
