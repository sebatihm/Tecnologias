package NoRefactor;

public class DropboxFile implements FileInterface{
    private String name;
    private String ownerUserName;
    private String ownerGroupName;

    public DropboxFile(String name, String ownerUserName,String ownerGroupName){
        this.name = name;
        this.ownerUserName = ownerUserName;
        this.ownerGroupName = ownerGroupName;
    }

    @Override
    public void changeOwner(String user,String group){
        // 
    }
    @Override
    public void rename(String name){
        this.name = name;
    }

    
}