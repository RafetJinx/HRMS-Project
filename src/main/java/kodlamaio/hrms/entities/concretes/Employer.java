package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name= "employers")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
public class Employer extends User{
	
	@Column(name="campany_name")
	private String company_name;
	
	@Column(name="website_adress")
	private String website_adress;
	
	@Column(name="domain_website_adress_mail")
	private String domain_website_adress_mail;
	
	@Column(name="phone_number")
	private String phone_number;

}