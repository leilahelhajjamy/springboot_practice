package com.example.multiplicationboot.challenge;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ChallengeGeneratorServiceImpl implements ChallengeGeneratorService{
    private final static int MAXIMUM_FACTOR = 100;
    private final static int MINIMUM_FACTOR = 11;
    private Random random = new Random();
    ChallengeGeneratorServiceImpl(){

    }

    public int next() {
        return random.nextInt(MAXIMUM_FACTOR-MINIMUM_FACTOR)+MINIMUM_FACTOR;

    }
    public ChallengeGeneratorServiceImpl(final Random random){
         this.random = random;
    }
    @Override
    public Challenge randomChallenge() {
        return new Challenge(next() , next());
    }
}
