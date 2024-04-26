package org.example;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TreeNode {
    private int value;
    private List<TreeNode> children;

    public TreeNode(int valueParam){
        this.value = valueParam;
        children = new ArrayList<>();
    }
}

