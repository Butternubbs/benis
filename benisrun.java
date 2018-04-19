import java.lang.Math;
import java.util.Scanner;
/**
 * Tetris class to be completed for Tetris project
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class benisrun implements ArrowListener
{
    private String word;
    public static void main(String[] args)
    {
        benisrun bean = new benisrun();

        bean.play();
    }
    public static int meme = 0;
    public static String letter = "";
    private BoundedGrid<Block> grid;
    private BlockDisplay display;
    private benis activebenis;
    private ArrowListener listener;
    public benisrun()
    {
        word = input();
        grid = new BoundedGrid<Block>(7, (6 * word.length()) - 1);
        display = new BlockDisplay(grid);
        display.setArrowListener(this);
        display.setTitle("benis");
        letter = word.substring(0, 1);
        activebenis = new benis(grid);
    }

    public void upPressed()
    {
        activebenis.rotate();
    }

    public void downPressed()
    {
        activebenis.translate(1, 0);
    }

    public void leftPressed()
    {
        activebenis.translate(0, -1);
    }

    public void rightPressed()
    {
        activebenis.translate(0, 1);
    }

    public void spacePressed()
    {
        while(activebenis.translate(1, 0) == true)
        {
        }
    }

    public void play()
    {
        int score = 0;
        int level = 1;
        try { Thread.sleep(1500); } catch(Exception e) {}
        display.showBlocks();
        while (true)
        {
            try { Thread.sleep(100); } catch(Exception e) {}
            display.showBlocks();

            if(activebenis.translate(1, 0) == false)
            {
                
                if(meme == word.length() - 1)
                {
                    break;
                }
                meme++;
                letter = word.substring(meme, meme + 1);

                activebenis = new benis(grid);
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
                display.setTitle("BENIS");
                if(score > level * (40 * Math.pow(2, level - 1)))
                {
                    level++;
                }

            }

            display.showBlocks();

        }
        display.setTitle("B E N I S");
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
    
    
    public String input()
    {
        System.out.println("Enter your word");
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        return input;
    }
}