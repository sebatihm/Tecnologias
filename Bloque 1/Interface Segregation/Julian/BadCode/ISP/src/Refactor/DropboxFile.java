package Refactor;
public class DropboxFile implements SupportsRenaming {

    private String name;
    private final String OWNER_USERNAME;
    private final String OWNER_GROUP_NAME;

    public DropboxFile(String name, String OWNER_USERNAME, String OWNER_GROUP_NAME) {
        this.name = name;
        this.OWNER_USERNAME = OWNER_USERNAME;
        this.OWNER_GROUP_NAME = OWNER_GROUP_NAME;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOWNER_USERNAME() {
        return OWNER_USERNAME;
    }

    public String getOWNER_GROUP_NAME() {
        return OWNER_GROUP_NAME;
    }

    @Override
    public void rename(String name) {
        this.name = name;
    }
}