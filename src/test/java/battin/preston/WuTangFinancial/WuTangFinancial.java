package battin.preston.WuTangFinancial;


import static org.junit.Assert.*;
import org.junit.Test;



/**
 * Created by prestonbattin on 1/11/17.
 */
public class WuTangFinancial {

    Converter converter = new Converter();

    @Test
    public void converterTest() {
        assertEquals(.94, converter.MoneyCoverter("Euro", 1), .01);
    }


    class ConvertFromUsdTest {

        ConvertFromUsdToForeign convertedFinalTest = new ConvertFromUsdToForeign();

        @Test
        public void convertToForeignTest() {
            assertEquals(68.32, convertedFinalTest.conversionExhchange, .01);
        }
    }
}







