package ru.netology.javaqamvn.SQRService;

public class SqrtService {
    public int calcSqrt(int start, int end) {
        int i = 0;
        int result = 0;
        for (i = 10; i <= 99; i++) {

            if (i * i >= start && i * i <= end) {
                result++;
            }

        }
        return result;

    }
}
