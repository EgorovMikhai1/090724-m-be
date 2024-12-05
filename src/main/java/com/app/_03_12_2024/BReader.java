package com.app._03_12_2024;

import com.app._03_12_2024.fileReader.SData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BReader {
    public List<SData> sDataList = new ArrayList<>();

    public void readFileAndSaveInList(String path){
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = null;

            while ((line = reader.readLine()) != null) {
                SData sData = createSDATA(line);
                sDataList.add(sData);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public double avgRating(List<SData> list) {
        return list.stream()
                .mapToInt(el -> (int) el.getValue())
                .average()
                .getAsDouble();
    }

    private SData createSDATA(String line) {
        //1: [Стрим 1], 4.0 => "1,4.0"

        return null;
    }
}