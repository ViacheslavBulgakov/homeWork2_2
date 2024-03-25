public class Hogwarts {

    private int power;
    private int transgression;
    private String name;

    public Hogwarts(String name, int power, int transgression) {
        this.name = name;
        this.power = power;
        this.transgression = transgression;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName() + ", power - " + getPower() + ", transgresion - " + getTransgression();
    }

    public static String compareCapacity(Hogwarts name1, Hogwarts name2) {
        int sum1 = name1.getPower() + name1.getTransgression();
        int sum2 = name2.getPower() + name2.getTransgression();
        if (sum1 > sum2) {
            return name1.getName() + " обладает большей мощностью магии, чем " + name2.getName();
        } else if (sum1 < sum2) {
            return name2.getName() + " обладает большей мощностью магии, чем " + name1.getName();
        } else {
            return name1.getName() + " и " + name2.getName() + " обладают равной мощностью магии.";
        }

    }

}

