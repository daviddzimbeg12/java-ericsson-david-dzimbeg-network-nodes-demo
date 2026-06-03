package com.example.network_nodes_demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/nodes")
public class NodeController {

    private final NodeService service;

    public NodeController(NodeService service) {
        this.service = service;
    }

    // GET /nodes
    @GetMapping
    public List<Node> getAllNodes() {
        return service.getAllNodes();
    }


    // GET /nodes/{id}
    @GetMapping("/{id}")
    public ResponseEntity<Node> getNodeById(@PathVariable Long id) {

        Node node = service.getNodeById(id);

        if (node == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(node);
    }

    @PostMapping
    public Node addNode(@RequestBody Node node) {
        return service.addNode(node);
    }

    // Samostalni zadatak
    @GetMapping("/vendor/{vendor}")
    public List<Node> getNodesByVendor(@PathVariable String vendor) {
        return service.getNodesByVendor(vendor);
    }

    // Dodatni dio
    @GetMapping("/location/{location}")
    public List<Node> getNodesByLocation(@PathVariable String location) {
        return service.getNodesByLocation(location);
    }
}
