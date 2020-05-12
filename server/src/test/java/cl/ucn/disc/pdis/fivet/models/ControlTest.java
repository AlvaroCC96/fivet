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

package cl.ucn.disc.pdis.fivet.models;

import cl.ucn.disc.pdis.fivet.zeroice.model.Control;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class ControlTest {

    /**
     * The Logger.
     */
    private static final Logger log = LoggerFactory.getLogger(ExamenTest.class);

    /**
     * The Test of Constructor.
     */
    @Test
    public void testConstructor() {

        log.debug("Testing the Constructor ..");

        // The values
        final int id=1;
        final String fechaControl = "fecha1";
        final String fechaProximoControl = "fecha2";
        final float temperatura =  1.3f;
        final float peso =  1.5f;
        final int altura = 145;
        final String diagnostico ="muy malito :(";
        final String nombreVeterinario = "Doc1";

        // The Constructor
        final Control controlVacio = new Control();
        final Control control = new Control(id,fechaProximoControl,fechaProximoControl,temperatura,peso,altura,
                                            diagnostico,nombreVeterinario);
        // Testing
        Assertions.assertNotNull(controlVacio,"Object not null");
        Assertions.assertNotNull(control,"Object not null");
        log.debug("Done.");

    }
}
