package co.edu.iudigital.app.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
//importo estos paquetes
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity 
@Table(name="gender")
 
public class Gender implements Serializable{
	
     @Id
     @Column(name = "gender_id")
	//para importar los atributos de la tabla films a este framework
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
