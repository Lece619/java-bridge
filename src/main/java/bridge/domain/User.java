package bridge.domain;

import java.util.ArrayList;
import java.util.List;

public class User {

    private final List<String> movings = new ArrayList<>();
    private int count;

    public User(){
        this.count = 1;
    }

    public void addMoving(String moving){
        this.movings.add(moving);
    }

    public void clearMovings(){
        this.movings.clear();
        addCount();
    }

    private void addCount(){
        count++;
    }

    public List<String> getMovings() {
        return movings;
    }

    public int getCount() {
        return count;
    }
}
