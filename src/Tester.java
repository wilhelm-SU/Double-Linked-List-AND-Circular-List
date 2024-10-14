public class Tester
{
    public static void main(String[] args){
        
        DaisyChainConnector test = new DaisyChainConnector();
        
        System.out.println("Add methods:");
        test.addBox(1);
        test.addBox(2);
        test.addBox(5);
        test.addBoxFront(4);
        test.addBoxAtIndex(12, 3);
        test.addBox(7);
        System.out.println(test.toString());
        
        System.out.println();
        System.out.println("Remove methods:");
        test.removeBoxEnd();
        test.removeBoxFront();
        test.removeBoxAtIndex(2);
        System.out.println(test.toString());
        
        System.out.println();
        System.out.println("Replace 5 with 3.");
        test.replace(3, 5);
        System.out.println(test.toString());
        
        System.out.println();
        System.out.println("Helper methods:");
        System.out.println("Number 2 index: " + test.getIndex(2));
        System.out.println("Size: " + test.getSize());
        System.out.println("Does it contain 1? " + test.contains(1));
        System.out.println("Does it contain 12? " + test.contains(12));
        System.out.println();
        System.out.println("Clearing the list:");
        test.clear();
        System.out.println(test.toString());
        

    }
}
