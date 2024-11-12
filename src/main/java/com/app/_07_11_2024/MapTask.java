package com.app._07_11_2024;

import java.util.*;
import java.util.stream.Collectors;

public class MapTask {
    public static void main(String[] args) {
        Map<String, Map<String, List<Integer>>> data = Map.of(
                "Country1", Map.of(
                        "Electronics", List.of(5, 8, 7),
                        "Clothing", List.of(6, 9)
                ),
                "Country2", Map.of(
                        "Food", List.of(3, 4),
                        "Electronics", List.of(8, 8, 9)
                )
        );


        Map<String, String> result = data.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        countryEntry -> countryEntry.getValue().entrySet().stream()
                                .max(Comparator.comparingDouble(categoryEntry ->
                                        categoryEntry.getValue().stream().mapToInt(Integer::intValue).average().orElse(0)))
                                .map(Map.Entry::getKey)
                                .orElse("No Categories")
                ));

        result.forEach((country, category) ->
                System.out.println("Country: " + country + ", Top Category: " + category)
        );
    }
}