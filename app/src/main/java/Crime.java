import java.util.UUID;

public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime(){
        //Generate Unique Identifier
        mId = UUID.randomUUID();
    }
    public UUID getID(){
        return mId;
    }
    public String getTitle(){
        return mTitle;
    }
    public void setTitle(String title){
        mTitle = title;
    }
}
