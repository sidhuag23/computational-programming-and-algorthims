class Test_new_node{
    int number;

 //method has an object in it 
    void testObject(Test_new_node T){
        System.out.println("initatied object"+T.number);
    }
}

public class TestNewLink {
    public static void main(String[] args){
        Test_new_node x = new Test_new_node();
        x.number = 10;
        Test_new_node y = new Test_new_node();
        y.number = 20;
        Test_new_node z = new Test_new_node();
        z.number = 30;
        
        Test_new_node z1 = new Test_new_node();
        Test_new_node z2 = new Test_new_node();
        
        z1.testObject(z2);
        
        z.testObject(y);
        z.testObject(x);
        z.testObject(z);

    }
}
