public class findString {
    public static void main(String[] args) {
        String str1 = "Java is fun";
        int result;


        result = str1.indexOf('s');

        System.out.println(result);


        result = str1.lastIndexOf('J');
        System.out.println(result);
    }
}
