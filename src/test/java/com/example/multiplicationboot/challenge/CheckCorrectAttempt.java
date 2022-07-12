package com.example.multiplicationboot.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.BDDAssertions.then;


public class CheckCorrectAttempt {
    private ChallengeService challengeService ;
    @BeforeEach
    public void setUp(){
        challengeService = new ChallengeServiceImpl();

    }

    @Test
    public void checkCorrectAnswer(){
        ChallengeAttemptDTO challengeAttemptDTO = new ChallengeAttemptDTO(50,60,"LAILA", 3000);
        ChallengeAttempt challengeAttempt = challengeService.verifyAttempt(challengeAttemptDTO);
        then(challengeAttempt.isCorrect()).isTrue();
    }

    @Test
    public void checkWrongAnswer(){
        ChallengeAttemptDTO challengeAttemptDTO = new ChallengeAttemptDTO(50,60,"LAILA", 5000);
        ChallengeAttempt challengeAttempt = challengeService.verifyAttempt(challengeAttemptDTO);
        then(challengeAttempt.isCorrect()).isFalse();
    }
}
