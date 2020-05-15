/*
 * MIT License
 *
 * Copyright (c) 2020 Alvaro Lucas Castillo Calabacero <alvarolucascc96@gmail.com>.
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

package cl.ucn.disc.pdis.fivet.repository;

import cl.ucn.disc.pdis.fivet.models.Persona;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;
import java.util.List;

public class RepositorySingletonTest {

    /**
     * the logger
     */
    private static final Logger log = LoggerFactory.getLogger(RepositorySingletonTest.class);

    @Test
    public void testSingleton() throws SQLException {
        //inicializated singleton;
        RepositorySingleton singleton = RepositorySingleton.getInstancia();
        Assertions.assertNotNull(singleton,"singleton null?");

        //The Persona
        Persona persona = new Persona("Alvaro","Castillo","189725965");

        //insert persona
        boolean respuesta =singleton.getPersonaRepository().crear(persona);
        Assertions.assertEquals(true,respuesta);
;
        //Get from db
        Persona personaDB = singleton.getPersonaRepository().buscar(persona.getId());
        Assertions.assertNotNull(personaDB,"personaDB not null ?");

        //compare persona == personaDB
        Assertions.assertEquals(persona.getNombre(),personaDB.getNombre(),"Names are equals?");
        Assertions.assertEquals(persona.getApellido(),personaDB.getApellido(),"Surname are equals?");
        Assertions.assertEquals(persona.getRut(),personaDB.getRut(),"Ruts are equals?");

        //Search by rut: Select * FROM  'persona' WHERE 'rut' = '189725965'
        List<Persona> personaList = singleton.getPersonaRepository().buscarParametro("rut","189725965");
        Assertions.assertEquals(1,personaList.size(),"1 person only");

        //Not found rut
        Assertions.assertEquals(0,singleton.getPersonaRepository().buscarParametro("rut","19")
                                .size(),"Found somethings?");

    }
}
