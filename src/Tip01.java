public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's indivudlal total after tax(5%) and tip(15%)
        double tax = 0.05;
        double tip = 0.15;
        double personal = 10;
        double totall = personal*(1 +tax +tip);
        System.out.println("personal 1: " + totall);
        double person2 = 12;
        double total2 = person2*(1 +tax +tip);
        System.out.println("person 2: " + total2);
        double person3 = 9;
        double total3 = person3*(1 +tax +tip);
        System.out.println("person 3: " + total3);
        double person4 = 8;
        double total4 = person4*(1 +tax +tip);
        double person5 = 7;
        double total5 = person5*(1 +tax +tip);
        System.out.println("person 5: " + total5);
        double person6 = 15;
        double total6 = person6*(1 +tax +tip);
        System.out.println("person 6: " + total6);
        double person7 = 11;
        double total7 = person7*(1 +tax +tip);
        System.out.println("person 7: " + total7);
        double person8 = 30;
        double total8 = person8*(1 +tax +tip);
        System.out.println("person 8: " + total8);
        
        
        
        /*This is what everyone owes before tax and tip
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */
        
    }    
}
