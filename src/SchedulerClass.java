public class SchedulerClass {
    public void Schedule(Event[] events){
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

            }
        }
    }
}
