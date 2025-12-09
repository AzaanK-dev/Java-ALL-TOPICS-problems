// Use an enum for days and print “Weekend” or “Weekday” using switch.
enum Weekdays{
    MON,TUES,WED,THURS,FRI,SAT,SUN
}
public class Weekday {
    public static void main(String[] args) {
        Weekdays day = Weekdays.MON;
        switch (day) {
            case SAT: System.out.println("Weekend!");break;
            case SUN: System.out.println("Weekend!");break;
            default: System.out.println("NOT A Weekend!");break;
        }
    }
}