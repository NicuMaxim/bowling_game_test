Run BowlingGame.java and follow the instructions



                                          Bowling Game Test
                                          
                                          
Objective
Write an application that can keep track of a bowling game score for one player.


Guidelines

- There is no need to develop any UI
- The application can hold state – no need to use DB etc
- No need to complete the entire application. The end result does not have to work perfect but it must compile
- Take your time. Write the code the way you think code should be


Bowling Rules

A game consists of ten frames, which start with a full rack of ten pins. In each frame, 
you have two deliveries of your ball, in which to knock down as many of the ten pins as you can.

If you knock down all the pins on your first ball, it is called a strike. The score doesn't get added
on straight away because for a strike, you get the values of your next two balls as a bonus.
For example, if you score a strike in the first frame, then an 7 and 1 in the second frame,
you would score 18 (10+7+1) for the first frame, and 8 for the second frame, making a total
of 26 after two frames.

If you knock down some of the pins on the first ball, and knocked down the remainder of the pins
in the second ball, it is known as a spare. Again, the score doesn't get added on straight away
because for a spare, you get the values of your next ball as a bonus. For example, you if score
a spare in the first frame, say an 6 and a 4, then got an 8 and a 1 in the second frame, you would
score 18 (6+4+8) for the first frame, and 9 for the second frame, making a total of 27 after two frames.

When it comes to the final frame, it is slightly different. In the final frame, you get bonus balls
if you strike or spare, to a maximum of three deliveries. If you strike in the first delivery you
have the opportunity to strike in the remaining two and have three deliveries in total. If you scored strikes
in each of your final three deliveries, the score for the final frame would be 30 (10+10+10). If you spare
the final frame, you get the third delivery as a bonus. So, a spare, 9 and 1, followed by a strike
would equal 20 (9+1+10).