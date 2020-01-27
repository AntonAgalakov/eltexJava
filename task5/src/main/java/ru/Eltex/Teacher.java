package ru.Eltex;

import java.util.ArrayList;

public class Teacher extends User {
    private ArrayList<String> interests = new ArrayList<String>();
    Department my = new Department();

    public void setInterest(String interest) {
        interests.add(interest);
    }
    public int getCountInterest() {
        return interests.size();
    }
    public String getInterest(int n) {
        return interests.get(n);
    }
    public void setDepartment(String title) {
        my.setTitle(title);
    }
    public String getDepartment() {
        return my.getTitle();
    }
    public String getInterests() {
        StringBuilder all = null;
        if(getCountInterest() > 1){
            all = new StringBuilder(getInterest(0));
            for(int i = 1; i < getCountInterest(); i++)
                all.append(' ').append(getInterest(i));
        } else if (getCountInterest() == 1)
            return getInterest(0);
        else
            return all.toString();
        return all.toString();
    }
}
