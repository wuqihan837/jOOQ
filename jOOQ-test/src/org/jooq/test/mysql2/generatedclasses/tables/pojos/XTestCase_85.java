/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "x_test_case_85", schema = "test2")
public class XTestCase_85 implements java.io.Serializable {

	private static final long serialVersionUID = -2084546144;

	private java.lang.Integer id;
	private java.lang.Integer xUnusedId;
	private java.lang.String  xUnusedName;

	public XTestCase_85() {}

	public XTestCase_85(
		java.lang.Integer id,
		java.lang.Integer xUnusedId,
		java.lang.String  xUnusedName
	) {
		this.id = id;
		this.xUnusedId = xUnusedId;
		this.xUnusedName = xUnusedName;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "x_unused_id", precision = 10)
	public java.lang.Integer getXUnusedId() {
		return this.xUnusedId;
	}

	public void setXUnusedId(java.lang.Integer xUnusedId) {
		this.xUnusedId = xUnusedId;
	}

	@javax.persistence.Column(name = "x_unused_name", length = 10)
	public java.lang.String getXUnusedName() {
		return this.xUnusedName;
	}

	public void setXUnusedName(java.lang.String xUnusedName) {
		this.xUnusedName = xUnusedName;
	}
}
