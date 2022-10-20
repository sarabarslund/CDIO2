
import gui_fields.GUI_Board;
import gui_fields.GUI_Player;
import gui_fields.GUI_Street;
import gui_main.GUI;
import gui_fields.GUI_Field;
import java.awt.Color;

import java.awt.*;

public class Custom_GUI {
    public GUI Customgui;

    public static GUI_Field[] customFieldFactory(){
        GUI_Field[] fields = new GUI_Field[11];
        int i = 0;
        fields[i++] = new GUI_Street("Tower", "", "", "250", Color.BLUE, Color.BLACK);
        fields[i++] = new GUI_Street("Crater", "", "", "-100", Color.RED, Color.BLACK);
        fields[i++] = new GUI_Street("Palace", "", "", "100", Color.BLUE, Color.BLACK);
        fields[i++] = new GUI_Street("Cold Desert", "", "", "-20", Color.RED, Color.BLACK);
        fields[i++] = new GUI_Street("Walled city ", "", "", "180", Color.BLUE, Color.BLACK);
        fields[i++] = new GUI_Street("Monastery", "", "", "0", Color.GREEN, Color.BLACK);
        fields[i++] = new GUI_Street("Black cave", "", "", "-70", Color.RED, Color.BLACK);
        fields[i++] = new GUI_Street("Huts in the mountain", "", "", "60", Color.BLUE, Color.BLACK);
        fields[i++] = new GUI_Street("The Werewall (werewolf-wall)", "Extra turn", "", "-80", Color.RED, Color.BLACK);
        fields[i++] = new GUI_Street("The pit", "", "", "-50", Color.RED, Color.BLACK);
        fields[i] = new GUI_Street("Goldmine", "", "", "650", new Color(255, 215, 0), Color.BLACK);
        return fields;
    }

  //  public GUI_Board makeCustomBoard{
  //      Customgui = new GUI(fields, Color.WHITE);
  //  }

    public static void main(String[] args) {
        GUI custom = new GUI(customFieldFactory(), Color.WHITE);
        GUI_Player player1 = new GUI_Player("Brian", 0);
        GUI_Player player2 = new GUI_Player("Mike", 0);
        custom.addPlayer(player1);
        custom.addPlayer(player2);

    }
}
