package interface_adapter.login;

import use_case.login.LoginInputData;
import use_case.login.LoginInputBoundary;
import use_case.signup.SignupInputBoundary;
import use_case.signup.SignupInputData;

public class LoginController {

    final LoginInputBoundary loginUseCaseInteractors;
    public LoginController(LoginInputBoundary loginUseCaseInteractors) {
        this.loginUseCaseInteractors = loginUseCaseInteractors;
    }


    public void execute(String username, String password) {
        LoginInputData loginInputData = new LoginInputData(
                username, password);

        loginUseCaseInteractors.execute(loginInputData);
    }
}
