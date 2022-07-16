package com.example.multiplicationboot.challenge;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;


@Value
public class ChallengeAttemptDTO {
     @Min(1) @Max(99)
     int factorA, factorB;
     @NotBlank
     String userAlias;
     @Positive(message = "How could you possibly get a negative result here? Try again.")
     int guess;
     @JsonCreator
     ChallengeAttemptDTO(@JsonProperty("factorA") int factorA ,
                         @JsonProperty("factorB") int  factorB,
                         @JsonProperty("userAlias") String userAlias,
                         @JsonProperty("guess") int guess){
          this.factorA = factorA;
          this.factorB = factorB;
          this.userAlias = userAlias;
          this.guess = guess;


     }


}
