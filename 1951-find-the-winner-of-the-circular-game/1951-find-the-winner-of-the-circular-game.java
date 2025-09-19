import java.util.*;

class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        
        // add players 1 to n
        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }
        
        // eliminate until one left
        while (q.size() > 1) {
            // move first k-1 players to the back
            for (int i = 1; i < k; i++) {
                q.offer(q.poll());
            }
            // eliminate the k-th player
            q.poll();
        }
        
        return q.poll(); // last player
    }
}
