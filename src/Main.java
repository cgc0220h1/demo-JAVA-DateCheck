public class Main {
    public static void main(String[] args) {
        //Test năm nhuận
        Date date = new Date(12,3,2016);
        System.out.println(date.toString());
        System.out.println("Is Leap year: " + date.isLeapYear());

        //Test năm không nhuận
        Date date1 = new Date(31,12,2002);
        System.out.println(date1.toString());
        System.out.println("Is Leap year: " + date1.isLeapYear());
    }
}
