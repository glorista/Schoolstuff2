package Programming2.Enums;

public class Wrapperklassen {
    public static void main(String[] args) {
        int primitiveInt= 17;

        //1. Möglichkeit
        Integer wrapperInt= primitiveInt;
        Integer wrapperInt1= 17;

        //2te Möglichkeit veraltet
        Integer wrapperInt2= Integer.valueOf(primitiveInt);
        Integer wrapperInt3= Integer.valueOf(17);

        double primitiveDouble = 1.2;
        Double wrappedDouble=1.2;

        Integer wint= null;

    }
}
