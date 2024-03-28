package hw_22;

public class Slizerin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int authority;

    public Slizerin(String name, int power, int transgression,  int cunning, int determination, int ambition,
                    int resourcefulness, int authority) {
        super(name, power, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.authority = authority;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getAuthority() {
        return authority;
    }

    public void setAuthority(int authority) {
        this.authority = authority;
    }

    @Override
    public String toString() {
        return super.toString() + ", hw_22.Slizerin : " + " cunning - " + getCunning() + ", determinasion - "
                + getDetermination() + ", ambition - " + getAmbition() + ", resourcefulness - " +
                getResourcefulness() + ", autority - " + getAuthority();
    }
    public  String compare(Slizerin name1, Slizerin name2) {
        int sum1 = name1.getCunning() + name1.getDetermination() + name1.getAmbition() + name1.getResourcefulness() +
                name1.getAuthority();
        int sum2 = name2.getCunning() + name2.getDetermination() + name2.getAmbition() + name2.getResourcefulness() +
                name2.getAuthority();
        if (sum1 > sum2) {
            return name1.getName() + " лучший студент Слизерина, чем " + name2.getName();
        } else if (sum1 < sum2){
            return name2.getName() + " лучший студент Слизерина, чем " + name1.getName();
        }else {
            return  name1.getName() + " и " + name2.getName() + " равны между собой по успеваемости в Слизерине.";
        }

    }

}
