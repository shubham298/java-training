
import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class freeLancer implements Serializable{

	
	private String name,skill;
	private Integer exp,id;
	public freeLancer()
	{}
	public freeLancer(String alpha,String beta, Integer cosmo, Integer gama)
	{
	name=alpha;
	skill=beta;
	exp=cosmo;
	id=gama;

	}
	public String toString()
	{
	return name+ " "+skill+" "+exp+" "+id;
	}
@XmlElement
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	@XmlElement
	public String getSkill() {
	return skill;
	}
	public void setSkill(String skill) {
	this.skill = skill;
	}
	@XmlAttribute
	public Integer getExp() {
	return exp;
	}
	
	public void setExp(Integer exp) {
	this.exp = exp;
	}
	@XmlElement
	public Integer getId() {
	return id;
	}
	public void setId(Integer id) {
	this.id = id;
	}


	}  

