package com.example.network_nodes_demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NodeService {

    private final NodeRepository repository;

    public NodeService(NodeRepository repository) {
        this.repository = repository;
    }

    public List<Node> getAllNodes() {
        return repository.findAll();
    }

    public Node getNodeById(Long id) {
        return repository.findById(id);
        }

    public Node addNode(Node node) {
        return repository.save(node);
    }
    // Samostalni zadatak
    public List<Node> getNodesByVendor(String vendor) {
        return repository.findByVendor(vendor);
    }
    // Dodatni dio
    public List<Node> getNodesByLocation(String location) {
        return repository.findByLocation(location);
    }
}

