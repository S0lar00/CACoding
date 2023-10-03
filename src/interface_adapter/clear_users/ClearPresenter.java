package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewManagerModel;
import use_case.clear_users.ClearInputData;
import use_case.clear_users.ClearOutputBoundary;

public class ClearPresenter implements ClearOutputBoundary {
    private final ViewManagerModel viewManagerModel;
    public ClearPresenter(ViewManagerModel viewManagerModel){
        this.viewManagerModel = viewManagerModel;
    }
    @Override
    public void presentClearResult(ClearInputData ClearOutputData) {
        viewManagerModel.setActiveView("ClearConfirmationView");
        viewManagerModel.firePropertyChanged();

    }
}
