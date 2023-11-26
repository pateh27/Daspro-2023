package minggu13;

public class Perocobaan5_19 {
    public static void main(String[] args){
        printValues("Numbers;", 1,2,3,4);
        printValues("Strings:","A","B","C","D");
    }
    public static void printValues(String label, Object... values){
        System.out.println(label+ " ");

        for (Object value : values) {
            System.out.println(value+ " ");
        }
        System.out.println();
    }
    
         
}