/**
 * Created by user on 28.06.2016.
 */
public class Entity {

    private int EntityId;
    private int EntiityIdRef;

    public void setEntityId(int EntityId) {
        this.EntityId = EntityId;
    }

    public int getEntityId() {
        return EntityId;
    }

    public void setEntiityIdRef(int EntiityIdRef) {
        this.EntiityIdRef = EntiityIdRef;
    }

    public int getEntiityIdRef() {
        return EntiityIdRef;
    }

    public Entity(int EntityId, int EntiityIdRef) {
        this.EntityId = EntityId;
        this.EntiityIdRef = EntiityIdRef;
    }
}
