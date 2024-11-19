package com.app._19_11_2024;

import lombok.Getter;

import java.util.List;
import java.util.Map;
import java.util.Optional;

class StreamTask2 {

    @Getter
    static class Person {
        String name;
        int age;
        String city;
        String email;
        double salary;

        Person(String name, int age, String city, String email, double salary) {
            this.name = name;
            this.age = age;
            this.city = city;
            this.email = email;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + ", city='" + city + "', email='" + email + "', salary=" + salary + '}';
        }
    }

    // 1. Найти всех людей старше 20 лет и вернуть их имена в списке.
    public List<String> task1(List<Person> people) {
        return null;
    }

    // 2. Найти сумму возрастов всех людей, имя которых начинается с буквы 'A'.
    public int task2(List<Person> people) {
        return 0;
    }

    // 3. Получить список уникальных возрастов людей.
    public List<Integer> task3(List<Person> people) {
        return null;
    }

    // 4. Найти средний возраст людей младше 18 лет.
    public double task4(List<Person> people) {
        return 0;
    }

    // 7. Получить список имен всех людей, возраст которых делится на 3.
    public List<String> task7(List<Person> people) {
        return null;
    }


    // 9. Получить список имен людей, отсортированных в алфавитном порядке.
    public List<String> task9(List<Person> people) {
        return null;
    }

    // 10. Найти общую длину всех имен людей, старше 30 лет.
    public int task10(List<Person> people) {
        return 0;
    }

    // 11. Получить список людей, чьи имена короче 4 символов.
    public List<Person> task11(List<Person> people) {
        return null;
    }

    // 12. Найти самый длинный возраст человека.
    public int task12(List<Person> people) {
        return 0;
    }

    // 13. Получить список всех людей, отсортированных по длине имени.
    public List<Person> task13(List<Person> people) {
        return null;
    }

    // 14. Найти имя самого молодого человека.
    public String task14(List<Person> people) {
        return null;
    }

    // 15. Получить список возрастов людей, имена которых заканчиваются на 'n'.
    public List<Integer> task15(List<Person> people) {
        return null;
    }

    // 16. Найти общий возраст всех людей с уникальными именами.
    public int task16(List<Person> people) {
        return 0;
    }

    // 17. Получить список имен всех людей, отсортированных в обратном алфавитном порядке.
    public List<String> task17(List<Person> people) {
        return null;
    }

    // 18. Найти средний возраст людей, чьи имена состоят из 5 символов.
    public double task18(List<Person> people) {
        return 0;
    }

    // 19. Получить список имен людей, возраст которых кратен 5.
    public List<String> task19(List<Person> people) {
        return null;
    }

    // 20. Найти сумму длин всех имен людей, у которых возраст четный.
    public int task20(List<Person> people) {
        return 0;
    }

    // 21. Группировать людей по городу и находить максимальный возраст в каждой группе.
    public Map<String, Optional<Integer>> task21(List<Person> people) {
        return null;
    }

    // 22. Получить список людей, у которых зарплата больше 50000, отсортированных по убыванию зарплаты.
    public List<Person> task22(List<Person> people) {
        return null;
    }

    // 23. Найти город с наибольшим количеством людей старше 30 лет.
    public String task23(List<Person> people) {
        return null;
    }

    // 24. Группировать людей по первой букве имени и находить среднюю зарплату в каждой группе.
    public Map<Character, Double> task24(List<Person> people) {
        return null;
    }

    // 25. Найти человека с самой длинной электронной почтой в каждом городе.
    public Map<String, Optional<Person>> task25(List<Person> people) {
        return null;
    }

    // 27. Получить список имен людей с зарплатой больше 50,000 и возрастом меньше 30, отсортированных по возрасту.
    public List<String> task27(List<Person> people) {
        return null;
    }
}