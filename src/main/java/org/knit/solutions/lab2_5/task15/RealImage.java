package org.knit.solutions.lab2_5.task15;

class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromServer();
    }

    private void loadFromServer() {
        System.out.println("Загрузка изображения " + filename + " с сервера...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Изображение " + filename + " загружено!");
    }

    @Override
    public void display() {
        System.out.println("Отображение изображения: " + filename);
    }

    @Override
    public String getFilename() {
        return filename;
    }
}