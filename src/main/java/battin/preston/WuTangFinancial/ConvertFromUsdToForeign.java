package battin.preston.WuTangFinancial;

/**
 * Created by prestonbattin on 1/11/17.
 */
public class ConvertFromUsdToForeign {

    String conversionType;
    double conversionExhchange;

    public void convertToTender(String convertedTo, double Usd){



        if (convertedTo.equals("Euro")) {

                conversionExhchange = Usd * .94;


        } else if (convertedTo.equals("British Pound")) {

            conversionExhchange = Usd * .82;


        } else if (convertedTo.equals("Indian Rupee")) {

            conversionExhchange = Usd * 68.32;


        } else if (convertedTo.equals("Australian Dollar")) {

            conversionExhchange = Usd * 1.35;


        } else if (convertedTo.equals("Canadian Dollar")) {

            conversionExhchange = Usd * 1.32;


        } else if (convertedTo.equals("Singapore Dollar")) {

            conversionExhchange = Usd * 1.43;


        } else if (convertedTo.equals("Swiss Franc")) {

            conversionExhchange = Usd * 1.01;


        }else if (convertedTo.equals("Malaysian Ringgit")) {

            conversionExhchange = Usd * 4.47;


        } else if (convertedTo.equals("Japanese Yen")) {

            conversionExhchange = Usd * 115.84;


        }else if (convertedTo.equals("Chinese Yuan Renminbi")) {

            conversionExhchange = Usd * 6.92;


        } else {

            conversionExhchange = Usd;

            }

        }


    }



