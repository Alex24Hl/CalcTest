# CalcTest

## **Исходные данные:**

В архиве с материалами лекции находится папка CalcTest. Это Maven проект, написанный на языке Java. По пути ../CalcTest/src/main/java/calc/ находится класс Calculator. У него есть четыре метода вычисления:

- - *division(String a, String b)**. Принимает на вход два числа "a" и "b" типа String. Возвращает результат их деления типа Double.
- - **sum(String a, String b)**. Принимает на вход два числа "a" и "b" типа String. Возвращает результат их суммы типа Double.
- - **difference(String a, String b)**. Принимает на вход два числа "a" и "b" типа String. Возвращает результат их разности типа Double.
- - **multiplication(String a, String b)**. Принимает на вход два числа "a" и "b" типа String. Возвращает результат их перемножения типа Double.

Методы сопровождены Java Doc описанием, включая ожидаемые Exceptions при работе с ними.

Округление результата ожидается максимум до 16 знаков после запятой.

## **Задание:**

1. Продумать и сформировать необходимый и достаточный набор тестовых данных для проверки методов вычисления класса Calculator в формате: "Число 1", "Число 2", "Ожидаемый результат". Наборы могут отличаться для тестирования каждой из функций.
2. Продумать и реализовать структуру тестового фреймворка внутри проекта CalcTest. Несколько автотестов (в самом простом виде) на проверку суммы уже написаны в классе SumTest.java по пути ../CalcTest/src/test/java/com/stc/tests/ с использованием фреймворка TestNG. Фреймворк должен обладать следующими особенностями:
    - Использование DataProviders;
    - DataProviders должны быть расположены в отдельных классах от автотестов;
    - Запуск всех тестов на модуль должен выполняться через подготовленный testing.xml;
    - Структура файла testing.xml со списком тестов должна реализовывать принцип – общий <suite> на тестируемый модуль и по блоку <test> на каждую из его фич;
    - Должен быть выделен Smoke тест или набор тестов, который выполняется перед каждым из блоков-фич <test> в testing.xml и в случае падения основные тесты фичи не запускаются (статус Ignore);
    - Автотесты на проверку появления ожидаемых Exceptions должны быть реализованы через механизм expectedExceptions (атрибут аннотации @Test);
    - При падении автотеста на проверке утверждения (Asserts) у нас должно быть читабельное понятное сообщение, о том что мы делали и что случилось;
    - Желательно не дублировать код в автотестах, а пользоваться механизмом @Before и @After для различного вида SetUp и TearDown;
3. Написать автотесты по подготовленным наборам внутри проекта CalcTest.

Готовое задание прислать в виде архива с проектом CalcTest.
