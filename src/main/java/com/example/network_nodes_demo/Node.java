package com.example.network_nodes_demo;

public class Node {

    private Long id;
    private String name;
    private String vendor;
    private String location;

    public Node(Long id, String name, String vendor, String location) {
        this.id = id;
        this.name = name;
        this.vendor = vendor;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
