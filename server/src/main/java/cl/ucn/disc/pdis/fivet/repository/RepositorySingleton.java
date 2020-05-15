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
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

import java.sql.SQLException;

public class RepositorySingleton {
    /**
     * instance for Singleton Patron
     */
    private RepositorySingleton instancia;

    /**
     * Persona repository.
     */
    private RepositoryIMPL<Persona, Long> PersonaRepository;
    //TODO: create others repositories by models

    private RepositorySingleton() throws SQLException {
        try {
            ConnectionSource connectionSource = new JdbcConnectionSource("jdbc:h2:mem:fivet");
            this.PersonaRepository = new RepositoryIMPL<Persona, Long>(connectionSource, Persona.class);
            //TODO: inicializated others repositories from other todo

        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    /**
     * return a unique instance for Singleton Patron
     * @return instancia
     */
    public RepositorySingleton getInstancia() throws SQLException {
        if (instancia == null ) {
            instancia = new RepositorySingleton();
        }
        return instancia;
    }



}
