package org.example;

import ru.netology.javaqamvn.SQRService.SqrtService;

public class Main {

    public static void main(String[] args) {
        SqrtService service = new SqrtService();
        System.out.println(service.calcSqrt(0,50));
    }
}