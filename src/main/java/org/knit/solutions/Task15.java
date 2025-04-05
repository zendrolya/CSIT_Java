package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.lab2_5.task15.ImageProxy;
import org.knit.solutions.lab2_5.task15.Image;

@TaskDescription(taskNumber = 15, taskDescription = "Задача 15 на паттерн Прокси (Proxy)", href = "org.knit.solutions.task15")
public class Task15 implements Solution {
    @Override
    public void execute() {
        System.out.println("Создаем прокси для изображений...");
        Image image1 = new ImageProxy("nature.jpg");
        Image image2 = new ImageProxy("city.jpg");
        Image image3 = new ImageProxy("deer.jpg");
        Image image4 = new ImageProxy("sky.jpg");
        Image image5 = new ImageProxy("space.jpg");

        System.out.println("Прокси созданы!\n");

        image1.display();
        image1.display();
        image2.display();
        image2.display();
        image3.display();
        image3.display();
        image4.display();
        image4.display();
        image5.display();
        image5.display();
    }
}