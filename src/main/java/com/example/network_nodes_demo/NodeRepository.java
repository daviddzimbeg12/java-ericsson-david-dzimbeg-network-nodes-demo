package com.example.network_nodes_demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class NodeRepository {

    private final List<Node> nodes = new ArrayList<>();

    public NodeRepository() {

        nodes.add(new BscNode(
                1L,
                "BSC_ZG_01",
                "Ericsson",
                "Zagreb",
                101
        ));

        nodes.add(new RncNode(
                2L,
                "RNC_ST_01",
                "Huawei",
                "Split",
                24
        ));

        nodes.add(new BasebandNode(
                3L,
                "BB_RI_01",
                "Nokia",
                "Rijeka",
                "BB6630"
        ));
    }

    public List<Node> findAll() {
        return nodes;
    }

    public Node findById(Long id) {
        return nodes.stream()
                .filter(node -> node.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Node save(Node node) {
        nodes.add(node);
        return node;
    }

    // Samostalni zadatak
    public List<Node> findByVendor(String vendor) {

        return nodes.stream()
                .filter(node -> node.getVendor().equalsIgnoreCase(vendor))
                .toList();
    }

   // Dodatni dio
   public List<Node> findByLocation(String location) {
        return nodes.stream()
            .filter(node -> node.getLocation().equalsIgnoreCase(location))
            .toList();
    }
}
