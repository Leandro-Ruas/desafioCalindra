package com.calindra.crm.feign;

import java.util.List;

public class EnderecoResponse {
    private List<Results> results;

    public List<Results> getResults() {
        return results;
    }

    @Override
    public String toString() {
        return "EnderecoResponse{" +
                "results=" + results +
                '}';
    }
}
