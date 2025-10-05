/// werid way to link objects and stuff
class AA{
   int data = 10;
   AA newObjofAA = null;
}
class BB{
  int data = 30;
  BB newObjofBB = null;

  void displayBB_output(){
      System.out.println("this is a data "+30);
    }
}
class CC{
    int data = 40;
    CC newObjofCC = null;
    BB insideObjoffCC_BB = new BB();//we create one for bb inside cc class
}
public class LinkOfLists {
    public static void main(String[] args){
            AA newObjofAA = new AA(); // you can create objects of newObjofAA (newObjofAA != newObjofAA.newObjofAA(i mean the one side the class))
            CC newObjofCC = new CC(); // same here like normal newObjofAA (newObjofBB != newObjofAA.newObjofBB(i mean the one side the class))

            newObjofAA.data = 2033;

            AA newObjofAAnewinstance = new AA();
            newObjofAAnewinstance.data=200;

             System.out.println(newObjofAA);
             System.out.println(newObjofAA.newObjofAA);

            newObjofAA.newObjofAA = newObjofAAnewinstance; // you can do this
            System.out.println(newObjofAA.data); //2033
            System.out.println(newObjofAA.newObjofAA.data); //200  essentially you same name kinda


        CC newObjectCC = new CC();
        System.out.println(newObjectCC.data); //40
        //created BB instance in CC already
        System.out.println(newObjectCC.insideObjoffCC_BB.data); //30
        newObjectCC.insideObjoffCC_BB.displayBB_output(); //this is a data 30  bascially 30 

    }
}
