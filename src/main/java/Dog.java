public class Dog implements Tradable, Domesticatable{

    /**
     *
     * @return the sound that the dog makes
     */
    @Override
    public String sound() {
        return "woof!";
    }

    /**
     *
     * @return the price of the dog
     */
    @Override
    public int getPrice() {
        return 1000;
    }
}
