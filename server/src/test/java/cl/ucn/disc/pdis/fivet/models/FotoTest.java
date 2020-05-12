/*
 * MIT License
 *
 * Copyright (c) 2020 Álvaro Lucas Castillo Calabacero <alvarolucascc96@gmail.com>.
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

import cl.ucn.disc.pdis.fivet.zeroice.model.Foto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Alvaro
 */
public class FotoTest {

    /**
     * The Logger.
     */
    private static final Logger log = LoggerFactory.getLogger(FotoTest.class);

    /**
     * The Test of Constructor.
     */
    @Test
    public void testConstructor() {

        log.debug("Testing the Constructor ..");

        // The values
        final int id = 1;
        final String urlFoto = "url";

        // The Constructor
        final Foto fotoVacia = new Foto();
        final Foto foto = new Foto(id,urlFoto);

        // Testing
        Assertions.assertNotNull(fotoVacia,"Object not null");
        Assertions.assertNotNull(foto,"Object not null");
        Assertions.assertEquals(foto.urlFoto,urlFoto);
        //validation , ice no use a value null
        //Assertions.assertThrows(NullPointerException.class,()-> new Foto(id,null));
        log.debug("Done.");

    }
}
