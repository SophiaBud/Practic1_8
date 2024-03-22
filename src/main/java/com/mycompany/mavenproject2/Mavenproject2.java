package com.mycompany.mavenproject2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Iterator;

public class Mavenproject2 {

    public static void main(String[] args) {
        System.out.println("Practical task 1.8, Student Budrik Sophia, RIBO-04-22, Variant 4");
    
        ArrayList<Passport1> passports = new ArrayList<>(); //создание списка паспортов
        passports.add(new Passport1("Иванов Иван Иванович",550000, "Менеджер",  false));
        passports.add(new Passport1("Смирнов Антон Владимирович",550001, "Повар",  true));
        passports.add(new Passport1("Сидоров Владимир Игоревич",550010, "Уборщик",  false));
        passports.add(new Passport1("Капустин Игорь Андреевич",550011, "Начальник",  true));
        passports.add(new Passport1("Иванов Андрей Антонович", 550100, "Бухалтер", false));
        
        
        Scanner scan = new Scanner (System.in); // ввод данных паспорта
        System.out.println ("Please, enter full name:");
        String value = scan.nextLine () ;
        System.out.println ("Please, enter occupation:");
        String value2 = scan.nextLine () ;
        System.out.println ("Please, enter pass number:");
        int value1 = scan.nextInt () ;
        System.out.println ("Please, enter pass mark:");
        Boolean value3 = scan.nextBoolean () ;
        System.out.println("");
        
        Iterator<Passport1> iterator = passports.iterator(); // проверка существования номера пропуска
        while (iterator.hasNext()) {
            Passport1 remover = iterator.next();
            if (value1 == remover.getPassNumber() && !value.equals(remover.getFullName())) {
                iterator.remove();
            }
        }
        
        
        passports.add(new Passport1(value,value1,value2,value3)); // добавление введеных данных а список
    
        
        passports.stream().sorted(Comparator.comparingInt(Passport1::getPassNumber)).forEach(System.out::println); //вывод списка отсортированого по ФИО
        System.out.println("");
        passports.stream().sorted(Comparator.comparing(Passport1::getFullName)).forEach(System.out::println); //вывод списка отсортированого по пропускам
        
    }   
}
