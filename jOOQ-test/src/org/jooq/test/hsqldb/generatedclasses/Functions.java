/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all stored functions in PUBLIC
 *
 * @deprecated : 1.6.8 [#852] - Use {@link Routines} instead
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
@Deprecated
public final class Functions {

	/**
	 * Invoke F317
	 *
	 * @param p1
	 * @param p2
	 * @param p3
	 * @param p4
	 */
	public static java.lang.Integer f317(org.jooq.Configuration configuration, java.lang.Integer p1, java.lang.Integer p2, java.lang.Integer p3, java.lang.Integer p4) throws java.sql.SQLException {
		org.jooq.test.hsqldb.generatedclasses.routines.F317 f = new org.jooq.test.hsqldb.generatedclasses.routines.F317();
		f.setP1(p1);
		f.setP2(p2);
		f.setP3(p3);
		f.setP4(p4);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get F317 as a field
	 *
	 * @param p1
	 * @param p2
	 * @param p3
	 * @param p4
	 */
	public static org.jooq.Field<java.lang.Integer> f317(java.lang.Integer p1, java.lang.Integer p2, java.lang.Integer p3, java.lang.Integer p4) {
		org.jooq.test.hsqldb.generatedclasses.routines.F317 f = new org.jooq.test.hsqldb.generatedclasses.routines.F317();
		f.setP1(p1);
		f.setP2(p2);
		f.setP3(p3);
		f.setP4(p4);

		return f.asField();
	}

	/**
	 * Get F317 as a field
	 *
	 * @param p1
	 * @param p2
	 * @param p3
	 * @param p4
	 */
	public static org.jooq.Field<java.lang.Integer> f317(org.jooq.Field<java.lang.Integer> p1, org.jooq.Field<java.lang.Integer> p2, org.jooq.Field<java.lang.Integer> p3, org.jooq.Field<java.lang.Integer> p4) {
		org.jooq.test.hsqldb.generatedclasses.routines.F317 f = new org.jooq.test.hsqldb.generatedclasses.routines.F317();
		f.setP1(p1);
		f.setP2(p2);
		f.setP3(p3);
		f.setP4(p4);

		return f.asField();
	}

	/**
	 * Invoke F_ARRAYS1
	 *
	 * @param inArray
	 */
	public static java.lang.Integer[] fArrays1(org.jooq.Configuration configuration, java.lang.Integer[] inArray) throws java.sql.SQLException {
		org.jooq.test.hsqldb.generatedclasses.routines.FArrays1 f = new org.jooq.test.hsqldb.generatedclasses.routines.FArrays1();
		f.setInArray(inArray);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get F_ARRAYS1 as a field
	 *
	 * @param inArray
	 */
	public static org.jooq.Field<java.lang.Integer[]> fArrays1(java.lang.Integer[] inArray) {
		org.jooq.test.hsqldb.generatedclasses.routines.FArrays1 f = new org.jooq.test.hsqldb.generatedclasses.routines.FArrays1();
		f.setInArray(inArray);

		return f.asField();
	}

	/**
	 * Get F_ARRAYS1 as a field
	 *
	 * @param inArray
	 */
	public static org.jooq.Field<java.lang.Integer[]> fArrays1(org.jooq.Field<java.lang.Integer[]> inArray) {
		org.jooq.test.hsqldb.generatedclasses.routines.FArrays1 f = new org.jooq.test.hsqldb.generatedclasses.routines.FArrays1();
		f.setInArray(inArray);

		return f.asField();
	}

	/**
	 * Invoke F_ARRAYS2
	 *
	 * @param inArray
	 */
	public static java.lang.Long[] fArrays2(org.jooq.Configuration configuration, java.lang.Long[] inArray) throws java.sql.SQLException {
		org.jooq.test.hsqldb.generatedclasses.routines.FArrays2 f = new org.jooq.test.hsqldb.generatedclasses.routines.FArrays2();
		f.setInArray(inArray);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get F_ARRAYS2 as a field
	 *
	 * @param inArray
	 */
	public static org.jooq.Field<java.lang.Long[]> fArrays2(java.lang.Long[] inArray) {
		org.jooq.test.hsqldb.generatedclasses.routines.FArrays2 f = new org.jooq.test.hsqldb.generatedclasses.routines.FArrays2();
		f.setInArray(inArray);

		return f.asField();
	}

	/**
	 * Get F_ARRAYS2 as a field
	 *
	 * @param inArray
	 */
	public static org.jooq.Field<java.lang.Long[]> fArrays2(org.jooq.Field<java.lang.Long[]> inArray) {
		org.jooq.test.hsqldb.generatedclasses.routines.FArrays2 f = new org.jooq.test.hsqldb.generatedclasses.routines.FArrays2();
		f.setInArray(inArray);

		return f.asField();
	}

	/**
	 * Invoke F_ARRAYS3
	 *
	 * @param inArray
	 */
	public static java.lang.String[] fArrays3(org.jooq.Configuration configuration, java.lang.String[] inArray) throws java.sql.SQLException {
		org.jooq.test.hsqldb.generatedclasses.routines.FArrays3 f = new org.jooq.test.hsqldb.generatedclasses.routines.FArrays3();
		f.setInArray(inArray);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get F_ARRAYS3 as a field
	 *
	 * @param inArray
	 */
	public static org.jooq.Field<java.lang.String[]> fArrays3(java.lang.String[] inArray) {
		org.jooq.test.hsqldb.generatedclasses.routines.FArrays3 f = new org.jooq.test.hsqldb.generatedclasses.routines.FArrays3();
		f.setInArray(inArray);

		return f.asField();
	}

	/**
	 * Get F_ARRAYS3 as a field
	 *
	 * @param inArray
	 */
	public static org.jooq.Field<java.lang.String[]> fArrays3(org.jooq.Field<java.lang.String[]> inArray) {
		org.jooq.test.hsqldb.generatedclasses.routines.FArrays3 f = new org.jooq.test.hsqldb.generatedclasses.routines.FArrays3();
		f.setInArray(inArray);

		return f.asField();
	}

	/**
	 * Invoke F_AUTHOR_EXISTS
	 *
	 * @param authorName
	 */
	public static java.lang.Integer fAuthorExists(org.jooq.Configuration configuration, java.lang.String authorName) throws java.sql.SQLException {
		org.jooq.test.hsqldb.generatedclasses.routines.FAuthorExists f = new org.jooq.test.hsqldb.generatedclasses.routines.FAuthorExists();
		f.setAuthorName(authorName);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get F_AUTHOR_EXISTS as a field
	 *
	 * @param authorName
	 */
	public static org.jooq.Field<java.lang.Integer> fAuthorExists(java.lang.String authorName) {
		org.jooq.test.hsqldb.generatedclasses.routines.FAuthorExists f = new org.jooq.test.hsqldb.generatedclasses.routines.FAuthorExists();
		f.setAuthorName(authorName);

		return f.asField();
	}

	/**
	 * Get F_AUTHOR_EXISTS as a field
	 *
	 * @param authorName
	 */
	public static org.jooq.Field<java.lang.Integer> fAuthorExists(org.jooq.Field<java.lang.String> authorName) {
		org.jooq.test.hsqldb.generatedclasses.routines.FAuthorExists f = new org.jooq.test.hsqldb.generatedclasses.routines.FAuthorExists();
		f.setAuthorName(authorName);

		return f.asField();
	}

	/**
	 * Invoke F_GET_ONE_CURSOR
	 *
	 * @param bookIds
	 */
	public static org.jooq.Result<org.jooq.Record> fGetOneCursor(org.jooq.Configuration configuration, java.lang.Integer[] bookIds) throws java.sql.SQLException {
		org.jooq.test.hsqldb.generatedclasses.routines.FGetOneCursor f = new org.jooq.test.hsqldb.generatedclasses.routines.FGetOneCursor();
		f.setBookIds(bookIds);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get F_GET_ONE_CURSOR as a field
	 *
	 * @param bookIds
	 */
	public static org.jooq.Field<org.jooq.Result<org.jooq.Record>> fGetOneCursor(java.lang.Integer[] bookIds) {
		org.jooq.test.hsqldb.generatedclasses.routines.FGetOneCursor f = new org.jooq.test.hsqldb.generatedclasses.routines.FGetOneCursor();
		f.setBookIds(bookIds);

		return f.asField();
	}

	/**
	 * Get F_GET_ONE_CURSOR as a field
	 *
	 * @param bookIds
	 */
	public static org.jooq.Field<org.jooq.Result<org.jooq.Record>> fGetOneCursor(org.jooq.Field<java.lang.Integer[]> bookIds) {
		org.jooq.test.hsqldb.generatedclasses.routines.FGetOneCursor f = new org.jooq.test.hsqldb.generatedclasses.routines.FGetOneCursor();
		f.setBookIds(bookIds);

		return f.asField();
	}

	/**
	 * Invoke F_NUMBER
	 *
	 * @param n
	 */
	public static java.lang.Integer fNumber(org.jooq.Configuration configuration, java.lang.Integer n) throws java.sql.SQLException {
		org.jooq.test.hsqldb.generatedclasses.routines.FNumber f = new org.jooq.test.hsqldb.generatedclasses.routines.FNumber();
		f.setN(n);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get F_NUMBER as a field
	 *
	 * @param n
	 */
	public static org.jooq.Field<java.lang.Integer> fNumber(java.lang.Integer n) {
		org.jooq.test.hsqldb.generatedclasses.routines.FNumber f = new org.jooq.test.hsqldb.generatedclasses.routines.FNumber();
		f.setN(n);

		return f.asField();
	}

	/**
	 * Get F_NUMBER as a field
	 *
	 * @param n
	 */
	public static org.jooq.Field<java.lang.Integer> fNumber(org.jooq.Field<java.lang.Integer> n) {
		org.jooq.test.hsqldb.generatedclasses.routines.FNumber f = new org.jooq.test.hsqldb.generatedclasses.routines.FNumber();
		f.setN(n);

		return f.asField();
	}

	/**
	 * Invoke F_ONE
	 *
	 */
	public static java.lang.Integer fOne(org.jooq.Configuration configuration) throws java.sql.SQLException {
		org.jooq.test.hsqldb.generatedclasses.routines.FOne f = new org.jooq.test.hsqldb.generatedclasses.routines.FOne();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get F_ONE as a field
	 *
	 */
	public static org.jooq.Field<java.lang.Integer> fOne() {
		org.jooq.test.hsqldb.generatedclasses.routines.FOne f = new org.jooq.test.hsqldb.generatedclasses.routines.FOne();

		return f.asField();
	}

	/**
	 * No instances
	 */
	private Functions() {}
}
