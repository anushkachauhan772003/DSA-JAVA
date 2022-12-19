public class leetcode796 {
    public boolean rotateString(String s, String goal) {
        return(s.length()==goal.length() && (s+s).contains(goal));
    }
}
