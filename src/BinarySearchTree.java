public class BinarySearchTree {
    Node root;

    public boolean insert(int value){
        Node newNode = new Node(value);
        if (root==null){
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true){
            if (newNode.value == temp.value){
                return false;
            }
            if (newNode.value> temp.value){
                //move right
                if (temp.right==null){
                    temp.right=newNode;
                    return true;
                }
                temp=temp.right;
            }else {
                //move left
                if (temp.left == null){
                    temp.left=newNode;
                    return true;
                }
                temp=temp.left;
            }
        }
    }
    public boolean contains(int value){
        if (root==null) return false;
        Node temp = root;
        while (temp!=null){
            if (value > temp.value){
                //move right
                temp=temp.right;
            }else if (value < temp.value){
                //move left
                temp=temp.left;
            }else{
                if(value == temp.value)
                    return true;
            }

        }

        return false;
    }


    class Node {
        Node left;
        Node right;
        int value;

        Node(int value){
            this.value = value;
        }

    }

}
