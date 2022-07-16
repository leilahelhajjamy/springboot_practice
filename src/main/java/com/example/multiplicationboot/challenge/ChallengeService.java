package com.example.multiplicationboot.challenge;

import java.util.List;

public interface ChallengeService {
    ChallengeAttempt verifyAttempt(ChallengeAttemptDTO resultAttempt);
    List<ChallengeAttempt> getStatsForUser(String userALias);
}
