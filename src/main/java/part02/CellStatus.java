package part02;

import java.util.List;

/**
 * These two enum values, LIVE and DEAD, represent the possible states for any
 * cell. This class can determine the next state for a cell based on the
 * following criteria:
 *
 * > "- Any live cell with two or three live neighbours survives.
 * > - Any dead cell with three live neighbours becomes a live cell.
 * > - All other live cells die in the next generation. Similarly, all other
 * > dead cells stay dead."
 * >
 * > https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life
 *
 * This exercise has been implemented with the aid of ChatGPT.
 */
public enum CellStatus {

    LIVE, DEAD;

    public boolean isLive() {
        return this == LIVE;
    }

    public CellStatus getNextGeneration(List<CellStatus> neighbours) {
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
        var living = neighbours.stream().filter(n -> n == LIVE).count();
        if (this == LIVE) {
            return (living == 2 || living == 3) ? LIVE : DEAD;
        }

        if (this == DEAD) {
            return (living == 3) ? LIVE : DEAD;
        }

        return DEAD;
    }
}
