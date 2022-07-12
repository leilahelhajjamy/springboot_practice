package com.example.multiplicationboot.challenge;


import lombok.Value;

@Value
public class ChallengeAttemptDTO {
     int factorA, factorB;
     String userAlias;
     int guess;

}
