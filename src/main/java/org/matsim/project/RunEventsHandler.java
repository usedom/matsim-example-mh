package org.matsim.project;

import org.matsim.core.api.experimental.events.EventsManager;
import org.matsim.core.events.EventsUtils;
import org.matsim.core.events.MatsimEventsReader;

public class RunEventsHandler {
    public static void main(String[] args) {

        String inputFile = "output100/output_events.xml.gz";

        EventsManager eventsManager = EventsUtils.createEventsManager();

        SimpleLinkHandler eventHandler = new SimpleLinkHandler();
        eventsManager.addHandler(eventHandler);

        MatsimEventsReader eventsReader = new MatsimEventsReader(eventsManager);
        eventsReader.readFile(inputFile);
    }
}
