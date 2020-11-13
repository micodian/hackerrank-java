package solutions;

import java.text.NumberFormat;
import java.util.Locale;


public class CurrencyConverter {
    public static void countryCurrency(double number){
        
        NumberFormat us = NumberFormat.getCurrencyInstance();

        
        Locale india = new Locale("en", "in");
        NumberFormat in = NumberFormat.getCurrencyInstance(india);
        NumberFormat ch = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        

        

        System.out.println("US: " + us.format(number));
        System.out.println("IN: " + in.format(number));
        System.out.println("CH: " + ch.format(number));
        System.out.println("FR: " + fr.format(number));
        
        
    }
}
