package main_study.the_08_14.linkedlistEx;

public class SingleLinkedListEx<T> {
    public Node<T> head = null;

    public  class Node<T>{
        T data;
        Node<T> next = null;
        public  Node(T data){
            this.data = data;
        }

    }
    public void addNone(T data){
        if (head == null){
            head = new Node<T>(data);
        }else{
            Node<T> node = this.head;
            while (node.next != null){
                node =node.next;
            }
        }
    }

}
