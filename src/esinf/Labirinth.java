/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esinf;

/**
 * @author nunotmalheiro
 */
public class Labirinth
{

    /**
     * @param actual the labirinth in its actual (marked) form
     * @param y      coordinate y in the labirinth
     * @param x      coordinate x in the labirinth
     * @return the marked labirinth or null if there is no way
     */
    public static int[][] check(int[][] actual, int y, int x) //
    {
        if (actual[x][y] == 1)
        {
            actual[x][y] = 9;
        }

        //move north
        if (moveAllowed(actual, y - 1, x))
        {
            check(actual, y - 1, x);
        }

        //move east
        if (moveAllowed(actual, y, x + 1))
        {
            check(actual, y, x + 1);
        }

        //move south
        if (moveAllowed(actual, y + 1, x))
        {
            check(actual, y + 1, x);
        }

        //move west
        if (moveAllowed(actual, y, x - 1))
        {
            check(actual, y, x - 1);
        }

        //verify if cant move and we are in the final position

        return actual;
    }

    private static boolean moveAllowed(int[][] a, int y, int x)
    {
        if (y >= 0 && x >= 0)
        {
            if (a[y][x] == 1)
            {
                return true;
            }
            return false;
        }
        return false;
    }
}

