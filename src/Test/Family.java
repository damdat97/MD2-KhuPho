package Test;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private List<Person> personList;
    private String address;
    private int member = 0;

    public Family(List<Person> personList, String address) {
        this.personList = personList;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMember() {
        return member;
    }

    public void setMember(int member) {
        this.member = member;
    }

    public Family() {
        this.personList = new ArrayList<>();
    }

    public Family(List<Person> personList) {
        this.personList = personList;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public void add(Person person){
        personList.add(person);
        member++;
    }

    public void display()  {
        boolean check = false;
        for (Person e: personList) {
            System.out.println(e);
            check = true;
        }
        if (check) {
            System.out.println("Address: " + getAddress() + ", members: " + getMember());
        } else {
            System.out.println("Chua co thanh vien nao");
        }
        System.out.println("----------");
    }

    public int findById(String id) {
        for (int i = 0; i < this.personList.size(); i++) {
            if (this.personList.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

    public void delete(String id) {
        this.personList.remove(findById(id));
        member--;
    }

    public void edit(String id, Person person) {
        this.personList.set(findById(id), person);
    }

    @Override
    public String toString() {
        return  personList +
                "\nAddress: " + getAddress() +
                ", members: " + member +
                ".";
    }
}
