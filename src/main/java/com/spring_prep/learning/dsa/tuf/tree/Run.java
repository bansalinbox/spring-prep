package com.spring_prep.learning.dsa.tuf.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Run {

    public static void main(String[] args) {
    }

    // Recursive
    static List<Integer> ans = new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        calculate(root);
        return ans;
    }

    void calculate(TreeNode root){
        if(root != null){
            ans.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    // Stack
    public static void usingStack(TreeNode root){
        if(root != null) {
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);

            while (stack.size() > 0){
                TreeNode node = stack.pop();
                ans.add(node.val);
                if(node.right != null){
                    stack.push(node.right);
                }
                if(node.left != null){
                    stack.push(node.left );
                }
            }
        }
    }
}
