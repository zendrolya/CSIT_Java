## ✅ **Задача 14 на паттерн Визитер (Visitor)**
**Задача:**  
Создайте систему управления **файловыми объектами**.  
Есть три типа файловых объектов:
- **Файлы**,
- **Папки**,
- **Ссылки (ярлыки)**.

Требуется реализовать два посетителя:
1. **Сканер вирусов**, который проверяет каждый файл на наличие вирусов.
2. **Анализатор размера**, который подсчитывает общий размер файлов (ссылки не учитываются).

📌 **Подсказка:**  
Каждый файл, папка и ссылка должны реализовывать интерфейс `FileSystemElement`. В `accept()` методе вызывается соответствующий метод визитера.

---

## ✅ **Задача 15 на паттерн Прокси (Proxy)**
**Задача:**  
Создайте **удаленную библиотеку изображений**.
- При запросе изображения оно загружается с сервера (имитация через задержку в коде).
- Картинка хранится как объект класса `RealImage`.
- **Прокси-объект `ImageProxy`** должен лениво загружать изображение и кэшировать его для повторного использования.

📌 **Подсказка:**  
`ImageProxy` должен проверять, создан ли объект `RealImage`. Если нет — создавать его.

---

## ✅ **Задача 16 на паттерн Приспособленец (Flyweight)**
**Задача:**  
Реализуйте **систему отображения символов текста на экране**.
- Каждый символ (`Character`) имеет **внутреннее состояние** (код символа) и **внешнее состояние** (координаты x, y и стиль).
- Используйте **Фабрику приспособленцев**, чтобы повторно использовать объекты символов и уменьшить количество объектов, создаваемых в системе.

📌 **Подсказка:**  
Внешнее состояние передается в метод `render()`, а внутреннее хранится внутри объектов, создаваемых фабрикой.

