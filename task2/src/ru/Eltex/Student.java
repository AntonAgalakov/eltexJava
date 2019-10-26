package ru.Eltex;

public class Student extends User {
    private int ticket;
    private String group;

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public int getTicket() {
        return ticket;
    }
    public String getGroup() {
        return group;
    }
}
