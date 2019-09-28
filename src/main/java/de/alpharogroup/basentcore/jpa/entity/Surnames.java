package de.alpharogroup.basentcore.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The entity class {@link Surnames} holds the data for surnames
 */
@Entity
@Table(name = Surnames.TABLE_NAME)
@Getter
@Setter
@ToString
@NoArgsConstructor
@GenericGenerator(
	name = BaseSequenceEntity.GENERIC_GENERATOR_NAME,
	strategy = "de.alpharogroup.basentcore.jpa.generator.IdentifiableSequenceStyleGenerator",
	parameters = @org.hibernate.annotations.Parameter(
		name = SequenceStyleGenerator.SEQUENCE_PARAM,
		value = Surnames.TABLE_NAME + SequenceStyleGenerator.DEF_SEQUENCE_SUFFIX
	)
)
public class Surnames extends UniqueNameEntity<Integer> implements Cloneable
{

	public static final String TABLE_NAME = "surnames";

	/** Serial Version UID */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new {@link Surnames} entity object.
	 *
	 * @param name
	 *            the name
	 */
	@Builder Surnames(String name)
	{
		super(name);
	}

}