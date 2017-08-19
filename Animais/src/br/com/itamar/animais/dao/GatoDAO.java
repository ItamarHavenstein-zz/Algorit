package br.com.itamar.animais.dao;

import br.com.itamar.animais.model.Gato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class GatoDAO {
	private final Connection conn1;

	public GatoDAO(Connection con){
	 this.conn1 = con;
 }
	public boolean inserir(Gato gato) throws SQLException{
		String sql = "INSERT INTO GATO(COD,NOME,COR,QTD_PERNAS,SOM) VALUES(SEQ_GATO.nextval,?,?,?,?)";
		
		PreparedStatement statement = conn1.prepareStatement(sql);
		statement.setString(1, gato.getNome());
		statement.setString(2, gato.getCor());
		statement.setInt(3, gato.getQtdPatas());
		statement.setString(4, gato.getSom());

		return statement.executeUpdate() > 0;
	}
	
}
