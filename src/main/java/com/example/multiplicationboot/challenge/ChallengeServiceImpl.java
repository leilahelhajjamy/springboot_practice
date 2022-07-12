package com.example.multiplicationboot.challenge;

import com.example.multiplicationboot.user.User;
import org.springframework.stereotype.Service;

@Service
public class ChallengeServiceImpl implements ChallengeService{
    @Override
    public ChallengeAttempt verifyAttempt(ChallengeAttemptDTO resultAttempt) {
       boolean isCorrect = resultAttempt.getGuess() == resultAttempt.getFactorA() * resultAttempt.getFactorB();
       User user = new User(null , resultAttempt.getUserAlias());
       ChallengeAttempt challengeAttempt = new ChallengeAttempt(null , user.getId(), resultAttempt.getFactorA(),
               resultAttempt.getFactorB(), resultAttempt.getGuess(), isCorrect);
       return challengeAttempt;
    }
}
