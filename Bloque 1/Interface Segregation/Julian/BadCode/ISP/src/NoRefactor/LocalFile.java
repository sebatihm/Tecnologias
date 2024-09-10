package NoRefactor;

public class LocalFile implements FileInterface{
    private String name;
    private String ownerUserName;
    private String ownerGroupName;
    private String extension;

    public LocalFile(String name, String ownerUserName,String ownerGroupName){
        this.name = name;
        this.ownerUserName = ownerUserName;
        this.ownerGroupName = ownerGroupName;
    }

    @Override
    public void rename(String name){
        this.name = name;
    }

    @Override
    public void changeOwner(String user,String group){
        this.ownerUserName = user;
        this.ownerGroupName = group;
    }


}
