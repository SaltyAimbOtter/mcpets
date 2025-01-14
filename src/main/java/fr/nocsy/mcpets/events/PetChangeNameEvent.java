package fr.nocsy.mcpets.events;

import fr.nocsy.mcpets.data.Pet;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PetChangeNameEvent extends Event implements Cancellable {

    private boolean isCancelled = false;
    private static final HandlerList HANDLERS = new HandlerList();

    @Getter
    private Pet pet;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private boolean saveChanges;

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        isCancelled = b;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public PetChangeNameEvent(Pet pet, String name, boolean saveChanges)
    {
        this.pet = pet;
        this.name = name;
        this.saveChanges = saveChanges;
    }
}
