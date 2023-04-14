package com.chillinghours.Trees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TreeController {

    private TreeService treeService;

    public TreeController(
            @Autowired
            TreeService treeService) {
        this.treeService = treeService;
    }

    @GetMapping("/tree/{id}")

    public FruitTree get(@RequestParam int id) {
        return treeService.getTree(id);
        
    }
    @PostMapping("/tree/add")

    public void  put(@RequestBody FruitTree tree) {
        treeService.addTree(tree);

    }

    @PostMapping("/tree/update")
    public void update(@RequestBody FruitTree tree) {
     treeService.updateTree(tree);
    }

    @DeleteMapping("/tree/delete")
    public void delete(@RequestBody FruitTree tree) {
        treeService.deleteTree(tree);
    }
}
