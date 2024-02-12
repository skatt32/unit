package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCorrectAmount() {
        assertEquals(service.remain(900), 100);

    }

    @Test
    public void  shouldReturnCashbackZeroWith1000() {
        assertEquals(service.remain(1000), 0);
    }


}