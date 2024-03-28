package hw_22;

public class Puffendui extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Puffendui(String name, int power, int transgression,  int industriousness, int loyalty, int honesty) {
        super(name, power, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() + ", Pufengui : " + " industriousness - " + getIndustriousness() + ", loyalty - " +
                getLoyalty() + ", honesty - " + getHonesty();
    }
    public  String compare(Puffendui name1, Puffendui name2) {
        int sum1 = name1.getIndustriousness() + name1.getLoyalty() + name1.getHonesty();
        int sum2 = name2.getIndustriousness() + name2.getLoyalty() + name2.getHonesty();
        if (sum1 > sum2) {
            return name1.getName() + " лучший студент Пуффендуя, чем " + name2.getName();
        } else if (sum1 < sum2){
            return name2.getName() + " лучший студент Пуффендуя, чем " + name1.getName();
        }else {
            return  name1.getName() + " и " + name2.getName() + " равны между собой по успеваемости в Пуффендуе.";
        }

    }
}
