/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GameFiles;
import java.util.Random;
/**
 *
 * @author Connor
 */
public class Randomizer {
    /**
     * Generate whole numbers between the given ranges. Start is minimum number. End is max number.
     * Altered code by: Connor Belanger. Original code by: Hirondelle Systems
     * @param Start
     * @param End
     * @param random
     * @return
     */
    public static float RandomInteger(int Start, int End) {
        Random random = new Random();
        long range = (long)End - (long)Start + 1;
        long fraction = (long)(range * random.nextDouble());
        float randomNumber = (float)(fraction + Start);
        return randomNumber;
    }
}
// Copyright (c) 2002-2009, Hirondelle Systems
 //All rights reserved.

// Redistribution and use in source and binary forms, with or without
 //modification, are permitted provided that the following conditions are met:

    // * Redistributions of source code must retain the above copyright
     //  notice, this list of conditions and the following disclaimer.
    // * Redistributions in binary form must reproduce the above copyright
      // notice, this list of conditions and the following disclaimer in the
      // documentation and/or other materials provided with the distribution.
    // * Neither the name of Hirondelle Systems nor the
     //  names of its contributors may be used to endorse or promote products
     //  derived from this software without specific prior written permission.

// THIS SOFTWARE IS PROVIDED BY HIRONDELLE SYSTEMS ''AS IS'' AND ANY
// WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
// DISCLAIMED. IN NO EVENT SHALL HIRONDELLE SYSTEMS BE LIABLE FOR ANY
// DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
//(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
// LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
// ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
// (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
// SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.