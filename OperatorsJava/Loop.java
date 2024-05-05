public class Loop {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            System.out.println("Looped " + (i+1) + " time");
        }
        int conditionForWhile = 0;
        while(conditionForWhile < 5){
            System.out.println("Inside while " + (conditionForWhile+1) + " time");
            conditionForWhile++;
        }
        int conditionForDoWhile = 0;
        do {
            System.out.println("Inside do while " + (conditionForDoWhile+1) + " time");
            conditionForDoWhile++;
        } while (conditionForDoWhile < 5);
    }
}
