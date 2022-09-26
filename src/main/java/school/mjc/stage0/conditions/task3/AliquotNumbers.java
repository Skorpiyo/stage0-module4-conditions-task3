package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        if(first<second){
            System.out.println("Aliquot");
        }if(first>second){
            System.out.println("Not aliquot");
        }
    }
}
