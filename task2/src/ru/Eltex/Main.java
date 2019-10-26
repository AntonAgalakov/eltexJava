package ru.Eltex;

public class Main {

    public static void main(String[] args) {
        Student Egor = new Student();
        Egor.setId(10);
        Egor.setName("Egor");
        Egor.setPhone("80000000000");
        Egor.setGroup("I-32");
        Egor.setTicket(4);

        Teacher Alisa = new Teacher();
        Alisa.setId(11);
        Alisa.setName("Alisa");
        Alisa.setPhone("90000000000");
        Alisa.setDepartment("Computing Systems");
        Alisa.setInterets("Math");
        Alisa.setInterets("Read books");
        Alisa.setInterets("Walk");

        System.out.println("Name: " + Egor.getName());
        System.out.println("Id: " + Egor.getId());
        System.out.println("Phone: " + Egor.getPhone());
        System.out.println("Group: " + Egor.getGroup());
        System.out.println("Number of ticket: " + Egor.getTicket());

        System.out.println("Name: " + Alisa.getName());
        System.out.println("Id: " + Alisa.getId());
        System.out.println("Phone: " + Alisa.getPhone());
        System.out.println("Department: " + Alisa.getDepartment());
        System.out.print("Alisa's interests:");
        for (int i = 0; i < Alisa.getCountInterests(); i++)
            System.out.print(" " + Alisa.getInterets(i));
        System.out.print("\n");

    }
}