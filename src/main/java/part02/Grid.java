package part02;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The `Grid` class represents the grid in Conway's Game of Life. It holds
 * information about the state of cells at various coordinates and provides
 * methods to calculate the next generation of the grid.
 *
 * This exercise has been implemented with the aid of ChatGPT.
 */
public class Grid {

    private Map<Coordinate, CellStatus> cells;

    /**
     * Constructs an empty grid with no live cells.
     */
    public Grid() {
        this.cells = new HashMap<>();
    }

    /**
     * Calculates and returns the next generation of the grid based on the current
     * state of cells.
     *
     * @return A new `Grid` object representing the next generation of the grid.
     */
    public Grid nextGeneration() {
        var newGeneration = new Grid();

        List<Coordinate> coords = getActiveCoordinates();

        for (Coordinate coord : coords) {

            List<CellStatus> neighbourStatuses = neighborStatuses(coord.getNeighbours());

            CellStatus currentStatus = cells.getOrDefault(coord, CellStatus.DEAD);
            CellStatus nextStatus = currentStatus.getNextGeneration(neighbourStatuses);

            newGeneration.setStatus(coord, nextStatus);
        }

        return newGeneration;
    }

    /**
     * Returns a list of coordinates where there is a live cell and cells that are
     * located next to a live cell.
     *
     * @return A list of active coordinates.
     */
    public List<Coordinate> getActiveCoordinates() {
        return cells.entrySet().stream().filter(e -> e.getValue().isLive())
                .flatMap(e -> e.getKey().getNeighbours().stream()).toList();
    }

    /**
     * Returns the status (live or dead) of a cell at the specified coordinate.
     *
     * @param coord The coordinate of the cell.
     * @return The status of the cell at the given coordinate.
     */
    public CellStatus getStatus(Coordinate coord) {
        // if the status of a cell at a coordinate is unknown, the cell is dead
        return this.cells.getOrDefault(coord, CellStatus.DEAD);
    }

    /**
     * Sets the status (live or dead) of a cell at the specified coordinate.
     *
     * @param coord  The coordinate of the cell.
     * @param status The status to set for the cell.
     */
    public void setStatus(Coordinate coord, CellStatus status) {
        this.cells.put(coord, status);
    }

    /**
     * Calculates and returns the status (live or dead) of the neighboring cells at
     * the specified coordinates.
     *
     * @param neighbours The set of neighboring coordinates for which to determine
     *                   the cell statuses.
     * @return A list of `CellStatus` objects representing the statuses of
     *         neighboring cells.
     */
    private List<CellStatus> neighborStatuses(Set<Coordinate> neighbours) {
        return neighbours.stream().map(n -> getStatus(n)).toList();
    }
}
