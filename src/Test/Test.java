package Test;

public class Test {
    public static void main(String[] args) {
        Family family1 = new Family();
        family1.add(new Person("Dat", 19, "Nong dan", "1234"));
        family1.add(new Person("Dat1", 20, "Nong dan 1", "12345"));
        family1.add(new Person("Dat2", 21, "Nong dan 2", "123456"));
        family1.add(new Person("Dat3", 22, "Nong dan 3", "1234567"));
        family1.add(new Person("Dat4", 23, "Nong dan 4", "12345678"));
        family1.setAddress("So 1, Ha noi");
        family1.display();
        System.out.print("Vi tri cua Dat: ");
        System.out.print(family1.findById("1234"));
        System.out.println("\nDuoi Dat ra khoi 'Ho gia dinh'");
        family1.delete("1234");
        System.out.println("\nDat da khong con trong 'Ho gia dinh'.");
        family1.display();
        System.out.println("Them Dat5 vao 'Ho gia dinh'");
        family1.edit("123456", new Person("Dat5",24, "Nong dan 5", "123321"));
        family1.display();

        Town town = new Town();
        town.addFamily(family1);
        town.displayFamily();
        System.out.println("Xoa ho gia dinh");
        town.deleteFamily();
        town.displayFamily();

        Family family2 = new Family();
        family2.add(new Person("1Dat", 19, "Tho xay", "1"));
        family2.add(new Person("2Dat", 20, "Tho xay 1", "11"));
        family2.add(new Person("3Dat", 21, "Tho xay 2", "111"));
        family2.add(new Person("4Dat", 22, "Tho xay 3", "1111"));
        family2.add(new Person("5Dat", 23, "Tho xay 4", "11111"));
        family2.setAddress("So 2, Ha noi");

        town.addFamily(family1);
        town.addFamily(family2);
        town.displayFamily();
    }
}
