package use_case.clear_users;

// TODO Complete me

public class ClearOutputData {
    private boolean success;
    private final String username;
    public ClearOutputData(String username, boolean success){
        this.success = success;
        this.username = username;
    }
    public String getMessage() {
        return username;
    }
}
