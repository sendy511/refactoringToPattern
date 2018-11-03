package refactoringToPattern.state.badExample;

// Bad Example
public class SystemPermission {
    private State state;

    public void claimedBy(){
        if(state == State.Requested){
            state = State.Claimed;
            return;
        }
    }

    public void grantedBy(){
        //
    }

    public void deniedBy(){
        //
    }

}

enum State{
    Requested,
    Claimed,
    Granted,
    Denied,
}
