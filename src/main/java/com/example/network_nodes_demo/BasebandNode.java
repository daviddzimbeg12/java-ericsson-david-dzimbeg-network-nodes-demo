package com.example.network_nodes_demo;

public class BasebandNode extends Node {

    private String boardType;

    public BasebandNode(Long id, String name, String vendor, String location, String boardType) {
        super(id, name, vendor, location);
        this.boardType = boardType;
    }

    public String getBoardType() {
        return boardType;
    }

    public void setBoardType(String boardType) {
        this.boardType = boardType;
    }
}
