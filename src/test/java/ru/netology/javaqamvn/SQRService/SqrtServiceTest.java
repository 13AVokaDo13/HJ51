package ru.netology.javaqamvn.SQRService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.javaqamvn.SQRService.SqrtService;

public class SqrtServiceTest {
    @ParameterizedTest
    @CsvSource({
            "3, 200, 300",
                })
    public void TestCorrectOutputResult(int expected, int start, int end) {
        SqrtService service = new SqrtService();
        int actual = service.calcSqrt(start, end);
        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({
   "1, 0, 50"
    })
    public void TestUncorrectOutputResult(int expected, int start, int end) {
        SqrtService service = new SqrtService();
        int actual = service.calcSqrt(start, end);
        Assertions.assertNotEquals(expected, actual);
    }
}
