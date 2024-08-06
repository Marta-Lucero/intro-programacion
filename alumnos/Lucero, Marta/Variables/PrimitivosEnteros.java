public class PrimitivosEnteros {

    public static void main(String[] args) {
        byte numeroByte = 127;
        System.out.println("NumeroByte: " + numeroByte);

        System.out.println("Tipo byte corresponde en byte a:" + Byte.BYTES);
        System.out.println("Valor maximo de un byte:" + Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte:" + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("NumeroShort:" + numeroShort);

        System.out.println("Tipo short corresponde en byte a:" + Short.BYTES);
        System.out.println("Valor maximo de un short:" + Short.MAX_VALUE);
        System.out.println("Valor minimo de un short" + Short.MIN_VALUE);

        int numeroInt = 453517;
        System.out.println("NumeroInt: " + numeroInt);

        System.out.println("tipo int corresponde en byte a: " + Integer.BYTES);
        System.out.println("tipo int corresponde en bits a: " + Integer.SIZE);
        System.out.println("Valor maximo de un int: " + Integer.MAX_VALUE);
        System.out.println("Valor minimo de un int: " + Integer.MIN_VALUE);

        long numeroLong = 1315453517;
        System.out.println("NumeroLong: " + numeroLong);

        System.out.println("tipo long corresponde en byte a: " + Long.BYTES);
        System.out.println("tipo long corresponde en bits a: " + Long.SIZE);
        System.out.println("Valor maximo de un long: " + Long.MAX_VALUE);
        System.out.println("Valor minimo de un long: " + Long.MIN_VALUE);
    }


}