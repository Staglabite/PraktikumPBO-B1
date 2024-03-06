/**
 * File      : ExceptionOnArray.java
 * Deskripsi : Program penggunaan eksepsi menggunakan class library Java
 * 
 */
public class ExceptionOnArray {
    public static void main(String[] args){
        //instansiasi object array integer
        Integer[] arrayIntegers = new Integer[4];
        try{
            arrayIntegers[2] = 11;
            arrayIntegers[4] = 10;
        }catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("Clean up code...");
        }
    }
}
