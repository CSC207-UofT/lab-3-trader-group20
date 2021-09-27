public class Dog implements Tradable, Domesticatable{

    /**
     *
     * @return a string
     */
    @Override
    public String sound() {
        return "woof!";
    }

    /**
     *
     * @return an integer
     */
    @Override
    public int getPrice() {
        return 1000;
    }
}
