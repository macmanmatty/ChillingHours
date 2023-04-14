package com.chillinghours.User;

import com.chillinghours.Trees.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    private UserRepository userRepository;

    public UserService(
            @Autowired
                    UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getTree(int id){
        User tree= userRepository.getOne(id);
        return tree;
    }

    public User updateTree(User tree){
       tree= userRepository.save(tree);
        return tree;
    }

    public User addTree(User tree){
        tree= userRepository.save(tree);
        return tree;
    }

    public void deleteTree(User tree){
     userRepository.delete(tree);
        return;
    }

}
