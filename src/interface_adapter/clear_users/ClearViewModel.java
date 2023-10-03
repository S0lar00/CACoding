package interface_adapter.clear_users;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ClearViewModel {public final String TITLE_LABEL = "Clear Users View";
    public final String CLEAR_BUTTON_LABEL = "Clear Users";

    private ClearState state = new ClearState();

    public ClearViewModel() {
        super();
    }

    public void setState(ClearState state) {
        this.state = state;
    }

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    public void firePropertyChanged() {
        support.firePropertyChange("state", null, this.state);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public ClearState getState() {
        return state;
    }
}
