package com.example.network_nodes_demo;

public class BscNode extends Node {

    private Integer lac;

    public BscNode(Long id, String name, String vendor, String location, Integer lac) {
        super(id, name, vendor, location);
        this.lac = lac;
    }

    public Integer getLac() {
        return lac;
    }

    public void setLac(Integer lac) {
        this.lac = lac;
    }
}
