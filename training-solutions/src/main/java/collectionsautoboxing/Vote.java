package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Vote {

    public Map<VoteResult, Integer> getResult(Map<String, VoteResult> votes) {
        Map<VoteResult, Integer> result = new HashMap<>();
        int yes = 0;
        int no = 0;
        int abstain = 0;
        for (Map.Entry<String, VoteResult> entry: votes.entrySet()) {
            switch (entry.getValue()) {
                case YES: yes++;
                break;
                case NO: no++;
                break;
                case ABSTAIN: abstain++;
            }
        }
        result.put(VoteResult.YES, yes);
        result.put(VoteResult.NO, no);
        result.put(VoteResult.ABSTAIN, abstain);
        return result;
    }
}
