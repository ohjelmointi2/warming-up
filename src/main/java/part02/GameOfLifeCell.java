package part02;

import java.util.Collections;
import java.util.List;

/**
 * > - Any live cell with two or three live neighbours survives.
 * > - Any dead cell with three live neighbours becomes a live cell.
 * > - All other live cells die in the next generation. Similarly, all other
 * > dead cells stay dead.
 * >
 * > https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life
 */
public enum GameOfLifeCell {

    LIVE, DEAD;

    public GameOfLifeCell getNextGeneration(List<GameOfLifeCell> neighbours) {
        var living = Collections.frequency(neighbours, LIVE);

        // "Any live cell with two or three live neighbours survives."
        if (this == LIVE && (living == 2 || living == 3)) {
            return LIVE;
        }

        // "Any dead cell with three live neighbours becomes a live cell."
        if (this == DEAD && living == 3) {
            return LIVE;
        }

        // "All other live cells die in the next generation. Similarly, all other dead
        // cells stay dead."
        return DEAD;
    }
}
