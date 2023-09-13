package part02;

import java.util.HashSet;
import java.util.Set;

/**
 * The `Coordinate` class represents a two-dimensional coordinate with integer
 * values for the Y and X axes.
 *
 * It is used to specify the position of cells in the grid.
 *
 * This exercise has been implemented with the aid of ChatGPT.
 */
public record Coordinate(int y, int x) {

    /**
     * Calculates and returns a set of neighboring coordinates (adjacent and
     * diagonal) to the current coordinate.
     *
     * @return A set of `Coordinate` objects representing neighboring coordinates.
     */
    public Set<Coordinate> getNeighbours() {
        Set<Coordinate> neighbours = new HashSet<>();

        // Loop through all possible combinations of neighboring offsets
        for (int yOffset = -1; yOffset <= 1; yOffset++) {
            for (int xOffset = -1; xOffset <= 1; xOffset++) {
                // Skip the current coordinate
                if (yOffset == 0 && xOffset == 0) {
                    continue;
                }

                int neighbourY = y + yOffset;
                int neighbourX = x + xOffset;

                neighbours.add(new Coordinate(neighbourY, neighbourX));
            }
        }

        return neighbours;
    }
}
