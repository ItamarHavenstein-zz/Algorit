package br.com.vinicius.banda.teste;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.vinicius.banda.dao.BandaDAO;
import br.com.vinicius.banda.jdbc.oracle.ConnectionPoolOracle;
import br.com.vinicius.banda.model.Banda;

public class TestaBanda {

	public static void main(String[] args) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			List<Banda> bandas = new BandaDAO(con).lista();
            for(Banda banda : bandas) {
                System.out.println(banda.getNome());
            }
		}
	}

}
