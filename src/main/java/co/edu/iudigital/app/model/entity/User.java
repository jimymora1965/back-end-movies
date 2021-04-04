package co.edu.iudigital.app.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id") 
	private int userId;
	private String name;
	private String email;
	private String password;
	
	// es una variable de fecha entonces la declaro asi como sigue.
	//como se llama diferente a la tabla de la base de datos entonces le creo la columna
	@Column(name = "create_at") 
	private LocalDateTime createAt;
	
	//en la tabla user profile_id es una llave foranea que viene de la tabla profile OJO CON ESTO:
	// como profiled_Id es una llave foranea en la tabla no uso @Column sino  un join y le 
	//genero la relacion de muchos a uno. (ojo cuando la variable es llave foranea le creo un join)
	
	@ManyToOne
	@JoinColumn(name = "profile_id")
	private Profile profileId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDateTime getCreateAt() {
		return createAt;
	}

	public void setCreateAt(LocalDateTime createAt) {
		this.createAt = createAt;
	}

	public Profile getProfileId() {
		return profileId;
	}

	public void setProfileId(Profile profileId) {
		this.profileId = profileId;
	}
	
	
	

}
