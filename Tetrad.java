/**
 * Tetrad class to be completed for Tetris project
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;

public class Tetrad
{
    private Block[] blocks;

    public Tetrad(BoundedGrid<Block> grid)
    {
        //Exercise 1.2  Insert code here to
        blocks = new Block[4];
        for(int i = 0; i < blocks.length; i++)
        {
            blocks[i] = new Block();
        }
        Color color = Color.WHITE;
        Location[] locs = new Location[4];
        int shape = 0;

        shape = (int)(Math.random() * 7);
        //Exercise 1.2  Insert code here to
        if(shape == 0)
        {
            color = Color.CYAN;
            locs[0] = new Location(0, 3);
            locs[1] = new Location(0, 4);
            locs[2] = new Location(0, 5);
            locs[3] = new Location(0, 6);
        }
        if(shape == 1)
        {
            color = Color.MAGENTA;
            locs[0] = new Location(0, 3);
            locs[1] = new Location(0, 4);
            locs[2] = new Location(0, 5);
            locs[3] = new Location(1, 4);
        }
        if(shape == 2)
        {
            color = Color.YELLOW;
            locs[0] = new Location(0, 4);
            locs[1] = new Location(0, 5);
            locs[2] = new Location(1, 4);
            locs[3] = new Location(1, 5);
        }
        if(shape == 3)
        {
            color = Color.ORANGE;
            locs[0] = new Location(0, 3);
            locs[1] = new Location(0, 4);
            locs[2] = new Location(0, 5);
            locs[3] = new Location(1, 3);
        }
        if(shape == 4)
        {
            color = Color.BLUE;
            locs[0] = new Location(0, 3);
            locs[1] = new Location(0, 4);
            locs[2] = new Location(0, 5);
            locs[3] = new Location(1, 5);
        }
        if(shape == 5)
        {
            color = Color.GREEN;
            locs[0] = new Location(0, 5);
            locs[1] = new Location(0, 4);
            locs[2] = new Location(1, 3);
            locs[3] = new Location(1, 4);
        }
        if(shape == 6)
        {
            color = Color.RED;
            locs[0] = new Location(0, 3);
            locs[1] = new Location(0, 4);
            locs[2] = new Location(1, 4);
            locs[3] = new Location(1, 5);
        }
        if(shape == 10)
        {
            color = Color.BLACK;
            blocks = new Block[1];
            for(int i = 0; i < blocks.length; i++)
            {
                blocks[i] = new Block();
            }
            locs = new Location[1];
            locs[0] = new Location(0, 4);
        }
        if(shape == 10)
        {
            color = Color.WHITE;
            blocks = new Block[30];
            for(int i = 0; i < blocks.length; i++)
            {
                blocks[i] = new Block();
            }
            locs = new Location[30];
            locs[0] = new Location(0, 4);
            locs[15] = new Location(0, 5);
            locs[2] = new Location(1, 2);
            locs[3] = new Location(1, 3);
            locs[4] = new Location(1, 6);
            locs[5] = new Location(1, 7);
            locs[6] = new Location(2, 1);
            locs[7] = new Location(2, 8);
            locs[8] = new Location(3, 1);
            locs[9] = new Location(3, 3);
            locs[10] = new Location(3, 6);
            locs[11] = new Location(3, 8);
            locs[12] = new Location(4, 0);
            locs[13] = new Location(4, 9);
            locs[14] = new Location(5, 0);
            locs[1] = new Location(5, 3);
            locs[16] = new Location(5, 6);
            locs[17] = new Location(5, 9);
            locs[18] = new Location(6, 1);
            locs[19] = new Location(6, 4);
            locs[20] = new Location(6, 5);
            locs[21] = new Location(6, 8);
            locs[22] = new Location(7, 1);
            locs[23] = new Location(7, 8);
            locs[24] = new Location(8, 2);
            locs[25] = new Location(8, 3);
            locs[26] = new Location(8, 6);
            locs[27] = new Location(8, 7);
            locs[28] = new Location(9, 4);
            locs[29] = new Location(9, 5);
        }
        //Exercise 1.2  Insert code here (after the above if statements) to
        for(int i = 0; i < blocks.length; i++)
        {
            blocks[i].setColor(color);
            addToLocations(grid, locs);
        }
    }

    //precondition:  blocks are not in any grid;
    //               blocks.length = locs.length = 4.
    //postcondition: The locations of blocks match locs,
    //               and blocks have been put in the grid.
    private void addToLocations(BoundedGrid<Block> grid, Location[] locs)
    {
        for(int i = 0; i < blocks.length; i++)
        {
            blocks[i].putSelfInGrid(grid, locs[i]);
        } 
    }

    //precondition:  Blocks are in the grid.
    //postcondition: Returns old locations of blocks;
    //               blocks have been removed from grid.
    private Location[] removeBlocks()
    {
        Location[] locs = new Location[blocks.length];
        for(int i = 0; i < blocks.length; i++)
        {
            locs[i] = blocks[i].getLocation();
            blocks[i].removeSelfFromGrid();
        }
        return locs;
    }

    //postcondition: Returns true if each of locs is
    //               valid (on the board) AND empty in
    //               grid; false otherwise.
    private boolean areEmpty(BoundedGrid<Block> grid, Location[] locs)
    {
        for(int i = 0; i < locs.length; i++)
        {
            int r = locs[i].getRow();
            int c = locs[i].getCol();
            if(r < 0 || r > (grid.getNumRows() - 1) || c < 0 || c > (grid.getNumCols() - 1)) return false;
            if(grid.get(locs[i]) != null) return false;
        }
        return true;
    }

    //postcondition: Attempts to move this tetrad deltaRow
    //               rows down and deltaCol columns to the
    //               right, if those positions are valid
    //               and empty; returns true if successful
    //               and false otherwise.
    public boolean translate(int deltaRow, int deltaCol)
    {
        //Exercise 2.2    Insert code here to
        BoundedGrid<Block> grid = blocks[0].getGrid();
        Location[] oldLocs = new Location[blocks.length];
        oldLocs = removeBlocks();
        Location[] newLocs = new Location[blocks.length];
        for(int i = 0; i < newLocs.length; i++)
        {
            newLocs[i] = new Location(deltaRow + oldLocs[i].getRow(), deltaCol + oldLocs[i].getCol());
        }
        if(areEmpty(grid, newLocs) == false)
        {
            for(int i = 0; i < oldLocs.length; i++)
            {
                blocks[i].putSelfInGrid(grid, oldLocs[i]);
            }
            return false;
        }
        for(int i = 0; i < newLocs.length; i++)
        {
            blocks[i].putSelfInGrid(grid, newLocs[i]);
        }
        return true;
        //              replace the tetrad in the proper place (translated)
        //              return true if moved, false if not moved
        // replace this line
    }

    //postcondition: Attempts to rotate this tetrad
    //               clockwise by 90 degrees about its
    //               center, if the necessary positions
    //               are empty; returns true if successful
    //               and false otherwise.
    public boolean rotate()
    {
        //Exercise 3.0  Insert code here to
        BoundedGrid<Block> grid = blocks[0].getGrid();
        Location[] oldLocs = new Location[blocks.length];
        oldLocs = removeBlocks();
        Location[] newLocs = new Location[blocks.length];
        for(int i = 0; i < newLocs.length; i++)
        {
            int newCol = oldLocs[1].getRow() + oldLocs[1].getCol() - oldLocs[i].getRow();
            int newRow = oldLocs[1].getRow() - oldLocs[1].getCol() + oldLocs[i].getCol();
            newLocs[i] = new Location(newRow, newCol);
        }
        if(areEmpty(grid, newLocs) == false)
        {
            for(int i = 0; i < oldLocs.length; i++)
            {
                blocks[i].putSelfInGrid(grid, oldLocs[i]);
            }
            return false;
        }
        for(int i = 0; i < newLocs.length; i++)
        {
            blocks[i].putSelfInGrid(grid, newLocs[i]);
        }
        return true;
        //              ask any block for its grid and store value
        //              remove the blocks (but save the locations)
        //              check if the new locations are empty
        //              replace the tetrad in the proper place (rotated)
        // replace this line
    }
}