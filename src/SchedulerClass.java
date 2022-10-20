public class SchedulerClass {
    public static void reschedule(Event[] events, Event newEvent){
        Event[] newList = new Event[events.length+1];
        int count = 0;
        for(Event e:events){
            if(newEvent.getPriority < e.getPriority)
                newList[count++] = newEvent;
            newList[count++] = e;
        }

        //insertion sort
        for(int x = 1; x < newList.length; x++){
            Event hold = newList[x];
            int y = x -1 ;
            while((y > -1)&&(newList[y].getPriority > newList[x].getPriority)){
                newList[y+1] = newList[y];
                y--;
            }
            newList[y+1] = hold;
        }

        schedule(newList); //calls schedule method with newly prioritized list of events
    }
}
