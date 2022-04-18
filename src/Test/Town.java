package Test;

import java.util.ArrayList;
import java.util.List;

public class Town {
    private List<Family> familyList;

    public Town() {
        this.familyList = new ArrayList<>();
    }

    public void addFamily(Family family){
        familyList.add(family);
    }

    public void displayFamily() {
        System.out.println("Family: ");
        boolean check = false;
        for (Family e: familyList) {
            System.out.println(e);
            check = true;
        }
        System.out.println("---------");
    }

    public void deleteFamily() {
        familyList.removeAll(familyList);
    }

}
