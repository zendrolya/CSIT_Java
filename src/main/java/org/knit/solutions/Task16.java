package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.lab2_5.task16.CharacterFactory;
import org.knit.solutions.lab2_5.task16.SpecificCharacter;

@TaskDescription(taskNumber = 16, taskDescription = "Задача 16 на паттерн Приспособленец (Flyweight)", href = "org.knit.solutions.task15")
public class Task16 implements Solution {
    @Override
    public void execute() {
        String text = "Hello, World!";
        String style = "p {font: 'Times New Roman'; font size: 14;}";

        System.out.println("Рендерим текст: " + text);
        System.out.println("Размер кэша символов до рендеринга: " + CharacterFactory.getCacheSize());

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            SpecificCharacter character = CharacterFactory.getCharacter(c);
            character.render(i * 10, 0, style);
        }

        System.out.println("Размер кэша символов после рендеринга: " + CharacterFactory.getCacheSize());

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            SpecificCharacter character = CharacterFactory.getCharacter(c);
            character.render(i * 15, 20, "p {font: 'Arial'; font size: 12;}"); // другие параметры
        }

        System.out.println("Размер кэша символов: " + CharacterFactory.getCacheSize());
    }
}