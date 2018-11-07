package refactoringToPattern.state.pattern;

public class ClaimedState extends State {
    public void deniedBy(SystemUser user, SystemPermission systemPermission){
        // Do something
        systemPermission.setState(new DeniedState());
    }

    public void grantedBy(SystemUser user, SystemPermission systemPermission){
        // Do something
        systemPermission.setState(new GrantedState());
    }
}
