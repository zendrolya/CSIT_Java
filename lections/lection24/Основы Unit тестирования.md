Хорошо! Переходим к следующему пункту:

---

### **2. Основы Unit тестирования**

#### **2.1. Что такое Unit тестирование?**
Unit тестирование (Модульное тестирование) — это процесс проверки отдельных модулей или компонентов программы на предмет их корректного функционирования. Обычно это проверка **отдельных методов, классов или функций** в изоляции от остального кода.

**Цель:** Убедиться, что каждый компонент работает правильно **сам по себе**, независимо от других.

---

#### **2.2. Принципы написания Unit тестов**
При написании Unit тестов необходимо придерживаться определённых принципов:

1. **Изоляция:**
    - Каждый тест должен проверять только один конкретный аспект функциональности.
    - Не должно быть зависимости от внешних систем (базы данных, сети и т.п.).

2. **Автоматизация:**
    - Тесты должны быть легко запускаемыми и выполняться автоматически.
    - Интеграция с системами CI/CD.

3. **Повторяемость:**
    - Тесты должны давать один и тот же результат при каждом запуске, независимо от внешних факторов.

4. **Скорость:**
    - Тесты должны выполняться быстро, чтобы можно было запускать их часто.

5. **Независимость:**
    - Порядок выполнения тестов не должен влиять на их результаты.

---

#### **2.3. Структура Unit теста (AAA - Arrange, Act, Assert)**
Принято разделять написание тестов на три этапа:

1. **Arrange (Подготовка):**
    - Настройка всех необходимых объектов и данных для проведения теста.
    - Например, создание экземпляра класса, который будет тестироваться.

2. **Act (Выполнение):**
    - Вызов метода или функции, которую требуется протестировать.
    - Выполнение основной операции, результат которой будет проверяться.

3. **Assert (Проверка):**
    - Проверка того, что результат соответствует ожидаемому.
    - Использование методов утверждения (assert) для сравнения ожидаемого и фактического результатов.

---

#### **2.4. Критерии хороших Unit тестов**
Хороший Unit тест должен обладать следующими характеристиками:

1. **Изолированность:**
    - Тест проверяет один метод или класс, независимо от других компонентов.

2. **Повторяемость:**
    - При каждом запуске должен давать одинаковый результат.

3. **Независимость:**
    - Порядок выполнения тестов не должен влиять на результат.

4. **Удобочитаемость:**
    - Код теста должен быть простым и легко читаемым.
    - Названия методов тестов должны быть самодокументирующимися (например, `testAddReturnsCorrectSum`).

5. **Проверка всех возможных случаев:**
    - Учитывать как стандартные, так и крайние (ошибочные) случаи.

6. **Минимизация мокирования:**
    - Использование моков должно быть оправданным и не превышать разумных пределов.

---