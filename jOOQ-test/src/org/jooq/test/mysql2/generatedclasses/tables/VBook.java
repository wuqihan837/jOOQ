/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VBook extends org.jooq.impl.TableImpl<org.jooq.test.mysql2.generatedclasses.tables.records.VBookRecord> {

	private static final long serialVersionUID = 902848983;

	/**
	 * The singleton instance of <code>test2.v_book</code>
	 */
	public static final org.jooq.test.mysql2.generatedclasses.tables.VBook V_BOOK = new org.jooq.test.mysql2.generatedclasses.tables.VBook();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.VBookRecord> getRecordType() {
		return org.jooq.test.mysql2.generatedclasses.tables.records.VBookRecord.class;
	}

	/**
	 * The column <code>test2.v_book.ID</code>. The book ID
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.VBookRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>test2.v_book.AUTHOR_ID</code>. The author ID in entity 'author'
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.VBookRecord, java.lang.Integer> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>test2.v_book.co_author_id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.VBookRecord, java.lang.Integer> CO_AUTHOR_ID = createField("co_author_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>test2.v_book.DETAILS_ID</code>. Some more details about the book
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.VBookRecord, java.lang.Integer> DETAILS_ID = createField("DETAILS_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>test2.v_book.TITLE</code>. The book's title
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.VBookRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.CLOB.length(65535).nullable(false), this);

	/**
	 * The column <code>test2.v_book.PUBLISHED_IN</code>. The year the book was published in
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.VBookRecord, java.lang.Integer> PUBLISHED_IN = createField("PUBLISHED_IN", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>test2.v_book.LANGUAGE_ID</code>. The language of the book
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.VBookRecord, java.lang.Integer> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>test2.v_book.CONTENT_TEXT</code>. Some textual content of the book
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.VBookRecord, java.lang.String> CONTENT_TEXT = createField("CONTENT_TEXT", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The column <code>test2.v_book.CONTENT_PDF</code>. Some binary content of the book
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.VBookRecord, byte[]> CONTENT_PDF = createField("CONTENT_PDF", org.jooq.impl.SQLDataType.BLOB, this);

	/**
	 * The column <code>test2.v_book.STATUS</code>. The book's stock status
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.VBookRecord, org.jooq.test.mysql2.generatedclasses.enums.VBookStatus> STATUS = createField("STATUS", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(org.jooq.test.mysql2.generatedclasses.enums.VBookStatus.class), this);

	/**
	 * Create a <code>test2.v_book</code> table reference
	 */
	public VBook() {
		super("v_book", org.jooq.test.mysql2.generatedclasses.Test2.TEST2);
	}

	/**
	 * Create an aliased <code>test2.v_book</code> table reference
	 */
	public VBook(java.lang.String alias) {
		super(alias, org.jooq.test.mysql2.generatedclasses.Test2.TEST2, org.jooq.test.mysql2.generatedclasses.tables.VBook.V_BOOK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.mysql2.generatedclasses.tables.VBook as(java.lang.String alias) {
		return new org.jooq.test.mysql2.generatedclasses.tables.VBook(alias);
	}
}
