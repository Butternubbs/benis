/**
 * Tetrad class to be completed for Tetris project
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;

public class benis
{
    private Block[] blocks;

    public benis(BoundedGrid<Block> grid)
    {
        //Exercise 1.2  Insert code here to
        blocks = new Block[4];
        for(int i = 0; i < blocks.length; i++)
        {
            blocks[i] = new Block();
        }
        Color color = Color.WHITE;
        Location[] locs = new Location[4];
        String shape = benisrun.letter;
        //color order: magenta, red, blue, yellow, green, cyan, pink, orange.
        //Exercise 1.2  Insert code here to
        if(shape.equals("a"))
        {
            blocks = new Block[14];
            for(int i = 0; i < blocks.length; i++)
            {
                blocks[i] = new Block();
            }
            locs = new Location[14];
            color = Color.MAGENTA;
            locs[0] = new Location(0, 1);
            locs[8] = new Location(0, 2);
            locs[2] = new Location(0, 3);
            locs[3] = new Location(1, 0);
            locs[4] = new Location(1, 4);
            locs[5] = new Location(2, 0);
            locs[6] = new Location(2, 1);
            locs[7] = new Location(2, 2);
            locs[1] = new Location(2, 3);
            locs[9] = new Location(2, 4);
            locs[10] = new Location(3, 0);
            locs[11] = new Location(3, 4);
            locs[12] = new Location(4, 0);
            locs[13] = new Location(4, 4);
        }
        if(shape.equals("b"))
        {
            blocks = new Block[16];
            for(int i = 0; i < blocks.length; i++)
            {
                blocks[i] = new Block();
            }
            locs = new Location[16];
            color = Color.RED;
            locs[0] = new Location(0, 0);
            locs[8] = new Location(0, 1);
            locs[2] = new Location(0, 2);
            locs[3] = new Location(0, 3);
            locs[4] = new Location(1, 0);
            locs[5] = new Location(1, 4);
            locs[6] = new Location(2, 0);
            locs[7] = new Location(2, 1);
            locs[1] = new Location(2, 2);
            locs[9] = new Location(2, 3);
            locs[10] = new Location(3, 0);
            locs[11] = new Location(3, 4);
            locs[12] = new Location(4, 0);
            locs[13] = new Location(4, 1);
            locs[14] = new Location(4, 2);
            locs[15] = new Location(4, 3);
        }
        if(shape.equals("c"))
        {
            blocks = new Block[11];
            for(int i = 0; i < blocks.length; i++)
            {
                blocks[i] = new Block();
            }
            locs = new Location[11];
            color = Color.BLUE;
            locs[0] = new Location(0, 1);
            locs[8] = new Location(0, 2);
            locs[2] = new Location(0, 3);
            locs[3] = new Location(0, 4);
            locs[4] = new Location(1, 0);
            locs[5] = new Location(2, 0);
            locs[6] = new Location(3, 0);
            locs[7] = new Location(4, 1);
            locs[1] = new Location(4, 2);
            locs[9] = new Location(4, 3);
            locs[10] = new Location(4, 4);
        }
        if(shape.equals("d"))
        {
            blocks = new Block[14];
            for(int i = 0; i < blocks.length; i++)
            {
                blocks[i] = new Block();
            }
            locs = new Location[14];
            color = Color.YELLOW;
            locs[0] = new Location(0, 0);
            locs[8] = new Location(0, 1);
            locs[2] = new Location(0, 2);
            locs[3] = new Location(0, 3);
            locs[4] = new Location(1, 0);
            locs[5] = new Location(1, 4);
            locs[6] = new Location(2, 0);
            locs[7] = new Location(2, 4);
            locs[1] = new Location(3, 0);
            locs[9] = new Location(3, 4);
            locs[10] = new Location(4, 0);
            locs[11] = new Location(4, 1);
            locs[12] = new Location(4, 2);
            locs[13] = new Location(4, 3);
        }
        if(shape.equals("e"))
        {
            blocks = new Block[15];
            for(int i = 0; i < blocks.length; i++)
            {
                blocks[i] = new Block();
            }
            locs = new Location[15];
            color = Color.GREEN;
            locs[0] = new Location(0, 0);
            locs[8] = new Location(0, 1);
            locs[2] = new Location(0, 2);
            locs[3] = new Location(0, 3);
            locs[4] = new Location(0, 4);
            locs[5] = new Location(1, 0);
            locs[6] = new Location(2, 0);
            locs[7] = new Location(2, 1);
            locs[1] = new Location(2, 2);
            locs[9] = new Location(3, 0);
            locs[10] = new Location(4, 0);
            locs[11] = new Location(4, 1);
            locs[12] = new Location(4, 2);
            locs[13] = new Location(4, 3);
            locs[14] = new Location(4, 4);
        }
        if(shape.equals("f"))
        {
            blocks = new Block[11];
            for(int i = 0; i < blocks.length; i++)
            {
                blocks[i] = new Block();
            }
            locs = new Location[11];
            color = Color.CYAN;
            locs[0] = new Location(0, 0);
            locs[8] = new Location(0, 1);
            locs[2] = new Location(0, 2);
            locs[3] = new Location(0, 3);
            locs[4] = new Location(0, 4);
            locs[5] = new Location(1, 0);
            locs[6] = new Location(2, 0);
            locs[7] = new Location(2, 1);
            locs[1] = new Location(2, 2);
            locs[9] = new Location(3, 0);
            locs[10] = new Location(4, 0);
        }
        if(shape.equals("g"))
        {
            blocks = new Block[15];
            for(int i = 0; i < blocks.length; i++)
            {
                blocks[i] = new Block();
            }
            locs = new Location[15];
            color = Color.PINK;
            locs[0] = new Location(0, 1);
            locs[8] = new Location(0, 2);
            locs[2] = new Location(0, 3);
            locs[3] = new Location(0, 4);
            locs[4] = new Location(1, 0);
            locs[5] = new Location(2, 0);
            locs[6] = new Location(2, 2);
            locs[7] = new Location(2, 3);
            locs[1] = new Location(2, 4);
            locs[9] = new Location(3, 0);
            locs[10] = new Location(3, 4);
            locs[11] = new Location(4, 1);
            locs[12] = new Location(4, 2);
            locs[13] = new Location(4, 3);
            locs[14] = new Location(4, 4);
        }
        if(shape.equals("h"))
        {
            blocks = new Block[13];
            for(int i = 0; i < blocks.length; i++)
            {
                blocks[i] = new Block();
            }
            locs = new Location[13];
            color = Color.ORANGE;
            locs[0] = new Location(0, 0);
            locs[8] = new Location(0, 4);
            locs[2] = new Location(1, 0);
            locs[3] = new Location(1, 4);
            locs[4] = new Location(2, 0);
            locs[5] = new Location(2, 1);
            locs[6] = new Location(2, 2);
            locs[7] = new Location(2, 3);
            locs[1] = new Location(2, 4);
            locs[9] = new Location(3, 0);
            locs[10] = new Location(3, 4);
            locs[11] = new Location(4, 0);
            locs[12] = new Location(4, 4);
        }
        if(shape.equals("i"))
        {
            blocks = new Block[13];
            for(int i = 0; i < blocks.length; i++)
            {
                blocks[i] = new Block();
            }
            locs = new Location[13];
            color = Color.MAGENTA;
            locs[0] = new Location(0, 0);
            locs[6] = new Location(0, 1);
            locs[2] = new Location(0, 2);
            locs[3] = new Location(0, 3);
            locs[4] = new Location(0, 4);
            locs[5] = new Location(1, 2);
            locs[1] = new Location(2, 2);
            locs[7] = new Location(3, 2);
            locs[8] = new Location(4, 0);
            locs[9] = new Location(4, 1);
            locs[10] = new Location(4, 2);
            locs[11] = new Location(4, 3);
            locs[12] = new Location(4, 4);
        }
        if(shape.equals("j"))
        {
            blocks = new Block[11];
            for(int i = 0; i < blocks.length; i++)
            {
                blocks[i] = new Block();
            }
            locs = new Location[11];
            color = Color.RED;
            locs[0] = new Location(0, 0);
            locs[6] = new Location(0, 1);
            locs[2] = new Location(0, 2);
            locs[3] = new Location(0, 3);
            locs[4] = new Location(0, 4);
            locs[5] = new Location(1, 3);
            locs[1] = new Location(2, 3);
            locs[7] = new Location(3, 0);
            locs[8] = new Location(3, 3);
            locs[9] = new Location(4, 1);
            locs[10] = new Location(4, 2);
        }
        if(shape.equals("k"))
        {
            blocks = new Block[11];
            for(int i = 0; i < blocks.length; i++)
            {
                blocks[i] = new Block();
            }
            locs = new Location[11];
            color = Color.BLUE;
            locs[0] = new Location(0, 0);
            locs[6] = new Location(0, 4);
            locs[2] = new Location(1, 0);
            locs[3] = new Location(1, 3);
            locs[4] = new Location(2, 0);
            locs[5] = new Location(2, 1);
            locs[1] = new Location(2, 2);
            locs[7] = new Location(3, 0);
            locs[8] = new Location(3, 3);
            locs[9] = new Location(4, 0);
            locs[10] = new Location(4, 4);
        }
        if(shape.equals("l"))
        {
            blocks = new Block[9];
            for(int i = 0; i < blocks.length; i++)
            {
                blocks[i] = new Block();
            }
            locs = new Location[9];
            color = Color.YELLOW;
            locs[0] = new Location(0, 0);
            locs[6] = new Location(1, 0);
            locs[2] = new Location(2, 0);
            locs[3] = new Location(3, 0);
            locs[4] = new Location(4, 0);
            locs[5] = new Location(4, 1);
            locs[1] = new Location(4, 2);
            locs[7] = new Location(4, 3);
            locs[8] = new Location(4, 4);
        }
        if(shape.equals("n"))
        {
            blocks = new Block[13];
            for(int i = 0; i < blocks.length; i++)
            {
                blocks[i] = new Block();
            }
            locs = new Location[13];
            color = Color.YELLOW;
            locs[0] = new Location(0, 0);
            locs[6] = new Location(0, 4);
            locs[2] = new Location(1, 0);
            locs[3] = new Location(1, 1);
            locs[4] = new Location(1, 4);
            locs[5] = new Location(2, 0);
            locs[1] = new Location(2, 2);
            locs[7] = new Location(2, 4);
            locs[8] = new Location(3, 0);
            locs[9] = new Location(3, 3);
            locs[10] = new Location(3, 4);
            locs[11] = new Location(4, 0);
            locs[12] = new Location(4, 4);
        }
        
        if(shape.equals("s"))
        {
            blocks = new Block[13];
            for(int i = 0; i < blocks.length; i++)
            {
                blocks[i] = new Block();
            }
            locs = new Location[13];
            color = Color.BLUE;
            locs[0] = new Location(0, 1);
            locs[6] = new Location(0, 2);
            locs[2] = new Location(0, 3);
            locs[3] = new Location(0, 4);
            locs[4] = new Location(1, 0);
            locs[5] = new Location(2, 1);
            locs[1] = new Location(2, 2);
            locs[7] = new Location(2, 3);
            locs[8] = new Location(3, 4);
            locs[9] = new Location(4, 0);
            locs[10] = new Location(4, 1);
            locs[11] = new Location(4, 2);
            locs[12] = new Location(4, 3);
        }

        for(int i = benisrun.meme; i > 0; i--)
        {
            for(int j = 0; j < locs.length; j++)
            {
                int r = locs[j].getRow();
                int c = locs[j].getCol();
                locs[j] = new Location(r, c + 6);
            }
        }

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