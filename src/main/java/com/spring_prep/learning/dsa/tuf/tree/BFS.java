package com.spring_prep.learning.dsa.tuf.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public List<List<Integer>> levelOrder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new LinkedList<>();
        if(root == null){
            return ans;
        }
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> levelArray = new LinkedList<>();
            for (int i = 0; i < levelSize; i++) {
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                levelArray.add(queue.poll().val);
            }
            ans.add(levelArray);
        }
        return ans;
    }






}
