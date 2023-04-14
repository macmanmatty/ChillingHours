package com.chillinghours.Trees;

import org.springframework.beans.factory.annotation.Autowired;

public class TreeService {

    private TreeRepository treeRepository;

    public TreeService(
            @Autowired
                    TreeRepository treeRepository) {
        this.treeRepository = treeRepository;
    }

    public FruitTree getTree(int id){

        FruitTree tree=treeRepository.getOne(id);
        return tree;
    }

    public FruitTree updateTree(FruitTree tree){

       tree= treeRepository.save(tree);
        return tree;
    }

    public FruitTree addTree(FruitTree tree){

        tree= treeRepository.save(tree);
        return tree;
    }

    public void deleteTree(FruitTree tree){

     treeRepository.delete(tree);
        return;
    }

}
