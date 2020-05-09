/*
 * MIT License
 *
 * Copyright (c) 2020 Diego Urrutia-Astorga <durrutia@ucn.cl>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

// https://doc.zeroc.com/ice/3.7/language-mappings/java-mapping/client-side-slice-to-java-mapping/customizing-the-java-mapping
["java:package:cl.ucn.disc.pdis.fivet.zeroice"]
module model {


    /**
         * Clase Persona
         */
         class Persona{

            /**
             * Primary Key
             */
            int id;

            /**
             * Rut: 189725965
             */
            string rut;

            /**
             * Nombre
             */
            string nombre;

            /**
             * Direccion
             */
            string direccion;

            /**
             * Telefono fijo
             */
            long telefonoFijo;

            /**
             * Telefono movil
             */
            long telefonoMovil;

            /**
             * Correo electronico
             */
             string email;


         }

         /**
          * La ficha
          */
         class Ficha {

             /**
              * Primary Key
              */
             int id;

             /**
              * Numero
              */
             int numeroFicha;

             /*
             * nombrePaciente
             */
             string nombrePaciente;

             /**
             * especie del animal
             */
             string especie;

             /**
             * fecha nacimiento:
             * format: TODO
             */
             string fechaNacimiento;

            /**
            *raza del animal
            */
            string raza;

            /**
            *sexo del animal
            */
            string sexo;

            /**
            *color del animal
            */
            string color;

            /**
            *Tipo de paciente
            */
            string tipo;

         }

         /**
         * Clase control
         */
         class Control {

         /**
         * fecha del contol
         * format: TODO
         */
         string fechaControl;

         /**
          * fecha del contol proximo
          * format: TODO
          */
          string fechaProximoControl;


         /**
         * temperatura del paciente en celcius
         */
         float temperatura;

         /**
          *peso del paciente en kg
          */
          float peso;

          /**
          *altura del paciente en cm
          */
          int altura;

          /**
          *diagnostico del paciente
          */
          string diagnostico;

          /**
          * nombre del veterinario encargado
          */
          string nombreVeterinario;
        }

        /**
        * La foto de la ficha
        */
        class Foto{
            /*
            *url o nombre del archivo de la foto
            */
            string urlFoto;
        }

        /**
        * Examen asociado a un control
        */
        class Examen{

            /**
            *nombre del examen
            */
            string nombreExamen;

            /*
            *fecha en que fue tomada el examen
            *format: TODO
            */
            string fechaExamen;
        }

        /**
         * The base system.
         */
         interface TheSystem {

            /**
             * @return the diference in time between client and server.
             */
            long getDelay(long clientTime);

         }

}
