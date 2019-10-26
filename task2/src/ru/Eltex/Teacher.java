package ru.Eltex;
import java.util.ArrayList;

public class Teacher extends User {
    private ArrayList<String> interests = new ArrayList<String>();
    Department my = new Department();

    public void setInterets(String interest) {
        interests.add(interest);
    }
    public int getCountInterests() {
        return interests.size();
    }
    public String getInterets(int n) {
        return interests.get(n);
    }
    public void setDepartment(String title) {
        my.setTitle(title);
    }
    public String getDepartment() {
        return my.getTitle();
    }
}
