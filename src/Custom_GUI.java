
import gui_fields.*;
import gui_main.GUI;

import java.awt.Color;

import java.awt.*;
import java.util.Scanner;

public class Custom_GUI {

    public static GUI customgui;
    public static GUI_Field[] fields = new GUI_Field[12];
    public static GUI_Player player1;
    public static GUI_Player player2;

    public Custom_GUI(){
        //Game startup added as a constructor for the class
        customgui = new GUI(customFieldFactory(), new Color(102,255,102));
        String playername1 = customgui.getUserString("Enter name of player 1");
        String car1color = customgui.getUserSelection("Choose the color of your car","Blue","Red");
        GUI_Car car1 = new GUI_Car();
        GUI_Car car2 = new GUI_Car();
        if(car1color.contains("Red")){
            car1.setPrimaryColor(Color.RED);
            car2.setPrimaryColor(Color.BLUE);
        }else{
            car1.setPrimaryColor(Color.BLUE);
            car2.setPrimaryColor(Color.RED);
        }
        player1 = new GUI_Player(playername1, 1000, car1);
        customgui.addPlayer(player1);
        fields[0].setCar(player1, true);
        String playername2 = customgui.getUserString("Enter name of player 2:");
        player2 = new GUI_Player(playername2, 1000, car2);
        customgui.addPlayer(player2);
        fields[0].setCar(player2, true);
    }
    public static GUI_Field[] customFieldFactory(){
        int i = 0;
        fields[i++] = new GUI_Street("Start","","","",Color.WHITE, Color.black);
        fields[i++] = new GUI_Street("Tower", "Gain 250", "", "250", new Color(51,255,255), Color.BLACK);
        fields[i++] = new GUI_Street("Crater", "Loose 100", "", "-100", Color.RED, Color.BLACK);
        fields[i++] = new GUI_Street("Palace", "Gain 100", "", "100", new Color(51,255,255), Color.BLACK);
        fields[i++] = new GUI_Street("Cold Desert", "Loose 20", "", "-20", Color.RED, Color.BLACK);
        fields[i++] = new GUI_Street("Walled city ", "Gain 180", "", "180", new Color(51,255,255), Color.BLACK);
        fields[i++] = new GUI_Street("Monastery", "", "", "0", Color.GREEN, Color.BLACK);
        fields[i++] = new GUI_Street("Black cave", "Loose 70", "", "-70", Color.RED, Color.BLACK);
        fields[i++] = new GUI_Street("Huts in the mountain", "Gain 60", "", "60", new Color(51,255,255), Color.BLACK);
        fields[i++] = new GUI_Street("The Werewall", "Extra turn", "Loose 80 and get an extra turn", "-80", Color.RED, Color.BLACK);
        fields[i++] = new GUI_Street("The pit", "Loose 50", "", "-50", Color.RED, Color.BLACK);
        fields[i] = new GUI_Street("Goldmine", "Gain 650!", "", "650", new Color(255, 215, 0), Color.BLACK);
        return fields;
    }
    public static void moveCar(int field, GUI_Player player){
        fields[0].setCar(player, false);
        fields[field].setCar(player, true);
        customgui.showMessage("Player moved to " + (field + 1));
    }
    public static void resetBoard(){
        for (int i = 0; i < fields.length; i++) {
            fields[i].setCar(player1, false);
            fields[i].setCar(player2,false);
        }
        fields[0].setCar(player1, true);
        fields[0].setCar(player2, true);
    }

    public static GUI_Player getPlayer1() {
        return player1;
    }
    public static GUI_Player getPlayer2() {
        return player2;
    }
}
