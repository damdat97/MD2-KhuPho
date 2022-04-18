package Test;

public class Test {
    public static void main(String[] args) {
        Family family = new Family();
        family.add(new Person("Dat", 19, "Nong dan", "1234"));
        family.add(new Person("Dat1", 20, "Nong dan 1", "12345"));
        family.add(new Person("Dat2", 21, "Nong dan 2", "123456"));
        family.add(new Person("Dat3", 22, "Nong dan 3", "1234567"));
        family.add(new Person("Dat4", 23, "Nong dan 4", "12345678"));
        family.display();
        System.out.print("Vi tri cua Dat: ");
        System.out.print(family.findById("1234"));
        System.out.println("\nDuoi Dat ra khoi 'Ho gia dinh'");
        family.delete("1234");
        System.out.println("\nDat da khong con trong 'Ho gia dinh'.");
        family.display();
        System.out.println("Them Dat5 vao 'Ho gia dinh'");
        family.edit("123456", new Person("Dat5",24, "Nong dan 5", "123321"));
        family.display();
    }
}
