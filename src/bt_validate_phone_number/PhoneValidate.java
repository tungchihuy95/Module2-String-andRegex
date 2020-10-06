package bt_validate_phone_number;

import java.lang.ref.SoftReference;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidate {
    private static final String PHONE_REGEX ="^\\(\\d{2}\\)\\-\\(0\\d{9}\\)$";


    public PhoneValidate() {
    }

    public static boolean validate(String regex) {
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }


    //Sau đó xây dựng các mẫu account hợp lệ ở một class khác


}
