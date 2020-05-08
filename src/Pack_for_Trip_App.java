import java.util.ArrayList;
import java.util.Scanner;

public class Pack_for_Trip_App {
    public static void main(String[] args) {

        String addMore = "yes";
        Closet closet = new Closet();
        Suitcase newSuitcase;
        Jacket newJacket;
        Shirt newShirt;
        Pants newPant;
        Footwear newFootwear;
        ArrayList<Suitcase> listOfSuitcase = new ArrayList<>();
        ArrayList<Jacket> listOfJackets;
        ArrayList<Shirt> listOfJShirts;
        ArrayList<Pants> listOfPants;
        ArrayList<Footwear> listOfFootWares;
        Scanner in = new Scanner(System.in);

        while (addMore.equalsIgnoreCase("yes")){
            newSuitcase = new Suitcase();
            listOfJackets = new ArrayList<>();
            listOfJShirts = new ArrayList<>();
            listOfPants = new ArrayList<>();
            listOfFootWares = new ArrayList<>();
            System.out.println("-------------Welcome to trip Packer App------------");
            System.out.print("What's the name of the trip ? ");
            newSuitcase.setOccasionsName(in.nextLine());
            while (addMore.equalsIgnoreCase("yes")) {
                newJacket = new Jacket();
                System.out.print("What kind of jacket you want ? ");
                newJacket.setJacket(in.nextLine());
                System.out.print("What is your colour choice? ");
                newJacket.setColor(in.nextLine());
                System.out.print("What kind of material should be used for your Jacket ? ");
                newJacket.setMaterialMade(in.nextLine());
                listOfJackets.add(newJacket);
                System.out.println("Do you need to add another Jacket? (yes/no) ");
                addMore = in.nextLine();
            }
            addMore = "yes";
            newSuitcase.setJacket(listOfJackets);

            while (addMore.equalsIgnoreCase("yes")){
                newShirt = new Shirt();
                System.out.print("What kind of shirt you want for" + newSuitcase.getOccasionsName() + " ? ");
                newShirt.setShirt(in.nextLine());
                System.out.print("What kind of colour you want " + newShirt.getShirt() + " ? ");
                newShirt.setColor(in.nextLine());
                System.out.print("What kind of material you want for your " + newShirt.getShirt() + " ? ");
                newShirt.setMaterialMade(in.nextLine());
                listOfJShirts.add(newShirt);
                System.out.println("Do you need to add another Shirt? (yes/no) ");
                addMore = in.nextLine();
            }
            addMore = "yes";
            newSuitcase.setShirt(listOfJShirts);

            while (addMore.equalsIgnoreCase("yes")){
                newPant = new Pants();
                System.out.print("What kind of pant you want for" + newSuitcase.getOccasionsName() + " ? ");
                newPant.setPants(in.nextLine());
                System.out.print("What kind of colour you want " + newPant.getPants() + " ? ");
                newPant.setColor(in.nextLine());
                System.out.print("What kind of material you want for your " + newPant.getPants() + " ? ");
                newPant.setMaterialMade(in.nextLine());
                listOfPants.add(newPant);
                System.out.println("Do you need to add another pant? (yes/no) ");
                addMore = in.nextLine();
            }
            addMore = "yes";
            newSuitcase.setPant(listOfPants);

            while (addMore.equalsIgnoreCase("yes")){
                newFootwear = new Footwear();
                System.out.print("What kind of foot-ware you want for" + newSuitcase.getOccasionsName() + " ? ");
                newFootwear.setFootWare(in.nextLine());
                System.out.print("What kind of colour you want " + newFootwear.getFootWare() + " ? ");
                newFootwear.setColor(in.nextLine());
                System.out.print("What kind of material you want for your " + newFootwear.getFootWare() + " ? ");
                newFootwear.setMaterialMade(in.nextLine());
                listOfFootWares.add(newFootwear);
                System.out.println("Do you need to add another foot wear? (yes/no) ");
                addMore = in.nextLine();
            }
            newSuitcase.setFootWears(listOfFootWares);
            listOfSuitcase.add(newSuitcase);

            System.out.print("Do you want another suitcase for another trip ? ");
            addMore = in.nextLine();
        }
        closet.setListOfSuitcases(listOfSuitcase);
        closet.displaySuitcase();





    }
}
