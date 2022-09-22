import classes.Account;
import classes.AndroidPlayer;
import classes.ApplePlayer;
import classes.SavingsAccount;
import interfaces.Playable;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        double a = .7;
        double b = .1;
        double c = .2;

        System.out.println(a + b);

        BigDecimal a1 = new BigDecimal("1").setScale(2);
        BigDecimal b1 = new BigDecimal(".2").setScale(8);

        BigDecimal result1 = a1.divide(b1);

        System.out.println(result1);

        System.out.println(result1.pow(2));

        System.out.println(Math.pow(result1.doubleValue(), 2));;
    }
}