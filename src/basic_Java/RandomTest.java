/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_Java;

import java.util.Random;
import java.util.UUID;

/**
 *
 * @author Guilherme
 */
public class RandomTest {

    public static void main(String[] args) {
        
        //Random rd = new Random();
        UUID uuid = UUID.randomUUID();
        String randomString = uuid.toString();
        

        for (int i = 0; i < 5; i++) {
            System.out.println(randomString.substring(0,20));
        }
    }
}
