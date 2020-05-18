package org.matsim.project;

import org.matsim.api.core.v01.Id;
import org.matsim.api.core.v01.events.LinkEnterEvent;
import org.matsim.api.core.v01.events.handler.LinkEnterEventHandler;
import scala.Int;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleLinkHandler implements LinkEnterEventHandler {

    private Map<Integer, Integer> vehiclePerHour = new HashMap<>();


    public SimpleLinkHandler(){
        for(int i=0; i<=23; i++){
            vehiclePerHour.put(i,0);
        }
    }



    @Override
    public void handleEvent(LinkEnterEvent event) {

        if(event.getLinkId().equals(Id.createLinkId(6)) /*& (event.getTime() > startTime & event.getTime() < endTime)*/) {
            int hour = (int) Math.ceil(event.getTime() / 3600);

            vehiclePerHour.put(hour, vehiclePerHour.get(hour)+1);
        }
    }

    public void print(){
        for (Integer i : vehiclePerHour.keySet()){
            System.out.println("During hour: "+ vehiclePerHour.get(i) + "vehicles ");
        }
    }


}
