package edu.ucdavis.ecs160.hw1;

public class LoggedUser implements User {
    private User delegate;

    public LoggedUser(User delegate) {
        this.delegate = delegate;
    }

    @Override
    public String getName() {
        System.out.println("[LOG] AdminUser.getName()");
        return delegate.getName();
    }

    @Override
    public String getEmail() {
        System.out.println("[LOG] AdminUser.getEmail()");
        return delegate.getEmail();
    }

    @Override
    public void setEmail(String email) {
        System.out.println("[LOG] AdminUser.setEmail(\"" + email + "\")");
        delegate.setEmail(email);
    }
}