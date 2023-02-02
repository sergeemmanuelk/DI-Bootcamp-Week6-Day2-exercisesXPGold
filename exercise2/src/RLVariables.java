public class RLVariables {
    // Declare local variable here
    private int mySecretNumber = 10;
    public void displaySecret(){
        int mySecretNumber = 45;
        RLVariables secret = new RLVariables();
        System.out.println("Reference variable accessing instance variable: " + secret.mySecretNumber);
        System.out.println("Local Variable: " + mySecretNumber);
        secret.mySecretNumber = mySecretNumber;
        System.out.println("Reference variable accessing instance variable that points to the local variable: " + secret.mySecretNumber);
    }
}
