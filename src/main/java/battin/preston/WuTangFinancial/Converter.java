package battin.preston.WuTangFinancial;

/**
 * Created by prestonbattin on 1/11/17.
 */
public class Converter {
    

    double converted = 0;

    public double MoneyCoverter(String originalTender, double convertToUsd) {


        if (originalTender.equals("Euro")) {

            converted = convertToUsd / .94;
            return converted;

        } else if (originalTender.equals("British Pound")) {

            converted = convertToUsd / .82;
            return converted;

        } else if (originalTender.equals("Indian Rupee")) {

            converted = convertToUsd / 68.32;
            return converted;

        } else if (originalTender.equals("Australian Dollar")) {

            converted = convertToUsd / 1.35;
            return converted;

        } else if (originalTender.equals("Canadian Dollar")) {

            converted = convertToUsd / 1.32;
            return converted;

        } else if (originalTender.equals("Singapore Dollar")) {

            converted = convertToUsd / 1.43;
            return converted;

        } else if (originalTender.equals("Swiss Franc")){

            converted = convertToUsd / 1.01;
            return converted;

        }else if (originalTender.equals("Malaysian Ringgit")) {

            converted = convertToUsd / 4.47;
            return converted;

        } else if (originalTender.equals("Japanese Yen")) {

            converted = convertToUsd / 115.84;
            return converted;

        }else if (originalTender.equals("Chinese Yuan Renminbi")) {

            converted = convertToUsd / 6.92;
            return converted;

        } else if (originalTender.equals("Us Dollar")){

            converted = convertToUsd;
            return converted;
        }
        else{

            System.out.println("Not a valid form of tender!");
            return 0;
        }
    }
}


