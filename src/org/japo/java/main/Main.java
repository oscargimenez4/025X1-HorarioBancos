/* 
 * Copyright 2019 Oscar G.4 - oscargimenez4@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Oscar G.4 - oscargimenez4@gmail.com
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");
    public static final Random RND = new Random();

    public static void main(String[] args) {

        final int H_MIN = 10;
        final int M_MIN = 30;
        int tmpMin = H_MIN * 60 + M_MIN;
        final int H_MAX = 12;
        final int M_MAX = 15;
        int tmpMax = H_MAX * 60 + M_MAX;

        //Variables Random
        int hRnd;
        int mRnd;
        //Variables Entrada
        int hUsr;
        int mUsr;

        hRnd = RND.nextInt(23 - 0 + 1) + 0;
        mRnd = RND.nextInt(60 - 0 + 1) + 0;
        System.out.printf("Horario aleatorio... : %02d:%02d%n", hRnd, mRnd);
        int tmpRnd = hRnd * 60 + mRnd;
        boolean horarioRnd = tmpRnd >= tmpMin && tmpRnd <= tmpMax;
        System.out.printf("¿Horario de oficina? %b%n", horarioRnd);
        //Entrada Consola
        try {
            System.out.print("Introducir hora.....: ");
            hUsr = SCN.nextInt();
            System.out.print("Introducir minuto...: ");
            mUsr = SCN.nextInt();
            System.out.printf("La hora es ...: %02d:%02d%n", hUsr, mUsr);
            int tmpUsr = hUsr * 60 + mUsr;

            boolean horarioUsr = tmpUsr >= tmpMin && tmpUsr <= tmpMax;
            System.out.printf("¿Horario de oficina? %b%n", horarioUsr);
        } catch (Exception e) {
            System.out.println("Error, dato incorrecto.... ");
        } finally {
            SCN.nextLine();
        }
    }
}
