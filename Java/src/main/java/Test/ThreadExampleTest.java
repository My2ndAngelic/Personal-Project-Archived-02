//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class ThreadExampleTest {
//    private final long start = 1;
//    private final long end = 69420;
//    private final long result = (start + end) * (end - start + 1) / 2;
//
//    @Test
//    void addSingleThread() {
//        assertEquals(result, ThreadExample.addSingleThread(start, end));
//    }
//
//    @Test
//    void addDoubleThread() {
//        assertEquals(result, ThreadExample.addDoubleThread(start, end));
//    }
//}