public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,20));
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(barking == true && hourOfDay >=0) {
            if (hourOfDay < 8 || hourOfDay > 22) {
                if(hourOfDay < 24){
                    return true;
                }else {
                    return false;
                }
            } else{
                return false;
            }
        }
        return false;
    }
}
