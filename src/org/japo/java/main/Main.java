/* 
 * Copyright 2019 User.
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
 * @author Mario Merlos Abella <mario.merlos.alum@iescamp.es>
 */
public class Main {


    public static final Random RND = new Random();

    public static void main(String[] args) {

        //variables & Constantes
        final int MAX = 500;
        final int MIN = 0;

        int dia;
        int dMax = 0;
        int dMin = 0;
        int lluvia;
        int tLluvia = 0;
        int maxLluvia = 0;
        int minLluvia = 500;

        //Inicio bucle
        dia = 1;
        System.out.printf("Control de lluvias semanal%n");
        System.out.println("=============================");
        do {
            int valor = RND.nextInt(MAX - MIN + 1) + MIN;
            tLluvia += valor;
            lluvia = valor;
            System.out.printf("Lluvia durante el día %d ....: "
                    + "%d L/metro cuadrado%n", dia, lluvia);
            if (maxLluvia <= lluvia) {
                maxLluvia = lluvia;
                dMax = dia;

            }
            if (minLluvia >= lluvia) {
                minLluvia = lluvia;
                dMin = dia;
            }
            dia++;
        } while (dia
                <= 7);
        System.out.println("---");
        System.out.printf("Lluvia total durante la semana ....: %d%n", tLluvia);
        //Día lluvia máxima
        System.out.printf("Lluvia máxima registrada fue el día"
                + " %d con ..: %d L/metros cuadrados%n", dMax, maxLluvia);
        //Día lluvia mínima
        System.out.printf("Lluvia mínima registrada fue el día"
                + " %d con ..: %d L/metros cuadrados%n", dMin, minLluvia);
        System.out.println("END");

    }

}