package com.mcodes;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee billEnd = new Employee("Bill", "End", 78);

        Map<String, Employee> hashMap = new HashMap<>();
        hashMap.put("Jones", janeJones);
        hashMap.put("Doe", johnDoe);
        hashMap.put("Smith", marySmith);

        hashMap.putIfAbsent("Doe", billEnd); // Wont overwrite John Doe
        System.out.println(hashMap.getOrDefault("test", johnDoe)); // Return john if key 'test' isn't found
        System.out.println(hashMap.remove("Doe"));

        for (String employee : hashMap.keySet()) {
            System.out.println("Key = " + employee + ", Employee = " + hashMap.get(employee));
        }


    }
}
