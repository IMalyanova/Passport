import java.text.ParseException;
import java.util.Calendar;


public class Passport {
    public static void main(String[] args) throws ParseException {

        int[] region = {80, 81, 82, 15};
        int lastYear = Calendar.getInstance().get(Calendar.YEAR);
        String str;
        for (int element: region){
            System.out.println();
            for (int firstYear = 1997; firstYear <= lastYear; firstYear++){
                str = "";
                if((firstYear %100) < 10){
                    str = "0";
                }
                System.out.println(element + str + firstYear %100);
                }
        }

    }
}
