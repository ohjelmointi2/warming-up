package part02;

import java.util.List;

/**
 * This class represents Conway's Game of Life simulation.
 *
 * This exercise has been implemented with the aid of ChatGPT.
 */
public class GameOfLife {

    // The time interval (in milliseconds) between each generation's display
    private static final int PRINT_INTERVAL_MS = 200;

    /**
     * The main method that starts the Game of Life simulation.
     *
     * @param args The command-line arguments. An optional integer can be provided
     *             to limit the number of generations.
     * @throws InterruptedException If interrupted while sleeping between
     *                              generations.
     */
    public static void main(String[] args) throws InterruptedException {
        // User can define max number of generations as the first argument. Otherwise
        // unlimited generations are printed.
        int maxGenerations = args.length == 1 ? Integer.parseInt(args[0]) : 0;

        // a sample system that has a few interesting patterns:
        var grid = createGrid("""
                xx..............................................
                xx..............................................
                ................................................
                .................x.....................x........
                ...........xxxxxx........xxx...........x........
                .................x.....xxx ............x.....x..
                ..............................................xx
                ..x..........................................xx.
                xx..............................................
                .xx.............................................
                """);

        var generation = 1;

        // Continuously display and evolve the grid
        while (maxGenerations == 0 || generation <= maxGenerations) {
            printGeneration(grid, generation);
            System.out.println("Press CTRL + C to exit\n");

            Thread.sleep(PRINT_INTERVAL_MS);

            grid = grid.nextGeneration();
            generation++;
        }
    }

    /**
     * Create a grid from a string representationm, where 'x' means a living cell
     * and all others mean dead cells. For example:
     *
     * """
     * ..x..
     * ..x..
     * xx...
     * """
     *
     * @param string A string representing the initial grid state.
     * @return A new grid initialized with the provided state.
     */
    private static Grid createGrid(String string) {
        var grid = new Grid();

        String[] map = string.split("\n");

        for (int y = 0; y < map.length; y++) {
            var row = map[y];
            for (int x = 0; x < row.length(); x++) {
                // If the cell is alive, set it in the grid. All unknown cells are assumed dead.
                if (row.charAt(x) == 'x') {
                    var coord = new Coordinate(y, x);
                    grid.setStatus(coord, CellStatus.LIVE);
                }
            }
        }
        return grid;
    }

    /**
     * The main method that starts the Game of Life simulation.
     *
     * @param args The command-line arguments. An optional integer can be provided
     *             to limit the number of generations.
     * @throws InterruptedException If interrupted while sleeping between
     *                              generations.
     */
    private static void printGeneration(Grid grid, int generation) {
        // first, figure out the area that should be printed
        List<Coordinate> coordinates = grid.getActiveCoordinates();

        // Collect statistics for both Y and X coordinates of the pritable cells:
        var xStats = coordinates.stream().mapToInt(Coordinate::x).summaryStatistics();
        var yStats = coordinates.stream().mapToInt(Coordinate::y).summaryStatistics();

        var heading = "Generation %d (x: [%d, %d], y: [%d, %d]):\n".formatted(generation, xStats.getMin(),
                xStats.getMax(), yStats.getMin(), yStats.getMax());

        StringBuffer buffer = new StringBuffer(heading);

        // Iterate through all cells in the two-dimensional area:
        for (int y = yStats.getMin(); y < yStats.getMax(); y++) {
            for (int x = xStats.getMin(); x < xStats.getMax(); x++) {
                var current = new Coordinate(y, x);

                CellStatus status = grid.getStatus(current);

                // Append "*" for living cells and " " for dead cells
                buffer.append(status.isLive() ? "x" : " ");
            }
            buffer.append("\n");
        }

        System.out.println(buffer.toString());
    }
}
