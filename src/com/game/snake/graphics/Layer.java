package com.game.snake.graphics;

import com.game.snake.objects.Room;
import com.game.snake.objects.SnakeSection;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * @author Koliadin Nikita
 * @version 1.1
 * <p>This class is Graphic class</p>
 */
public class Layer extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(java.awt.Color.GREEN); //Задаем цвет элементов зеленый
//        g.fillRect(Room.game.getWidth() * 10, 0, 10, (Room.game.getWidth() * 10) + 10);  //Рисуем прямоугольник показывающий край поля справа
//        g.fillRect(0, Room.game.getHeight() * 10, (Room.game.getHeight() * 10) + 10, 10); //Рисуем прямоугольник показывающий край поля снизу

        g.fillRect(Room.game.getMouse().getX()*10, Room.game.getMouse().getY()*10, 10, 10); //Рисуем прямоугольник показывающий мышь

        List<SnakeSection> getSection = Room.game.getSnake().getSections(); //Получаем секции змейки
        for (int i = 0; i < getSection.size(); i++) {
            g.fillRect(getSection.get(i).getX()*10, getSection.get(i).getY()*10, 10, 10); //Рисуем по очереди секции змейки
        }
    }
}