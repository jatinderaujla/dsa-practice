package com.jatinderaujla.datastructures.tree;

public class Tree<T> {

    private Node<T> root;
    static class Node<T>{
        private T data;
        private Node<T> left;
        private Node<T> right;

        public Node(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public T data(){
            return this.data;
        }
    }

    public void add(T value){
        root = addRecursively(root, value);
    }

    private Node<T> addRecursively(Node<T> current, T value){
        if(current == null){
            return new Node<>(value);
        }
        if(value instanceof Integer val){
            Integer data = (Integer) current.data;
            if(val < data){
                current.left = addRecursively(current.left, value);
            }else if(val > data){
                current.right = addRecursively(current.right, value);
            }else{
                return current;
            }
            return current;
        }
        throw new IllegalStateException("Data type not supported only Integer is allowed");
    }

    public void traverseInOrder(Node<T> node){
        if(node != null){
            traverseInOrder(node.left);
            if(node.data instanceof Integer val){
                System.out.println(val);
            }else{
                throw new IllegalStateException("Data type not supported only Integer is allowed");
            }
            traverseInOrder(node.right);
        }
    }

    public void traversePreOrder(Node<T> node){
        if(node != null){
            if(node.data instanceof Integer val){
                System.out.println(val);
            }else{
                throw new IllegalStateException("Data type not supported only Integer is allowed");
            }
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traversePostOrder(Node<T> node){
        if(node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            if(node.data instanceof Integer val){
                System.out.println(val);
            }else{
                throw new IllegalStateException("Data type not supported only Integer is allowed");
            }
        }
    }

    public Node<T> root(){
        return this.root;
    }

}
