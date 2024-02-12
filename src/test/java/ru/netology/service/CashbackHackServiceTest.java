package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

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