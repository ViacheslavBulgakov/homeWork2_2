package hw_22;

public class Kogtevran extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Kogtevran(String name, int power, int transgression,  int mind, int wisdom, int wit, int creativity) {
        super(name, power, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return super.toString() + ", hw_22.Kogtevran : " + " mind - " + getMind() + ", wisdom - " + getWisdom() +
                ", wit - " + getWit() + ", creativity - " + getCreativity();
    }
    public  String compare(Kogtevran name1, Kogtevran name2) {
        int sum1 = name1.getMind() + name1.getWisdom() + name1.getWit() + name1.getCreativity();
        int sum2 = name2.getMind() + name2.getWisdom() + name2.getWit() + name2.getCreativity();
        if (sum1 > sum2) {
            return name1.getName() + " лучший студент Когтеврана, чем " + name2.getName();
        } else if (sum1 < sum2){
            return name2.getName() + " лучший студент Когтеврана, чем " + name1.getName();
        }else {
            return  name1.getName() + " и " + name2.getName() + " равны между собой по успеваемости в Когтевране.";
        }

    }

}
