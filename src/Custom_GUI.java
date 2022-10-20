
import gui_fields.*;
import gui_main.GUI;

import java.awt.Color;

import java.awt.*;
import java.util.Scanner;

public class Custom_GUI {
    public GUI Customgui;

    public static GUI_Field[] customFieldFactory(){
        GUI_Field[] fields = new GUI_Field[12];
        int i = 0;
        fields[i++] = new GUI_Street("Start","","","",Color.WHITE, Color.black);
        fields[i++] = new GUI_Street("Tower", "", "", "250", new Color(51,255,255), Color.BLACK);
        fields[i++] = new GUI_Street("Crater", "Loose 80", "", "-100", Color.RED, Color.BLACK);
        fields[i++] = new GUI_Street("Palace", "", "ad", "100", new Color(51,255,255), Color.BLACK);
        fields[i++] = new GUI_Street("Cold Desert", "Loose 80", "", "-20", Color.RED, Color.BLACK);
        fields[i++] = new GUI_Street("Walled city ", "", "", "180", new Color(51,255,255), Color.BLACK);
        fields[i++] = new GUI_Street("Monastery", "", "", "0", Color.GREEN, Color.BLACK);
        fields[i++] = new GUI_Street("Black cave", "Loose 80", "", "-70", Color.RED, Color.BLACK);
        fields[i++] = new GUI_Street("Huts in the mountain", "", "", "60", new Color(51,255,255), Color.BLACK);
        fields[i++] = new GUI_Street("The Werewall", "Extra turn", "Loose 80", "-80", Color.RED, Color.BLACK);
        fields[i++] = new GUI_Street("The pit", "Loose 80", "", "-50", Color.RED, Color.BLACK);
        fields[i] = new GUI_Street("Goldmine", "", "", "650", new Color(255, 215, 0), Color.BLACK);
        return fields;
    }

  //  public GUI_Board makeCustomBoard{
  //      Customgui = new GUI(fields, Color.WHITE);
  //  }

    public static void main(String[] args) {
        GUI custom = new GUI(customFieldFactory(), new Color(102,255,102));
        String playername1 = custom.getUserString("Enter name of player 1");
        String car1color = custom.getUserSelection("Choose the color of your car","Blue","Red");
        GUI_Car car1 = new GUI_Car();
        GUI_Car car2 = new GUI_Car();
        if(car1color.contains("Red")){
            car1.setPrimaryColor(Color.RED);
            car2.setPrimaryColor(Color.BLUE);
        }else{
            car1.setPrimaryColor(Color.BLUE);
            car2.setPrimaryColor(Color.RED);
        }
        GUI_Player player1 = new GUI_Player(playername1, 0, car1);
        custom.addPlayer(player1);
        String playername2 = custom.getUserString("Enter name of player 2:");
        GUI_Player player2 = new GUI_Player(playername2, 0, car2);
        custom.addPlayer(player2);

    }
}
