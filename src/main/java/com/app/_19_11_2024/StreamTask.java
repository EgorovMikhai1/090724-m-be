package com.app._19_11_2024;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTask {
    public static void main(String[] args) {
        // Задача 3: Преобразование списков в строку и удаление повторяющихся символов
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("a", "b", "c"),
                Arrays.asList("d", "e", "f"),
                Arrays.asList("g", "h", "i")
        );

        String mergedString = listOfLists.stream()
                .flatMap(List::stream)
                .map(String::toUpperCase)
                .flatMapToInt(CharSequence::chars)
                .distinct()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        System.out.println("Объединенная строка: " + mergedString);

        // Задача 6: Получение уникальных символов из списка строк
        List<String> words2 = Arrays.asList("apple", "banana", "cherry", "date");
        Set<Character> uniqueChars = words2.stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toSet());
        System.out.println("Уникальные символы: " + uniqueChars);

        // Задача 8: Фильтрация длина больше 3 и собрать в лист 0 по 3 индекс
        List<String> words3 = Arrays.asList("apple", "banana", "cherry", "date");
        words3.stream()
                .filter(el -> el.length() > 3)
                .map(word -> word.substring(0, 3))
                .toList()
                .forEach(System.out::println);


        // Задача 10: Получение списка квадратов чисел
        List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5);

        // Задача 13: Поиск первой строки, начинающейся с буквы 'b' (findFirs())
        List<String> words6 = Arrays.asList("apple", "banana", "cherry", "date");

        // Задача 14: Сокращение списка до указанного размера (например 5)
        List<Integer> numbers6 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Задача 15: Объединение двух списков в один
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
    }
}