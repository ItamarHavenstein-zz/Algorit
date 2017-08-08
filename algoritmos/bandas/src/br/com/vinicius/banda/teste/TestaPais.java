package br.com.vinicius.banda.teste;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.vinicius.banda.dao.PaisDAO;
import br.com.vinicius.banda.jdbc.oracle.ConnectionPoolOracle;
import br.com.vinicius.banda.model.Pais;

public class TestaPais {

	public static void main(String[] args) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			PaisDAO paisDAO = new PaisDAO(con);
			//paisDAO.insert("Chile");
			//paisDAO.update(22, "Chile");
			//paisDAO.delete(22);
			List<Pais> paises = paisDAO.lista();
            for(Pais pais : paises) {
                System.out.println(pais.getNome());
            }
		}
	}

}
