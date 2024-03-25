import java.util.Objects;

public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, int power, int transgression, int nobility, int honor, int bravery) {
        super(name, power, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString() + ", Grifindor : " +
                " nobility - " + getNobility() + ", honor - " + getHonor() + ", bravery - " + getBravery();
    }

    public static String compare(Griffindor name1, Griffindor name2) {
        int sum1 = name1.getNobility() + name1.getHonor() + name1.getBravery();
        int sum2 = name2.getNobility() + name2.getHonor() + name2.getBravery();
        if (sum1 > sum2) {
            return name1.getName() + " лучший Гриффиндорец, чем " + name2.getName();
        } else if (sum1 < sum2){
            return name2.getName() + " лучший Гриффиндорец, чем " + name1.getName();
        } else {
            return  name1.getName() + " и " + name2.getName() + " равны между собой по успеваемости в Гриффиндоре.";
        }

    }

}
