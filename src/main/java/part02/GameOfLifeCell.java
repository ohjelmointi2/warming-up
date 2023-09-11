package part02;

import java.util.List;

/**
 * > "- Any live cell with two or three live neighbours survives.
 * > - Any dead cell with three live neighbours becomes a live cell.
 * > - All other live cells die in the next generation. Similarly, all other
 * > dead cells stay dead."
 * >
 * > https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life
 */
public enum GameOfLifeCell {

    LIVE, DEAD;

    public GameOfLifeCell getNextGeneration(List<GameOfLifeCell> neighbours) {
        /*
         * There are only two objects of this type: LIVE and DEAD.
         * `this` is either one of them.
         *
         * You can check which object the method was called by comaring `this == LIVE`
         * or `this == DEAD`.
         *
         * Can calculate the number of `LIVE` neighbours in the given list and use
         * that count to determine if this cell is `LIVE` or `DEAD` in the next
         * generation. Finally, return either `LIVE` or `DEAD` as your answer.
         */
        return DEAD;
    }
}
