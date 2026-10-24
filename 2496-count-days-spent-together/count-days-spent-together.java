class Solution {
    
    private final int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
       
        int aliceStart = convertToDayOfYear(arriveAlice);
        int aliceEnd = convertToDayOfYear(leaveAlice);
        int bobStart = convertToDayOfYear(arriveBob);
        int bobEnd = convertToDayOfYear(leaveBob);

        int latestArrival = Math.max(aliceStart, bobStart);
        int earliestLeave = Math.min(aliceEnd, bobEnd);

        if (latestArrival <= earliestLeave) {
            return earliestLeave - latestArrival + 1;
        }
        
        return 0;
    }

    private int convertToDayOfYear(String date) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));
        
        int dayCount = 0;
       
        for (int i = 0; i < month - 1; i++) {
            dayCount += months[i];
        }
      
        dayCount += day;
        
        return dayCount;
    }
}
