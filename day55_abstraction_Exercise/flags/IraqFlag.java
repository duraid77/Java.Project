package day55_abstraction_Exercise.flags;

import java.awt.*;

public class IraqFlag extends Flag{

    @Override
    public void draw() {
        Grid grid = new Grid();

        for(int col=0;col<grid.getWd();col++){
            for(int row=0;row<grid.getHt();row++){
                if(row<grid.getHt()/3 ){
                    grid.setColor(row, col, Color.RED);
                }else if(row<grid.getHt()/3*2){
                    grid.setColor(row, col, Color.WHITE);
                }else{
                    grid.setColor(row, col, Color.BLACK);
                }
            }
        }
        for(int col = 3 ; col< 19; col+= 6){
            grid.setColor(4, col-1, Color.GREEN);
            grid.setColor(4, col, Color.GREEN);
            grid.setColor(4, col+1, Color.GREEN);

        }
        for(int col = 3 ; col< 19; col+= 6){
            grid.setColor(3, col, Color.GREEN);

            grid.setColor(5, col, Color.GREEN);

        }

    }
}
