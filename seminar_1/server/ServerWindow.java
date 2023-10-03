package ru.geekbrains.seminar_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Задача: Создать простейшее окно управления сервером (по сути, любым),
 * содержащее две кнопки (JButton) – запустить сервер и остановить сервер.
 * Кнопки должны просто логировать нажатие (имитировать запуск и остановку
 * сервера, соответственно) и выставлять внутри интерфейса соответствующее
 * булево isServerWorking.
 */


/**
 * ServerWindow - класс, наследующий JFrame, предназначенный для создания окна управления сервером.
 */
public class ServerWindow extends JFrame {
    private static final int POS_X = 1000;                 // Положение окна по горизнтали.
    private static final int POS_Y = 100;                  // Положение окна по вертикали.
    private static final int WIDTH = 500;                  // Ширина окна.
    private static final int HEIGHT = 200;                 // Высота окна.

    private final JTextArea log = new JTextArea();         // Создадим экземпляр текстового поля для отображения текста.
    private boolean isServerWorking;                       // Введем переменную, обозначающую состояние сервера.

    /**
     * Точка входа в приложение, создающая экземпляр класса ServerWindow.
     * @param args
     */
    public static void main(String[] args){
        new ServerWindow();
    }


    /**
     * ServerWindow - класс, имитирующий запуск и остановку серевера, в зависимости от нажатой кнопки на окне.
     */
    private ServerWindow(){
        isServerWorking = false;                            // Сервер выключен.
        JButton btnStop = new JButton("Stop");         // Создаем кнопку "Стоп".
        btnStop.addActionListener(new ActionListener() {    // Добавим слушателя событий к кнопке btnStop.
            @Override
            public void actionPerformed(ActionEvent e) {
                isServerWorking = false;
                System.out.println("Server stopped " + isServerWorking + "\n");
            }
        });

        //
        JButton btnStart = new JButton("Start");       // Создаем кнопку "Старт".
        btnStart.addActionListener(new ActionListener() {  // Добавим слушателя событий к кнопке btnStart.
            @Override
            public void actionPerformed(ActionEvent e) {
                isServerWorking = true;                    // Сервер включен.
                System.out.println("Serever started " + isServerWorking + "\n");
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);          // Введем действие по умолчанию для закрытия окна.
        setBounds(POS_X, POS_Y, WIDTH, HEIGHT);           // Установим границы и размер компонента.
        setResizable(false);                              // Сделаем окно не изменяемым по размеру.
        setTitle("Chat server");                          // Определим заголовок для окна.
        setAlwaysOnTop(true);                             // Сделаем окно поверх других окон.
        setLayout(new GridLayout(1,2));         // Расп. компоненты в виде таблицы с 1 строкой и 2 столбцами.
        add(btnStart);                                    // Добавим на окно кнопку "Старт".
        add(btnStop);                                     // Добавим на окно кнопку "Стоп".

        setVisible(true);                                 // Сделаем окно видимым.
    }
}
