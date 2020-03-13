package com.gmail.andrewandy.ascendencyserverplugin.matchmaking;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.event.impl.AbstractEvent;

public abstract class AscendencyServerEvent extends AbstractEvent {

    public boolean callEvent() {
        return Sponge.getEventManager().post(this);
    }

}
