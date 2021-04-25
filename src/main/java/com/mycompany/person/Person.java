package com.mycompany.person;

/**
 *класс задающий преставление о фио человека
 */
public class Person {
    private String name = "";
    private String surname = "";
    private String fatherName = "";
    
    public Person(String surname, String name, String fatherName) {
        this.name = name;
        this.surname = surname;
        this.fatherName = fatherName;       
    } 
    
    // метод превращающий полное фио в фамилию плюс инициалы
    //для того чтоб не создавать новые объекты во время конкатенации строк
    //используем класс StringBuilder
    public String fio() {
        StringBuilder result = new StringBuilder();
        result.append(surname);
        if (name.equals("")) {
            return result.toString();
        }
        else {
            result.append(" ").append(name.charAt(0)).append("."); 
        }
        
        if (fatherName.equals("")) {
            return result.toString();
        }
        else {
            result.append(" ").append(fatherName.charAt(0)).append("."); 
        }
        return result.toString();
    }
}
