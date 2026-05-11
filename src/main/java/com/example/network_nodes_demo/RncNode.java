package com.example.network_nodes_demo;

public class RncNode extends Node {

    private Integer uraCount;

    public RncNode(Long id, String name, String vendor, String location, Integer uraCount) {
        super(id, name, vendor, location);
        this.uraCount = uraCount;
    }

    public Integer getUraCount() {
        return uraCount;
    }

    public void setUraCount(Integer uraCount) {
        this.uraCount = uraCount;
    }
}
