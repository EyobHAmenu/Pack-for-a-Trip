import java.util.ArrayList;

public class Suitcase {
    private String occasionsName;
    private ArrayList<Jacket> jacket;
    private ArrayList<Shirt> shirt;
    private ArrayList<Pants> pant;
    private ArrayList<Footwear> footWears;

    public Suitcase() {
    }

    public String getOccasionsName() {
        return occasionsName;
    }

    public void setOccasionsName(String occasionsName) {
        this.occasionsName = occasionsName;
    }

    public ArrayList<Jacket> getJacket() {
        return jacket;
    }

    public void setJacket(ArrayList<Jacket> jacket) {
        this.jacket = jacket;
    }

    public ArrayList<Shirt> getShirt() {
        return shirt;
    }

    public void setShirt(ArrayList<Shirt> shirt) {
        this.shirt = shirt;
    }

    public ArrayList<Pants> getPant() {
        return pant;
    }

    public void setPant(ArrayList<Pants> pant) {
        this.pant = pant;
    }

    public ArrayList<Footwear> getFootWears() {
        return footWears;
    }

    public void setFootWears(ArrayList<Footwear> footWears) {
        this.footWears = footWears;
    }
//    public void displaySuitcase(){
//        System.out.println("------------ List of different occasions suitcase---------------");
//        //for (Suitcase suit : suitcases){
//            System.out.println(getOccasionsName() + " Trip package.");
//            System.out.println("****Jackets.");
//            for (Jacket j : jacket){
//                System.out.println(j.getJacket() + ", " + j.getColor() + ", " + j.getMaterialMade());
//            }
//            System.out.println("****Shirts.");
//            for (Shirt s : shirt){
//                System.out.println(s.getShirt() + ", " + s.getColor() + ", " + s.getMaterialMade());
//            }
//            System.out.println("****Pants.");
//            for (Pants p : pant){
//                System.out.println(p.getPants() + ", " + p.getColor() + ", " + p.getMaterialMade());
//            }
//            System.out.println("****Foot Wears.");
//            for(Footwear f : footWears){
//                System.out.println(f.getFootWare() + ", " + f.getColor() + ", " + f.getMaterialMade());
//            }
//        //}
//
//    }
}
