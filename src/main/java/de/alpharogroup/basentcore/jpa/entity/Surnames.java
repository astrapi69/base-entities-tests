package de.alpharogroup.basentcore.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The entity class {@link Surnames} holds the data for surnames
 */
@Entity
@Table(name = "surnames")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Surnames extends UniqueNameEntity<Integer> implements Cloneable
{

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