package whatever.java.alarm;

public class AlarmTime {

    int hour;   // 0~23
    int minute; // 0~59
    boolean active;

    public AlarmTime(int hour, int minute){
        if((hour>=0 && hour<24) && (minute>=0 && minute<60)) {
            this.hour = hour;
            this.minute = minute;
        } else {
            System.out.println("hour: 0~23, minute: 0~59");
        }
    }
    public AlarmTime(int hour, int minute, boolean active){
        // this() 에서 hour, minute 범위를 걸러내기 때문에 여기에는 딱히 필요없음
        this(hour, minute); // this() 호출
        this.active = active;
    }

    public boolean isActive(){
        return active;
    }

    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        if(hour>=0 && hour<24) {
            this.hour = hour;
        } else {
            System.out.println("hour: 0~23");
        }
    }

    public int getMinute(){
        return minute;
    }

    public void setMinute(int minute) {
        if(minute>=0 && minute<60) {
            this.minute = minute;
        } else {
            System.out.println("minute: 0~59");
        }
    }

    public void printHourMinute() {
        if(isActive()){
            System.out.printf("%d : %d\n", hour, minute);
        }
    }

    public static void main(String[] args) {
        AlarmTime[] arr = new AlarmTime[10];

        AlarmTime alarmTime1 = new AlarmTime(9, 0, false);
        AlarmTime alarmTime2 = new AlarmTime(10, 30, true);
        AlarmTime alarmTime3 = new AlarmTime(24, 0);
        AlarmTime alarmTime4 = new AlarmTime(23, 65);
        AlarmTime alarmTime5 = new AlarmTime(23, 59, true);

        arr[0] = alarmTime1;
        arr[1] = alarmTime2;
        arr[2] = alarmTime3;
        arr[3] = alarmTime4;
        arr[4] = alarmTime5;

        System.out.println("알람시간 변경 전");
        for(int i=0; i<5; i++) {
            arr[i].printHourMinute();
        }

        System.out.println("알람시간 변경 후");

        arr[1].setHour(8);
        arr[1].setMinute(10);

        for(int i=0; i<5; i++) {
            arr[i].printHourMinute();
        }
    }
}
