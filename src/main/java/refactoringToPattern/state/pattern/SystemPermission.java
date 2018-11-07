package refactoringToPattern.state.pattern;

public class SystemPermission {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void claimedBy(SystemUser user){
        state.claimedBy(user, this);
    }

    public void grantedBy(SystemUser user){
        state.grantedBy(user, this);
    }

    public void deniedBy(SystemUser user){
        state.deniedBy(user, this);
    }

}

class SystemUser {
}
