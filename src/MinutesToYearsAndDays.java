public class MinutesToYearsAndDays{
    public static void printYearsAndDays(long minutes){
        String result = "Invalid value";
        long minutesPerHour = 60;
        long minutesPerDay = minutesPerHour * 24;
        long minutesPerYear = minutesPerDay * 365;
        if(minutes < 0){
            System.out.println(result);
        }else{
            result = minutes + " minutes = ";
            long years = 0;
            long days = 0;
            if(minutes >= (minutesPerYear)){
                years = minutes / minutesPerYear;
                days = (minutes % minutesPerYear) / minutesPerDay;
            }else if(minutes >= (minutesPerDay)){
                years = 0;
                days = minutes / minutesPerDay;
            }
            result += years + " years and " + days + " days";
            System.out.println(result);
        }
    }
}
