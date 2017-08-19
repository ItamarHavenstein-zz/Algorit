package br.com.itamar.animais.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.itamar.animais.model.Cachorro;

public class CachorroDAO {
	private final Connection conn;

	public CachorroDAO(Connection con) {
		this.conn = con;
	}

	public boolean inserir(Cachorro cachorro) throws SQLException {
		String sql = "INSERT INTO CACHORRO (COD, NOME, COR, QTD_PERNAS, SOM) VALUES (SEQ_CACHORRO.nextval, ?, ?, ?, ?)";

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, cachorro.getNome());
		statement.setString(2, cachorro.getCor());
		statement.setInt(3, cachorro.getQtdPatas());
		statement.setString(4, cachorro.getSom());

		return statement.executeUpdate() > 0;
	}

	public boolean alterar(Integer codigo, String nome) throws SQLException {
		String sql = "UPDATE CACHORRO SET NOME = ? WHERE COD = ?";

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, nome);
		statement.setInt(2, codigo);

		return statement.executeUpdate() > 0;
	}

	public boolean excluir(Integer codigo) throws SQLException {
		String sql = "DELETE CACHORRO WHERE COD = ?";

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, codigo);

		return statement.executeUpdate() > 0;
	}

	// serve para listar os dados da tabela onde inserimos as informações sobre
	// os cachorros
	public List<Cachorro> lista() throws SQLException {
		List<Cachorro> lCachorros = new ArrayList<>();

		String sql = "select * from CACHORRO";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt("COD");
					String nome = rs.getString("NOME");
					String cor = rs.getString("COR");
					int qtdPatas = rs.getInt("QTD_PERNAS");
					String som = rs.getString("SOM");
					Cachorro cachorro = new Cachorro(codigo, nome, cor, qtdPatas, som);
					lCachorros.add(cachorro);
				}
			}
		}

		return lCachorros;
	}
}
