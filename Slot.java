/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 *
 * @author 1146355
 */
public class Slot {
    
    private int dia;
    private int horario;
    private String descHora;
    private Musica musica;
    
    

    /**
     * @return the dia
     */
    
    public Slot(int dia, int horario, Musica musica) {
    	
    	this.dia = dia;
    	this.horario = horario;
    	this.musica = musica;
    	
    	
    	
    	if(horario == 1) {
    		this.descHora = "00:00";
    	}
    	else if(horario == 2) {
    		this.descHora = "00:05";
    	}
    	else if(horario == 3) { 
    		this.descHora = "00:10";
    	}
    	else if(horario == 4) {
    		this.descHora = "00:15";
    	}
    	else if(horario == 5) {
    		this.descHora = "00:20";
    	}
    	else if(horario == 6) {
    		this.descHora = "00:25";
    	}
    	else if(horario == 7) {
    		this.descHora = "00:30";
    	}
    	else if(horario == 8) {
    		this.descHora = "00:35";
    	}
    	else if (horario 9) { 
          this.descHora = "00:40";
        }
        else if (horario 10) { 
          this.descHora = "00:45";
        }
        else if (horario 11) { 
          this.descHora = "00:50";
         }
        else if (horario 12) { 
          this.descHora = "00:55";
        }
        else if (horario 13) { 
          this.descHora = "01:00";}
        }
        else if (horario 14) { 
          this.descHora = "01:05";}
        }
        else if (horario 15) { 
          this.descHora = "01:10";
        }
        else if (horario 16) { 
          this.descHora = "01:15";
        }
        else if (horario 17) { 
          this.descHora = "01:20";
        } 
        else if (horario 18) { 
          this.descHora = "01:25";
        }
         else if (horario 19) { 
          this.descHora = "01:30";
        }
        else if (horario 20) { 
          this.descHora = "01:35";
         }
        else if (horario 21) { 
          this.descHora = "01:40";
        }
        else if (horario 22) { 
          this.descHora = "01:45";}
        }
        else if (horario 23) { 
          this.descHora = "01:50";}
        }
        else if (horario 24) { 
          this.descHora = "01:55";
        }
        else if (horario 25) { 
          this.descHora = "02:00";
        }
        else if (horario 26) { 
          this.descHora = "02:05";
        } 
        else if (horario 27) { 
          this.descHora = "02:10";
        }
         else if (horario 28) { 
          this.descHora = "02:15";
        }
        else if (horario 29) { 
          this.descHora = "02:20";
         }
        else if (horario 30) { 
          this.descHora = "02:25";
        }
        else if (horario 31) { 
          this.descHora = "02:30";}
        }
        else if (horario 32) { 
          this.descHora = "02:35";}
        }
        else if (horario 33) { 
          this.descHora = "02:40";
        }
        else if (horario 34) { 
          this.descHora = "02:45";
        }
        else if (horario 35) { 
          this.descHora = "02:50";
        } 
        else if (horario 36) { 
          this.descHora = "02:55";
        }
         else if (horario 37) { 
          this.descHora = "03:00";
        }
        else if (horario 38) { 
          this.descHora = "03:05";
         }
        else if (horario 39) { 
          this.descHora = "03:10";
        }
        else if (horario 40) { 
          this.descHora = "03:15";}
        }
        else if (horario 41) { 
          this.descHora = "03:20";}
        }
        else if (horario 42) { 
          this.descHora = "03:25";
        }
        else if (horario 43) { 
          this.descHora = "03:30";
        }
        else if (horario 44) { 
          this.descHora = "03:35";
          } 
        else if (horario 45) { 
          this.descHora = "03:40";
        }
         else if (horario 46) { 
          this.descHora = "03:45";
        }
        else if (horario 47) { 
          this.descHora = "03:50";
         }
        else if (horario 48) { 
          this.descHora = "03:55";
        }
        else if (horario 49) { 
          this.descHora = "04:00";}
        }
        else if (horario 50) { 
          this.descHora = "04:05";}
        }
        else if (horario 51) { 
          this.descHora = "04:10";
        }
        else if (horario 52) { 
          this.descHora = "04:15";
        }
        else if (horario 53) { 
          this.descHora = "04:20";
        } 
        else if (horario 54) { 
          this.descHora = "04:25";
        }
         else if (horario 55) { 
          this.descHora = "04:30";
        }
        else if (horario 56) { 
          this.descHora = "04:35";
        }
        else if (horario 57) { 
          this.descHora = "04:40";
        }
        else if (horario 58) { 
          this.descHora = "04:45";}
        }
        else if (horario 59) { 
          this.descHora = "04:50";}
        }
        else if (horario 60) { 
          this.descHora = "04:55";
        }
        else if (horario 61) { 
          this.descHora = "05:00";
        }
        else if (horario 62) { 
          this.descHora = "05:05";
        } 
        else if (horario 63) { 
          this.descHora = "05:10";
        }
         else if (horario 64) { 
          this.descHora = "05:15";
        }
        else if (horario 65) { 
          this.descHora = "05:20";
         }
        else if (horario 66) { 
          this.descHora = "05:25";
        }
        else if (horario 67) { 
          this.descHora = "05:30";}
        }
        else if (horario 98) { 
          this.descHora = "05:35";}
        }
        else if (horario 69) { 
          this.descHora = "05:40";
        }
        else if (horario 70) { 
          this.descHora = "05:45";
        }
        else if (horario 71) { 
          this.descHora = "05:50";
        } 
        else if (horario 72) { 
          this.descHora = "05:55";
        }
         else if (horario 73) { 
          this.descHora = "06:00";
        }
        else if (horario 74) { 
          this.descHora = "06:05";
         }
        else if (horario 75) { 
          this.descHora = "06:10";
        }
        else if (horario 76) { 
          this.descHora = "06:15";}
        }
        else if (horario 77) { 
          this.descHora = "06:20";}
        }
        else if (horario 78) { 
          this.descHora = "06:25";
        }
        else if (horario 79) { 
          this.descHora = "06:30";
        }
        else if (horario 80) { 
          this.descHora = "06:35";
          } 
        else if (horario 81) { 
          this.descHora = "06:40";
        }
         else if (horario 82) { 
          this.descHora = "06:45";
        }
        else if (horario 83) { 
          this.descHora = "06:50";
         }
        else if (horario 84) { 
          this.descHora = "06:55";
        }
        else if (horario 85) { 
          this.descHora = "07:00";}
        }
        else if (horario 86) { 
          this.descHora = "07:05";}
        }
        else if (horario 87) { 
          this.descHora = "07:10";
        }
        else if (horario 88) { 
          this.descHora = "07:15";
        }
        else if (horario 89) { 
          this.descHora = "07:20";
        } 
        else if (horario 90) { 
          this.descHora = "07:25";
        }
         else if (horario 91) { 
          this.descHora = "07:30";
        }
        else if (horario 92) { 
          this.descHora = "07:35";
         }
        else if (horario 93) { 
          this.descHora = "07:40";
        }
        else if (horario 94) { 
          this.descHora = "07:45";}
        }
        else if (horario 95) { 
          this.descHora = "07:50";}
        }
        else if (horario 96) { 
          this.descHora = "07:55";
        }
        else if (horario 97) { 
          this.descHora = "08:00";
        }
        else if (horario 98) { 
          this.descHora = "08:05";
        } 
        else if (horario 99) { 
          this.descHora = "08:10";
        }
         else if (horario 100) { 
          this.descHora = "08:15";
        }
        else if (horario 101) { 
          this.descHora = "08:20";
         }
        else if (horario 102) { 
          this.descHora = "08:25";
        }
        else if (horario 103) { 
          this.descHora = "08:30";}
        }
        else if (horario 104) { 
          this.descHora = "08:35";}
        }
        else if (horario 105) { 
          this.descHora = "08:40";
        }
        else if (horario 106) { 
          this.descHora = "08:45";
        }
        else if (horario 107) { 
          this.descHora = "08:50";
        } 
        else if (horario 108) { 
          this.descHora = "08:55";
        }
         else if (horario 109) { 
          this.descHora = "09:00";
        }
        else if (horario 110) { 
          this.descHora = "09:05";
         }
        else if (horario 111) { 
          this.descHora = "09:10";
        }
        else if (horario 112) { 
          this.descHora = "09:15";}
        }
        else if (horario 113) { 
          this.descHora = "09:20";}
        }
        else if (horario 114) { 
          this.descHora = "09:25";
        }
        else if (horario 115) { 
          this.descHora = "09:30";
        }
        else if (horario 116) { 
          this.descHora = "09:35";
          } 
        else if (horario 117) { 
          this.descHora = "09:40";
        }
         else if (horario 118) { 
          this.descHora = "09:45";
        }
        else if (horario 119) { 
          this.descHora = "09:50";
         }
        else if (horario 120) { 
          this.descHora = "09:55";
        }
        else if (horario 121) { 
          this.descHora = "10:00";}
        }
        else if (horario 122) { 
          this.descHora = "04:05";}
        }
        else if (horario 123) { 
          this.descHora = "10:10";
        }
        else if (horario 124) { 
          this.descHora = "10:15";
        }
        else if (horario 125) { 
          this.descHora = "10:20";
        } 
        else if (horario 126) { 
          this.descHora = "10:25";
        }
         else if (horario 127) { 
          this.descHora = "10:30";
        }
        else if (horario 128) { 
          this.descHora = "10:35";
         }
        else if (horario 129) { 
          this.descHora = "10:40";
        }
        else if (horario 130) { 
          this.descHora = "10:45";}
        }
        else if (horario 131) { 
          this.descHora = "10:50";}
        }
        else if (horario 132) { 
          this.descHora = "10:55";
        }
        else if (horario 133) { 
          this.descHora = "11:00";
        }
        else if (horario 134) { 
          this.descHora = "11:05";
        } 
        else if (horario 135) { 
          this.descHora = "11:10";
        }
         else if (horario 136) { 
          this.descHora = "11:15";
        }
        else if (horario 137) { 
          this.descHora = "11:20";
         }
        else if (horario 138) { 
          this.descHora = "11:25";
        }
        else if (horario 139) { 
          this.descHora = "11:30";}
        }
        else if (horario 140) { 
          this.descHora = "11:35";}
        }
        else if (horario 141) { 
          this.descHora = "11:40";
        }
        else if (horario 142) { 
          this.descHora = "11:45";
        }
        else if (horario 143) { 
          this.descHora = "11:50";
        } 
        else if (horario 144) { 
          this.descHora = "11:55";
        }
         else if (horario 145) { 
          this.descHora = "12:00";
        }
        else if (horario 146) { 
          this.descHora = "12:05";
         }
        else if (horario 147) { 
          this.descHora = "12:10";
        }
        else if (horario 148) { 
          this.descHora = "12:15";}
        }
        else if (horario 149) { 
          this.descHora = "12:20";}
        }
        else if (horario 150) { 
          this.descHora = "12:25";
        }
        else if (horario 151) { 
          this.descHora = "12:30";
        }
        else if (horario 152) { 
          this.descHora = "12:35";
          }
        else if (horario 153) { 
          this.descHora = "12:40";
        } 
        else if (horario 154) { 
          this.descHora = "12:45";
        }
         else if (horario 155) { 
          this.descHora = "12:50";
        }
        else if (horario 156) { 
          this.descHora = "12:55";
         }
        else if (horario 157) { 
          this.descHora = "13:00";
        }
        else if (horario 158) { 
          this.descHora = "13:05";}
        }
        else if (horario 159) { 
          this.descHora = "13:10";}
        }
        else if (horario 160) { 
          this.descHora = "13:15";
        }
        else if (horario 161) { 
          this.descHora = "13:20";
        }
        else if (horario 162) { 
          this.descHora = "13:25";
        } 
        else if (horario 163) { 
          this.descHora = "13:30";
        }
         else if (horario 164) { 
          this.descHora = "13:35";
        }
        else if (horario 165) { 
          this.descHora = "13:40";
         }
        else if (horario 166) { 
          this.descHora = "13:45";
        }
        else if (horario 167) { 
          this.descHora = "13:50";}
        }
        else if (horario 168) { 
          this.descHora = "13:55";
        }
    	
    }
    
    public int getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * @return the horario
     */
    public int getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(int horario) {
        this.horario = horario;
    }

    /**
     * @return the musica
     */
    public Musica getMusica() {
        return musica;
    }

    /**
     * @param musica the musica to set
     */
    public void setMusica(Musica musica) {
        this.musica = musica;
    }
    
    public String getDescHora() {
    	
    	return descHora;
    }
    
    
    
    public String dscrição(){
    	
    	return getDescHora() + " " + getMusica().getNome() + " " + getMusica().getNomeArtista();
    	
    }
}
