package collectionsautoboxing;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class VoteTest {

    @Test
    void getResult() {

        Map<String, VoteResult> votes = new HashMap<>();
        votes.put("Mari", VoteResult.NO);
        votes.put("Pisti", VoteResult.YES);
        votes.put("Peti", VoteResult.YES);
        votes.put("Karcsi", VoteResult.ABSTAIN);
        votes.put("Manci", VoteResult.YES);
        votes.put("Józsi", VoteResult.NO);
        votes.put("Zsiga", VoteResult.NO);
        votes.put("Julcsi", VoteResult.ABSTAIN);
        votes.put("Jancsi", VoteResult.YES);

        Map<VoteResult, Integer> testResult = new HashMap<>();
        testResult.put(VoteResult.YES, 4);
        testResult.put(VoteResult.NO, 3);
        testResult.put(VoteResult.ABSTAIN, 2);

        assertEquals(testResult, new Vote().getResult(votes));
    }
}