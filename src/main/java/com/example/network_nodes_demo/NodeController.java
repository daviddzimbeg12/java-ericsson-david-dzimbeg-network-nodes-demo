package com.example.network_nodes_demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nodes")
public class NodeController {

    private final NodeRepository repository = new NodeRepository();

    // GET /nodes
    @GetMapping
    public List<Node> getAllNodes() {
        return repository.findAll();
    }

    // GET /nodes/{id}
    @GetMapping("/{id}")
    public ResponseEntity<Node> getNodeById(@PathVariable Long id) {

        Node node = repository.findById(id);

        if (node == null) {
            return ResponseEntity.notFound().build(); // 404
        }

        return ResponseEntity.ok(node); // 200 + JSON
    }
}
