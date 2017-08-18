package Despertador;

import java.util.Date;

public interface Relogio {

	void setHorario(Date horario);
	Date getHorario();
	void setHorarioAlarme(Date horarioalarme);
	Date getHorarioAlarme();
	void LigarAlarme();
	void DesligarAlarme();
	void setVolumeRelogio(int volRelogio);
	int getVolumeRelogio();
	
}
