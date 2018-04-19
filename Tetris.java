import java.lang.Math;
/**
 * Tetris class to be completed for Tetris project
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tetris implements ArrowListener
{
    public static void main(String[] args)
    {
        Tetris tetris = new Tetris();
        tetris.play();
    }

    private BoundedGrid<Block> grid;
    private BlockDisplay display;
    private Tetrad activeTetrad;
    private ArrowListener listener;
    public Tetris()
    {
        grid = new BoundedGrid<Block>(20, 10);
        display = new BlockDisplay(grid);
        display.setArrowListener(this);
        display.setTitle("Tetris");
        activeTetrad = new Tetrad(grid);
    }

    public void upPressed()
    {
        activeTetrad.rotate();
    }

    public void downPressed()
    {
        activeTetrad.translate(1, 0);
    }

    public void leftPressed()
    {
        activeTetrad.translate(0, -1);
    }

    public void rightPressed()
    {
        activeTetrad.translate(0, 1);
    }

    public void spacePressed()
    {
        while(activeTetrad.translate(1, 0) == true)
        {
        }
    }

    public void play()
    {
        int score = 0;
        int level = 1;
        int speed = 100;
        while (true)
        {
            
            speed = (int)(100 / (Math.pow(1.25, level - 1)));
            try { Thread.sleep(speed); } catch(Exception e) {}
            display.showBlocks();
            try { Thread.sleep(speed); } catch(Exception e) {}
            display.showBlocks();
            try { Thread.sleep(speed); } catch(Exception e) {}
            display.showBlocks();
            try { Thread.sleep(speed); } catch(Exception e) {}
            display.showBlocks();
            try { Thread.sleep(speed); } catch(Exception e) {}
            display.showBlocks();
            try { Thread.sleep(speed); } catch(Exception e) {}
            display.showBlocks();
            try { Thread.sleep(speed); } catch(Exception e) {}
            display.showBlocks();
            try { Thread.sleep(speed); } catch(Exception e) {}
            display.showBlocks();
            try { Thread.sleep(speed); } catch(Exception e) {}
            display.showBlocks();
            try { Thread.sleep(speed); } catch(Exception e) {}
            display.showBlocks();

            if(activeTetrad.translate(1, 0) == false)
            {
                if(topRowsEmpty() == true)
                {
                    break;
                }
                activeTetrad = new Tetrad(grid);
                int numLines = clearCompletedRows();
                if(numLines == 1)
                {
                    score += (40 * level);
                }
                else if(numLines == 2)
                {
                    score += (100 * level);
                }
                else if(numLines == 3)
                {
                    score += (300 * level);
                }
                else if(numLines == 4)
                {
                    score += (1200 * level);
                }
                display.setTitle("Score: " + score + "  Level: " + level);
                if(score > level * (40 * Math.pow(2, level - 1)))
                {
                    level++;
                }
            }

            display.showBlocks();
        }
        display.setTitle("YOU LOSE!");
    }

    //precondition:  0 <= row < number of rows
    //postcondition: Returns true if every cell in the
    //               given row is occupied;
    //               returns false otherwise.
    private boolean isCompletedRow(int row)
    {
        boolean isFilled = true;
        for(int c = 0; c < grid.getNumCols(); c++)
        {
            if(grid.get(new Location(row, c)) == null)
            {
                isFilled = false;
            }
        }
        return isFilled;
    }

    //precondition:  0 <= row < number of rows;
    //               given row is full of blocks
    //postcondition: Every block in the given row has been
    //               removed, and every block above row
    //               has been moved down one row.
    private void clearRow(int row)
    {
        if(isCompletedRow(row))
        {
            for(int c = 0; c < grid.getNumCols(); c++)
            {
                (grid.get(new Location(row, c))).removeSelfFromGrid();
            }
            for(int r = row; r > 0; r--)
            {
                for(int c = 0; c < grid.getNumCols(); c++)
                {
                    if((grid.get(new Location(r - 1, c))) != null)
                    {
                        (grid.get(new Location(r - 1, c))).moveTo(new Location(r, c));
                    }
                }
            }
        }
    }

    //postcondition: All completed rows have been cleared.
    private int clearCompletedRows()
    {
        int numLines = 0;
        for(int r = 0; r < grid.getNumRows(); r++)
        {
            while(isCompletedRow(r))
            {
                clearRow(r);
                numLines++;
            }

        }
        return numLines;
    }

    //returns true if top two rows of the grid are empty (no blocks), false otherwise
    private boolean topRowsEmpty()
    {
        boolean isFilled = false;

        for(int r = 0; r < 2; r++)
        {
            for(int c = 3; c < 7; c++)
            {
                if(grid.get(new Location(r, c)) != null)
                {
                    isFilled = true;
                }
            }
        }
        return isFilled;
    }

}