### node linked list in java 
### linked list uses something called self - referintial class 


class NodeTest{
    String name = "test";
    NodeTest myNextNode;  ### self referenital class 
}
public class TestNode {
    public static  void main(String[] args){

        NodeTest test1 = new NodeTest();
        NodeTest test2 = new NodeTest();
        NodeTest test3 = new NodeTest();
        NodeTest test4 = new NodeTest();
        NodeTest test5 = new NodeTest();
        NodeTest test6 = new NodeTest();
        NodeTest test7 = new NodeTest();


        test1.name = "node1";
        test2.name = "node2";
        test3.name = "node3";
        test4.name = "node4";
        test5.name = "node5";
        test6.name = "node6";
        test7.name = "node7";

        test1.myNextNode=test2;
        test2.myNextNode=test3;
        test3.myNextNode=test4;
        test4.myNextNode=test5;
        test5.myNextNode=test6;
        test6.myNextNode=test7;
        test7.myNextNode=test1;


        System.out.println(test1.name);
        System.out.println(test1.myNextNode.name);
        System.out.println(test1.myNextNode.myNextNode.name);
        System.out.println(test1.myNextNode.myNextNode.myNextNode.name);
        System.out.println(test1.myNextNode.myNextNode.myNextNode.myNextNode.name);

        System.out.println("-----------done----------");
        System.out.println(test7.myNextNode.name);
        System.out.println(test7.myNextNode.myNextNode.name);
        System.out.println(test7.myNextNode.myNextNode.myNextNode.name);
        System.out.println("-------------------------");

        System.out.println(test2.name);
        System.out.println(test2.myNextNode.name);

    }
}
