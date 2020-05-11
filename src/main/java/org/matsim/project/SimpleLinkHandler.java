package org.matsim.project;

import org.matsim.api.core.v01.Id;
import org.matsim.api.core.v01.events.LinkEnterEvent;
import org.matsim.api.core.v01.events.handler.LinkEnterEventHandler;

import java.util.List;

public class SimpleLinkHandler implements LinkEnterEventHandler {
    @Override
    public void handleEvent(LinkEnterEvent event) {
        Double startTime = 12233.8;
        Double endTime = 23344.9;

        if(event.getLinkId().equals(Id.createLinkId(6)) /*& (event.getTime() > startTime & event.getTime() < endTime)*/) {
            System.out.println("Link ID: " + event.getLinkId() + " enter Time: " + event.getTime());
        }

    }
}
