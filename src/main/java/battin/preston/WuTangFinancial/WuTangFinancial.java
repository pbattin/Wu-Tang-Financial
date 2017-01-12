package battin.preston.WuTangFinancial;

import java.util.Scanner;

/**
 * Created by prestonbattin on 1/11/17.
 */
public class WuTangFinancial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Converter moneySwap = new Converter();
        String MoneyType, ConvertMoneyTo;
        double MoneyToConvert;

        System.out.println("What type of money are you converting from?");

         MoneyType = sc.nextLine();

        System.out.println("What type of money are you converting to?");

         ConvertMoneyTo = sc.nextLine();

        System.out.println("How many " + MoneyType + "s do you wish to convert?");

         MoneyToConvert = sc.nextDouble();

        moneySwap.MoneyCoverter(MoneyType, MoneyToConvert);

        ConvertFromUsdToForeign finalConversion = new ConvertFromUsdToForeign();

        finalConversion.convertToTender(ConvertMoneyTo, moneySwap.converted);

        System.out.println(MoneyToConvert + " " + MoneyType + "s converted to " + ConvertMoneyTo + " is: " + finalConversion.conversionExhchange);


    }
}
