public class AsterixAndObelix {
    public static void main(String[] args) {
        int asterixPreparesApotion = 3;
        int potionPreparationTime = 5;
        int obelixPreparesApotion = potionPreparationTime - asterixPreparesApotion;
        int timeTogether = obelixPreparesApotion + asterixPreparesApotion;
        boolean cooking = (potionPreparationTime == timeTogether);
        System.out.println(cooking);


        // boolean doesItTakeTimeToCookAsterix = (potionPreparationTime == asterixPreparesApotion);
        // System.out.println(doesItTakeTimeToCookAsterix);
        // double obelixPreparesApotion = (potionPreparationTime/2.0);
        //
//
        // boolean doesItTakeTimeToCookObelix =(potionPreparationTime == obelixPreparesApotion);
        // System.out.println(doesItTakeTimeToCookObelix);


    }
}
