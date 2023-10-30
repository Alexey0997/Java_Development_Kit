# Java_Development_Kit
## Урок 1. Графические интерфейсы
1.	Выполнить все задания семинара, если они не были решены, без ограничений по времени;
2.	Собрать графический интерфейс проекта месседжера (скриншоты можно посмотреть в материалах к уроку)
3.	Отправлять сообщения из текстового поля сообщения в лог по нажатию кнопки или по нажатию клавиши Enter на поле ввода сообщения;
4.	Продублировать импровизированный лог (историю) чата в файле;
5.	При запуске клиента чата заполнять поле истории из файла, если он существует. Обратите внимание, что чаще всего история сообщений хранится на сервере и заполнение истории чата лучше делать при соединении с сервером, а не при открытии окна клиента.

## Урок 2. Программные интерфейсы
На семинаре работали с проектом https://github.com/Liberate520/jdk_server_lesson1/tree/master

Изменили клиентскую часть проекта с учетом интерфейсов и получили https://github.com/Liberate520/jdk_server_lesson2/tree/master

Задача исправить аналогичным образом серверную часть проекта, выделить интерфейсы. 

## Урок 3. Обобщенное программирование
1.	Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа (но необязательно разного между собой), над которыми должна быть произведена операция.
2.	Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного типа.
3.	Напишите обобщенный класс Pair, который представляет собой пару значений разного типа. Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары, а также переопределение метода toString(), возвращающее строковое представление пары.

## Урок 4. Коллекции
Необходимо создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
-	табельный номер;
-	номер телефона;
-	имя;
-	стаж.

Добавить методы:
-	поиска сотрудника по стажу (может быть список);
-	вывода номера телефона сотрудника по имени (может быть список).
-	поиска сотрудника по табельному номеру;
-	добавления нового сотрудника в справочник.
