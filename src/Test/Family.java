package Test;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private List<Person> personList;
    private String address;
    private int size = 0;

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

    public Family() {
        this.personList = new ArrayList<>();
    }

    public Family(List<Person> personList) {
        this.personList = personList;
    }

    public List<Person> getAll() {
        return this.personList;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public void add(Person person){
        personList.add(person);
    }

    public void display()  {
        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i));
        }
        System.out.println("---------");
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
    }

    public void edit(String id, Person person) {
        this.personList.set(findById(id), person);
    }

}
