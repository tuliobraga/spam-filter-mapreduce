/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spamfilter.naivebayes.probability;

import spamfilter.naivebayes.vocabulary.StringCounter;

/**
 *
 * @author tuliobraga
 */
public class HamProbability extends Probability {

    public HamProbability(StringCounter wordCounter, StringCounter generalWordCounter) {
        super(wordCounter, generalWordCounter);
    }
    
}
