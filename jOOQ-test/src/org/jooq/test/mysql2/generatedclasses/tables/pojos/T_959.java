/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "t_959", schema = "test2")
public class T_959 implements java.io.Serializable {

	private static final long serialVersionUID = 1804845421;

	private org.jooq.test.mysql2.generatedclasses.enums.T_959JavaKeywords      javaKeywords;
	private org.jooq.test.mysql2.generatedclasses.enums.T_959SpecialCharacters specialCharacters;

	public T_959() {}

	public T_959(
		org.jooq.test.mysql2.generatedclasses.enums.T_959JavaKeywords      javaKeywords,
		org.jooq.test.mysql2.generatedclasses.enums.T_959SpecialCharacters specialCharacters
	) {
		this.javaKeywords = javaKeywords;
		this.specialCharacters = specialCharacters;
	}

	@javax.persistence.Column(name = "java_keywords", length = 12)
	public org.jooq.test.mysql2.generatedclasses.enums.T_959JavaKeywords getJavaKeywords() {
		return this.javaKeywords;
	}

	public void setJavaKeywords(org.jooq.test.mysql2.generatedclasses.enums.T_959JavaKeywords javaKeywords) {
		this.javaKeywords = javaKeywords;
	}

	@javax.persistence.Column(name = "special_characters", length = 5)
	public org.jooq.test.mysql2.generatedclasses.enums.T_959SpecialCharacters getSpecialCharacters() {
		return this.specialCharacters;
	}

	public void setSpecialCharacters(org.jooq.test.mysql2.generatedclasses.enums.T_959SpecialCharacters specialCharacters) {
		this.specialCharacters = specialCharacters;
	}
}
