package com.myspace.cep_1;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
@org.kie.api.definition.type.Role(org.kie.api.definition.type.Role.Type.EVENT)
@org.kie.api.definition.type.Timestamp("time")
@org.kie.api.definition.type.Duration("duration")
public class AresEvent implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "ALERT_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "ALERT_ID_SEQ", name = "ALERT_ID_GENERATOR")
	private java.lang.Long id;

	private java.lang.Long duration;

	private java.lang.Long time;

	private java.lang.String status;

	public AresEvent() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.Long getDuration() {
		return this.duration;
	}

	public void setDuration(java.lang.Long duration) {
		this.duration = duration;
	}

	public java.lang.Long getTime() {
		return this.time;
	}

	public void setTime(java.lang.Long time) {
		this.time = time;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public AresEvent(java.lang.Long id, java.lang.Long duration,
			java.lang.Long time, java.lang.String status) {
		this.id = id;
		this.duration = duration;
		this.time = time;
		this.status = status;
	}

}