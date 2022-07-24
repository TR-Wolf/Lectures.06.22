public class Chef {
    private double cookingSpeed;

    public Chef() {
        cookingSpeed = 1.0;
    }

    public Chef(double cookingSpeed) {
        this.cookingSpeed = cookingSpeed;
    }

    public void fryBurger(){
        System.out.println("Sponge Bob: Alright Squidward! It's on the grill!");
        int cookTime = (int)(15000/cookingSpeed);
        try {
            Thread.sleep(cookTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Sponge Bob: The burger is ready!");
    }
}
