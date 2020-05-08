import java.util.ArrayList;

public class Closet {
    private ArrayList<Suitcase> listOfSuitcases;

    public Closet() {
    }

    public ArrayList<Suitcase> getListOfSuitcases() {
        return listOfSuitcases;
    }

    public void setListOfSuitcases(ArrayList<Suitcase> listOfSuitcases) {
        this.listOfSuitcases = listOfSuitcases;
    }
    public void displaySuitcase(){
        System.out.println("------------ List of different occasions suitcase---------------");
        for (Suitcase suit : listOfSuitcases){
            System.out.println(suit.getOccasionsName());
            System.out.println("****Jackets.");
            for (Jacket j : suit.getJacket()){
                System.out.println(j.getJacket() + ", " + j.getColor() + ", " + j.getMaterialMade());
            }
            System.out.println("****Shirts.");
            for (Shirt s : suit.getShirt()){
                System.out.println(s.getShirt() + ", " + s.getColor() + ", " + s.getMaterialMade());
            }
            System.out.println("****Pants.");
            for (Pants p : suit.getPant()){
                System.out.println(p.getPants() + ", " + p.getColor() + ", " + p.getMaterialMade());
            }
            System.out.println("****Foot Wears.");
            for(Footwear f : suit.getFootWears()){
                System.out.println(f.getFootWare() + ", " + f.getColor() + ", " + f.getMaterialMade());
            }
        }

    }
}
