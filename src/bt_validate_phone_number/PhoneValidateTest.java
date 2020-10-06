package bt_validate_phone_number;

public class PhoneValidateTest {
    private static PhoneValidate phoneValidate;
    //tạo mảng các validate và invalidate numbers
    public static final String[] validPhone = {"(03)-(0827401725)", "(81)-(0000000000)", "(00)-(0111111111)"};
    public static final String[] invalidPhone = {"(032)-(1827401725)", "(8)-(0000000000)", "(00)-(01111111117)", "()-()", "(0@.)-(8yewi)"};

    public static void main(String[] args) {
        phoneValidate = new PhoneValidate();
        //xét tất cả các phone đều là valid, xong cái nào đúng thì True, sai thì False
        for (String phone: validPhone) {
            boolean isvalid = phoneValidate.validate(phone);
            System.out.println("Phone: " + phone + " is valid - " + isvalid );
        }

        for (String phone: invalidPhone) {
            boolean isvalid = phoneValidate.validate(phone);
            System.out.println("Phone: " + phone + " is valid - " + isvalid);
        }
    }
}
