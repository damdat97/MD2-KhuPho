package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Town extends Family {
    private List<Family> familyList;

    public Town() {
        this.familyList = new ArrayList<>();
    }

    public void addFamily(Family family){
        familyList.add(family);
    }

    public void displayFamily() {
        for (Family family: familyList) {
            System.out.println("--Family:-- ");
            family.display();
        }
        System.out.println("-------");
    }

    public void delete(int index) {
        familyList.remove(index - 1);
    }

    public void sortByMembers() {
        Collections.sort(familyList);
    }

    public void displayMaxMembers() {
        int max = familyList.get(0).getMember();
        for (Family family: familyList) {
            if (family.getMember() > max) {
                max = family.getMember();
                System.out.println(max);
            }
        }
    }
}
