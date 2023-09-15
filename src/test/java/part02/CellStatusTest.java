package part02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class CellStatusTest {

    @Test
    public void anyLiveCellWithTwoLiveNeighboursSurvives() {
        CellStatus liveCell = CellStatus.LIVE;
        List<CellStatus> neighbours = List.of(CellStatus.LIVE, CellStatus.DEAD, CellStatus.LIVE);

        CellStatus nextGeneration = liveCell.getNextGeneration(neighbours);

        assertEquals(CellStatus.LIVE, nextGeneration);
    }

    @Test
    public void anyLiveCellWithThreeLiveNeighboursSurvives() {
        CellStatus liveCell = CellStatus.LIVE;
        List<CellStatus> neighbours = List.of(CellStatus.LIVE, CellStatus.DEAD, CellStatus.LIVE, CellStatus.LIVE);

        CellStatus nextGeneration = liveCell.getNextGeneration(neighbours);

        assertEquals(CellStatus.LIVE, nextGeneration);
    }

    @Test
    public void anyDeadCellWithThreeLiveNeighboursBecomesALiveCell() {
        CellStatus deadCell = CellStatus.DEAD;
        List<CellStatus> neighbours = List.of(CellStatus.LIVE, CellStatus.LIVE, CellStatus.LIVE);

        CellStatus nextGeneration = deadCell.getNextGeneration(neighbours);

        assertEquals(CellStatus.LIVE, nextGeneration);
    }

    @Test
    public void allOtherLiveCellsDieInTheNextGeneration() {
        CellStatus liveCell = CellStatus.LIVE;
        List<CellStatus> neighbours = List.of(CellStatus.DEAD, CellStatus.LIVE, CellStatus.DEAD);

        CellStatus nextGeneration = liveCell.getNextGeneration(neighbours);

        assertEquals(CellStatus.DEAD, nextGeneration);
    }

    @Test
    public void allOtherDeadCellsStayDead() {
        CellStatus deadCell = CellStatus.DEAD;
        List<CellStatus> neighbours = List.of(CellStatus.DEAD, CellStatus.DEAD, CellStatus.DEAD);

        CellStatus nextGeneration = deadCell.getNextGeneration(neighbours);

        assertEquals(CellStatus.DEAD, nextGeneration);
    }
}
