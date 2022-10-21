public class SchedulerClass {
    public void Schedule(Event[] events){
        //will need to seperate into dynamic and fixed events

        for(int x = 0; x < events.length; x++) {
            String now = events[x].getCurrentDate();
            String finish = events[x].getEndDate();
            if(Integer.parseInt(now.substring(0, 4)) > Integer.parseInt(finish.substring(0, 4))){
                //remove current event because it is past its due time
            }
            else if(Integer.parseInt(now.substring(5, 7)) > Integer.parseInt(finish.substring(5, 7))){
                //remove current event because it is past its due time
            }
            else if(Integer.parseInt(now.substring(8, 10)) > Integer.parseInt(finish.substring(8, 10))){
                //remove current event because it is past its due time
            }
            //This is where the scheduling actually takes place
            else{
                int timeAvailable = 0;
                if(Integer.parseInt(now.substring(5, 7)) == Integer.parseInt(finish.substring(5, 7))){
                    timeAvailable += (Integer.parseInt(finish.substring(8, 10)) - Integer.parseInt(now.substring(8, 10)))*48;
                    timeAvailable += (Integer.parseInt(finish.substring(14, 16)) - Integer.parseInt(now.substring(14, 16)))*2;
                }
                //the next case is for if it crosses months
                //then the one after that is for if it crosses a year
                //then calculate how long until, let's say 11 when the sleep time kicks in and schedule time in there then keep going
                //will have to check that it doesn't overlap with any fixed blocks of time
            }
        }
    }
}
