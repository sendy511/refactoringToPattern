package refactoringToPattern.state.pattern;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public abstract class State {
    public void claimedBy(SystemUser user, SystemPermission systemPermission){
        throw new NotImplementedException();
    }

    public void grantedBy(SystemUser user, SystemPermission systemPermission){
        throw new NotImplementedException();
    }

    public void deniedBy(SystemUser user, SystemPermission systemPermission){
        throw new NotImplementedException();
    }
}
