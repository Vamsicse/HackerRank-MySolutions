import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Locks {

    static int check(List<String> list){
        Set<Integer> acquireLog = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        int size=list.size();
        for(int i=0;i<size;i++){
            String[] item = list.get(i).split(" ");
            String currentAction = item[0];
            int currentResource = Integer.parseInt(item[1]);
            if(currentAction.equals("RELEASE")) {
                if((!acquireLog.contains(currentResource)) || stack.pop()!=currentResource){
                    return i+1;
                }
                acquireLog.remove(currentResource);
            }
            else {
                if(acquireLog.contains(currentResource)){
                    return i+1;
                }
                stack.push(currentResource);
                acquireLog.add(currentResource);
            }
        }
        if(!acquireLog.isEmpty()){
            return size+1;
        }
        return 0;
    }

    public static void main(String[] args) {
        List<String> actions = new ArrayList<>();
        actions.add("ACQUIRE 364");
        actions.add("ACQUIRE 84");
        actions.add("RELEASE 84");
        actions.add("RELEASE 364");
        System.out.println(check(actions));

        actions.clear();
        actions.add("ACQUIRE 123");
        actions.add("ACQUIRE 364");
        actions.add("ACQUIRE 84");
        actions.add("RELEASE 84");
        actions.add("RELEASE 364");
        actions.add("ACQUIRE 456");
        System.out.println(check(actions));

        actions.clear();
        actions.add("ACQUIRE 123");
        actions.add("ACQUIRE 364");
        actions.add("ACQUIRE 84");
        actions.add("RELEASE 84");
        actions.add("RELEASE 364");
        actions.add("ACQUIRE 789");
        actions.add("RELEASE 456");
        actions.add("RELEASE 123");
        System.out.println(check(actions));
        actions.clear();

        actions.add("ACQUIRE 364");
        actions.add("ACQUIRE 84");
        actions.add("ACQUIRE 364");
        actions.add("RELEASE 364");
        System.out.println(check(actions));
    }

}
