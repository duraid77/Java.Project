package day55_abstraction_Exercise.flags;

import java.awt.*;

public class FlagDrawing {
    public static void main(String[] args) {
        Grid grid = new Grid();

        grid.setColor(0,0, Color.RED);

        for (int i = 0; i < grid.getHt(); i++) {
            grid.setColor(i,0 , Color.BLUE);

        }
        RusianFlag rusianFlag = new RusianFlag();
        rusianFlag.draw();

        FrenchFlag frenchFlag = new FrenchFlag();
        frenchFlag.draw();



        UkranianFlag ukranianFlag = new UkranianFlag();
        ukranianFlag.draw();

        IraqFlag iraqFlag = new IraqFlag();
        iraqFlag.draw();


    }
}
