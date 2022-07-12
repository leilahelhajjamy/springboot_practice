package com.example.multiplicationboot.challenge;


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class ChallengeAttempt {
    private Long Id;
    private Long UserId;
    private int factorA;
    private int factorB;
    private int resultAttempt;
    private boolean correct;

}
