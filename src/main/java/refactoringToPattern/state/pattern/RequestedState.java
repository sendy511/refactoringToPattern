package refactoringToPattern.state.pattern;

public class RequestedState extends State
{
    public void claimedBy(SystemUser user, SystemPermission systemPermission){
        //Do something
        systemPermission.setState(new ClaimedState());
    }
}
