package com.app._03_12_2024.fileReader;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx {
    public static void main(String[] args) throws IOException, RuntimeException {

        String s = "Eyewitnesses said it fell onto adjacent homes, " +
                "which is where most of the victims are thought " +
                "to have been. It is not known how many people are still under the debris.";

        try (FileWriter writer = new FileWriter("E:\\222.txt")) {
            for (int i = 0; i < s.length(); i++) {
                writer.write(s.charAt(i));
            }
            System.out.println("DONE");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}