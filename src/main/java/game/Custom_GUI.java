package game;

import gui_fields.*;
import gui_main.GUI;

import java.awt.Color;

public class Custom_GUI {
    // define static information. Made static and public as the GUI is unlikely to have commands conflicting with other classes.
    public static GUI customgui;
    public  static GUI_Field[] fields = new GUI_Field[13];
    public static GUI_Player player1;
    public static GUI_Player player2;

    // Starts the gameUI, and prompts the user to enter his/hers name, as well as setting their cars color.
    public void startGameGUI(){
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

    // define the playing fields
    public static GUI_Field[] customFieldFactory(){
        int i = 0;

        fields[i++] = new GUI_Street("Start", "", "", "-50", Color.WHITE, Color.BLACK);
        fields[i++] = new GUI_Street("Instant win\n   1","","","",Color.BLACK, Color.WHITE);
        fields[i++] = new GUI_Street("Tower\n   2", "Gain 250", "", "250", new Color(51,255,255), Color.BLACK);
        fields[i++] = new GUI_Street("Crater\n   3", "Loose 100", "", "-100", Color.RED, Color.BLACK);
        fields[i++] = new GUI_Street("Palace\n   4", "Gain 100", "", "100", new Color(51,255,255), Color.BLACK);
        fields[i++] = new GUI_Street("Cold Desert\n   5", "Loose 20", "", "-20", Color.RED, Color.BLACK);
        fields[i++] = new GUI_Street("Walled city\n   6", "Gain 180", "", "180", new Color(51,255,255), Color.BLACK);
        fields[i++] = new GUI_Street("Monastery\n   7", "", "", "0", Color.GREEN, Color.BLACK);
        fields[i++] = new GUI_Street("Black cave\n   8", "Loose 70", "", "-70", Color.RED, Color.BLACK);
        fields[i++] = new GUI_Street("Huts in the mountain\n   9", "Gain 60", "", "60", new Color(51,255,255), Color.BLACK);
        fields[i++] = new GUI_Street("The Werewall\n   10", "Extra turn", "Loose 80 and get an extra turn", "-80", Color.RED, Color.BLACK);
        fields[i++] = new GUI_Street("The pit\n   11", "Loose 50", "", "-50", Color.RED, Color.BLACK);
        fields[i] = new GUI_Street("Goldmine\n   12", "Gain 650!", "", "650", new Color(255, 215, 0), Color.BLACK);
        return fields;
    }
    public static void moveCar(int field, GUI_Player player){
        fields[0].setCar(player, false);
        fields[field].setCar(player, true);
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
