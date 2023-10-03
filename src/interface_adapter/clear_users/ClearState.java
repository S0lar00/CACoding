package interface_adapter.clear_users;

// TODO Complete me

public class ClearState {private String clearMessage = "";
    private String username = "";

    public ClearState(ClearState copy) {
        clearMessage = copy.clearMessage;
        username = copy.username;
    }
    public ClearState() {}

    public String getClearMessage() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}