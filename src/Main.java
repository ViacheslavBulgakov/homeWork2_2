public class Main {
    public static void main(String[] args) {

        System.out.println();

        Griffindor griffindor1 = new Griffindor ("Gary Poter", 15, 14, 15, 14, 13);
        System.out.println(griffindor1);
        Griffindor griffindor2 = new Griffindor("Germiona Greindger", 6,7,8,9,10);
        System.out.println(griffindor2);
        Griffindor griffindor3 = new Griffindor("Ron Uizly", 11,12,13,14,15);
        System.out.println(griffindor3);
        Slizerin slizerin1 = new Slizerin("Drako Malfoi", 16,17,18,19,20,21,22);
        System.out.println(slizerin1);
        Slizerin slizerin2 = new Slizerin("Grehem Montegu",23,24,25,25,27,28,29);
        System.out.println(slizerin2);
        Slizerin slizerin3 = new Slizerin("Gregory Goil",30,31,32,33,34,35,36);
        System.out.println(slizerin3);
        Puffendui puffendui1 = new Puffendui("Zaharia Smit",37,38,39,40,41);
        System.out.println(puffendui1);
        Puffendui puffendui2 = new Puffendui("Sederic Diggory",42,43,44,45,46);
        System.out.println(puffendui2);
        Puffendui puffendui3 = new Puffendui("Dgastin Fint-Fletchly",47,48,49,50,51);
        System.out.println(puffendui3);
        Kogtevran kogtevran1 = new Kogtevran("Chgou Chang",47,48,49,50,51,52);
        System.out.println(kogtevran1);
        Kogtevran kogtevran2 = new Kogtevran("Padma Patil",53,54,55,56,57,58);
        System.out.println(kogtevran2);
        Kogtevran kogtevran3 = new Kogtevran("Markus Belby",59,60,61,62,63,64);
        System.out.println(kogtevran3);

        System.out.println();

        System.out.println(Griffindor.compare(griffindor3,griffindor1));
        System.out.println(Slizerin.compare(slizerin1,slizerin3));
        System.out.println(Puffendui.compare(puffendui1,puffendui3));
        System.out.println(Kogtevran.compare(kogtevran3,kogtevran1));

        System.out.println();

        System.out.println(Hogwarts.compareCapacity(griffindor2,kogtevran1));

    }
}