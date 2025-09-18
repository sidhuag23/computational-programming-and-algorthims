class NodeData {
    int number;
    NodeData nextnode;

    NodeData(int number) {
        this.number = number;
        nextnode = null;
    }
}
    class LinkedListN{

        NodeData head;
        NodeData tail;

        void insertData(int data_input){
            NodeData mainLink = new NodeData(data_input);
            if(head == null){
                head = mainLink;
                tail = mainLink;
            }else{
                tail.nextnode = mainLink;
                tail=tail.nextnode;

            }
        }
        void DeleteData(int target){
              if(head == null){
                  return;
              }
              if(head.number==target){
                  head = head.nextnode;
                  return;
              }
               NodeData currrent_head;
              currrent_head = head;
              while(currrent_head.nextnode!=null){
                  if(currrent_head.nextnode.number==target){
                      currrent_head.nextnode=currrent_head.nextnode.nextnode;
                  }
              }

        }
        void printall(){
            NodeData temp_trav;
            temp_trav = head;
            while(temp_trav!=null){
                System.out.println(temp_trav.number);
                temp_trav=temp_trav.nextnode;
            }
        }
    }



public class LinkedList_new_insertions {
    public static void main(String [] args){
        LinkedListN x = new LinkedListN();
        x.insertData(10);
        x.insertData(20);
        x.insertData(40);
        x.insertData(50);
        x.DeleteData(10);
        x.printall();

    }
}
